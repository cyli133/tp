package taa.logic.commands;

import static java.util.Objects.requireNonNull;

import taa.logic.commands.exceptions.CommandException;
import taa.model.Model;

/**
 * Grades a student submission of an assignment.
 */
public class GradeCommand extends Command {

    public static final String COMMAND_WORD = "grade";

    public static final String MESSAGE_USAGE = "Format: grade n/{assignmentName} i/{studentId}"
            + " m/{marks} (optional: late/)";

    public static final String MESSAGE_SUCCESS = "Assignment %s, submission from student %d graded: %d mark(s) %s";
    private final String assignmentName;
    private final int studentId;
    private final int marks;
    private final boolean isLateSubmission;

    /**
     * @param assignmentName
     * @param studentId
     * @param marks
     */
    public GradeCommand(String assignmentName, int studentId, int marks, boolean isLateSubmission) {
        this.assignmentName = assignmentName;
        this.studentId = studentId;
        this.marks = marks;
        this.isLateSubmission = isLateSubmission;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        model.grade(assignmentName, studentId, marks, isLateSubmission);
        String late = isLateSubmission ? "(*Late Submission*)" : "";
        return new CommandResult(String.format(MESSAGE_SUCCESS, assignmentName, studentId, marks, late));
    }
}
