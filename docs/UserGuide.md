---
layout: page
title: User Guide
---

* Table of Contents
{:toc}


## **Introduction**
### About this application
Teaching Assistant Assistant (TAA) is a desktop app for managing teaching assistant activities, optimized for use via a Command Line Interface (CLI) while still retaining the benefits of a Graphical User Interface (GUI).

With TAA, you can easily track student attendance and grades using just a keyboard, eliminating the need for multiple clicks.
You can even view grade statistics without the use of a dedicated data analysis application! 

<!-- maybe can add image here -->

Say goodbye to the hassle of managing teaching assistant tasks and hello to increased efficiency with TAA!

### Objectives of this guide
This guide is written to provide comprehensive instructions for users to use TAA effectively and efficiently.
More advanced users can also benefit from this guide by following the additional information provided in each feature.

If you are a teaching assistant who can type fast, this guide is for you!

### Using the guide
#### Navigation
To use the guide, you may wish to take a look at the table of contents at the start of the page.
You can click on the relevant sections you wish to visit, and the hyperlink will bring you straight to the relevant section.

Alternatively, you may wish to use the built-in search function in your browser (<Button>Ctrl</Button> + <Button>F</Button>) to look for specific keywords relevant to your query.

#### Formatting
Aside from the usual text format, this guide includes certain special formats that are used for different purposes.

##### Callouts
 
Callouts are identified by a coloured box containing some text. 

**Information**
<div markdown="span" class="alert alert-primary">
:information_source: **Info:** Provides information that is not essential, but may be useful (especially for advanced users!). 
</div>

**Tip**
<div markdown="span" class="alert alert-success">
:bulb: **Tip:** Provides recommendations on how you can use the app more effectively.
</div>

**Note**
<div markdown="span" class="alert alert-warning">
:page_with_curl: **Note:** Contains information on how the application is designed to be used.
</div>

**Warning**
<div markdown="span" class="alert alert-danger">
:warning: **Warning:**  Describes actions that may cause the application to function unexpectedly.
</div>

##### Syntax highlighting
Text contained within a `grey background` are used to denote either of the following:
- commands that can be entered into the command bar 
- file names
- command line commands, to be run in the [terminal](#glossary) of the host machine

##### Keys
Keys such as <Button>A</Button> <Button>B</Button> <Button>C</Button> are used to denote keys on the keyboard that can be pressed to perform certain things.

They can also be used to denote keys that should be held together, at the same time. For example, <Button>Ctrl</Button> + <Button>F</Button> indicates that the user can press both the Ctrl and F keys together to perform a given action.

--------------------------------------------------------------------------------------------------------------------

## **Quick start**

1. Ensure you have Java 11 or above installed in your Computer.

1. Download the latest `taa.jar` from [here](https://github.com/AY2223S2-CS2103T-T14-4/tp/releases).

1. Copy the file to the folder you want to use as the _home folder_ for your TAA.

1. Open a command terminal, `cd` into the folder you put the jar file in, and use the `java -jar taa.jar` command to run the application.<br>
   A GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.<br><br>
   ![Ui](./images/Ui.png)
   <figcaption style="text-align:center"><em><strong>
   Figure 1
   </strong>
   : TAA window
   </em></figcaption>

1. Type the command in the command box and press Enter to execute it. e.g. typing `help` and pressing Enter will open the help window.<br>
   Some example commands you can try:

   * `list` : Lists all students.

   * `add_student n/John Doe cl/T01 cl/L02` : Adds a contact named `John Doe` to the Class Lists `T01` and `L02`.

   * `delete_student 3` : Deletes the 3rd student shown in the current list.

   * `exit` : Exits the app.

1. Refer to the [Features](#features) below for details of each command.

--------------------------------------------------------------------------------------------------------------------
## **Graphical User Interface**
![Labelled GUI](./images/Ui_labelled.png)
<figcaption style="text-align:center"><em><strong>
Figure 2
</strong>: 
Labelled components of the TAA GUI
</em></figcaption>

<br />
The purposes of each component, as labelled in Figure 2 above, are described in Table 1 below.
<br />

<div style="text-align:center"><strong>
Table 1
</strong>: 
Purposes of each GUI component
</div>

|     Component      |                              Purpose                               |
|:------------------:|:------------------------------------------------------------------:|
|    Command Box     |                 To accept commands from the user.                  |
|     Output Box     |     To display the result of the commands issued by the user.      |
| Class List Display | To display the list of students in the currently active class list |


<div markdown="span" class="alert alert-warning">
:page_with_curl: **Note:** To send your command, first type in your command in the command box. Then, press the <Button>Enter</Button> key to send it!
</div>

<div markdown="span" class="alert alert-primary">
:information_source: **Info:** The commands below will operate on the active class list being displayed in the Class List display. 
If the students being displayed are not the ones you wish to update, do remember to update the active class list before continuing.
</div>


--------------------------------------------------------------------------------------------------------------------

## **Features**
<div markdown="span" class="alert alert-warning">
:page_with_curl: **Note:** The commands stated below will follow the syntax defined in Table 2. Come back here if you're ever confused on what the symbols mean!
</div>

<div style="text-align:center"><strong>
Table 2
</strong>: 
Purposes of each GUI component
</div>

|            Syntax            |                                                                      Explanation                                                                       |
|:----------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------:|
|           `prefix/`           |           Prefixes that are used to separate the parameters supplied by the user. These are usually lower-case and are 1-2 characters long.            |
|         `UPPER_CASE`         |            [Parameters](#glossary) to be specified by the user. These parameters are compulsory if they are not wrapped in square brackets.            |
| `[Items in square brackets]` |                                       Optional parameters. The command will work fine if these are not included.                                       |
|   `param...`/`[param]...`    | More than one of the parameter `param` is accepted. The first case allows for 1 or more `params`, while the second case allows for 0 or more `params`. |


<div markdown="span" class="alert alert-success">
:bulb: **Tip:** Parameters can be specified in any order!
</div>

<div markdown="span" class="alert alert-primary">
:information_source: **Info:** If a parameter is expected to be passed in only once, but is specified multiple times by the user, onle the last occurrence of the parameter will be taken by the application.
</div>

<div markdown="span" class="alert alert-primary">
:information_source: **Info:** Extraneous parameters for commands that do not take in parameters will be ignored.
</div>

### Attendance
For attendance, you can make the following calls:
* markAtd
* unmarkAtd

#### Mark attendance: `markAtd`
Marks the attendance of a student for that week<br>
Format: `markAtd STUDENT_ID w/WEEK_NUMBER`<br>

Examples
* `markAtd 1 w/1`
* `markAtd 2 w/1`

#### Unmark attendance: `unmarkAtd`
Unmarks the attendance of a student for that week<br>
Format: `unmarkAtd STUDENT_ID w/WEEK_NUMBER`<br>

Examples
* `unmarkAtd 1 w/1`
* `unmarkAtd 2 w/1`

### Participation
For participation, you can make the following calls:
* insert

#### Insert participation points: `insertPP`
Insert attendance of a student for that week<br>
Format: `insertPP STUDENT_ID w/WEEK_NUMBER pp/POINTS`
Examples
* `insertPP 1 w/1 pp/200`
* `insertPP 2 w/1 pp/300`

### Assignments

For assignments, you can make the following calls:
* add_asgn
* delete_asgn
* grade
* ungrade
* list_asgn

### Add Assignment: `add_asgn`
Adds an assignment with name, total marks. 
If total marks for the assignment is unspecified, a default value of 100 will be given.
All assignments will initially be ungraded.
<br>
Format: `add_asgn n/NAME [m/TOTAL_MARKS]`<br>
Example:
* `add_asgn n/Lab_1`
* `add_asgn n/Lab_2 m/50`

### Delete Assignment: `delete_asgn`
Deletes the assignment of assignment_name you provided. If the assignment is not found, returns an error.<br>
Format: `delete n/ASSIGNMENT_ID`<br>

Example:
* `delete_asgn n/Lab_1`

### Grade Assignment: `grade`
Grades the submission of assignment_name and student_id with a score you provide. 
You can also indicate whether a submission is late by using the "late/" flag at the end.
<br>
Format: `grade n/ASSIGNMENT_NAME i/STUDENT_ID m/SCORE [late/]`<br>
Example:
* `grade n/Lab_1 i/2 m/20`
* `grade n/Lab_1 i/3 m/30 late/`

### Ungrade Assignment: `ungrade`
Resets the grade of the submission of assignment_name and student_id. It will also reset
the late submission status of the submission, if the submission was marked as late.
<br>
Format: `ungrade n/ASSIGNMENT_ID i/STUDENT_ID`<br>
Example:
* `ungrade n/Lab_1 i/2`

### List all assignments: `list_asgn`
Lists all assignments, submissions and their respective information.
Format: `list_asgn`

## Class List
For class lists, you can call the following commands:
- Create class list: `create`
- (Random) Groupings: `rand_grp`
- Adding a student: `add`
- Deleting a student: `delete`
- Listing all students: `list`
- Find student: `find`

#### Create a class list: `create`
Creates a class list to store the information about a group of students.

Format: `create_class LIST_NAME [STUDENT_NAMES]`
- The argument `LIST_NAME` should be the name of the new class list
  The argument `[STUDENT_NAMES]` should consist of a sequence of student names, separated by commas.


Examples:
- `create_class cs2103t-t14 Alex, John, Bonnie, Clyde` creates a class list of size 4 with 4 students: Alex, John, Bonnie and Clyde.
- `create_class cs6244` creates an empty class list.


#### Group students at random: `rand_grp` [coming soon]
Forms random groups of a specified size within a given class list.

Format: `rand_grp CLASS_LIST GROUP_SIZE`
- The argument `CLASS_LIST` should be the name of a given class list
- The search for `CLASS_LIST` is case-insensitive. e.g. cs2103T will match CS2103T
- The argument `GROUP_SIZE` will determine the size of the groups to be formed.


Examples:
- `rand_grp cs2103t-t14 2` returns: Group 1: Alex, John; Group 2: Bonnie, Clyde
- `rand_grp cs2103t-t14 3` returns: Group 1: Alex, John, Clyde; Group 2: Bonnie

#### Add a student: `add_student`
Adds a student to a given class list.

Format: `add_student n/STUDENT_NAME cl/CLASS_NAME...`
- The argument `STUDENT_NAME` should be the name of the student to be added
- The argument `CLASS_NAME` should be the name of a given class the student belongs to

Examples:
- `add n/Tom cl/cs2103t-t14` adds Tom to the class CS2103T-T14
- `add n/Harry cl/cs6244` adds Harry to the class CS6244

<div markdown="span" class="alert alert-success">
:bulb: **Tip:** You can add a student to multiple classes at once! Just specify multiple `cl/` prefixes in your command. e.g. `add n/Harry cl/cs6244 cl/cs1231s`
</div>

<div markdown="span" class="alert alert-primary">
:information_source: **Info:** If the class list `CLASS_NAME` does not exist, it will automatically be created with student
`STUDENT_NAME` as its first student
</div>

#### Edit a student: `edit_student`
Edits a student in the active class list.

Format: `edit_student STUDENT_INDEX [n/STUDENT_NAME] [cl/CLASS_NAME]`
- The `STUDENT_INDEX` is the index of the student that is currently being shown on screen.
- At least one of the optional fields must be present. (i.e. either `STUDENT_NAME` and/or `CLASS_NAME`)

Examples:
- `edit_student 3 n/Barry Allen` changes the name of the 3rd student to "Barry Allen"
- `edit_student 5 cl/Tutorial_T14` assigns the 5th student only to the class "Tutorial_14"
- `edit_student 12 n/Tom Hanks cl/Lab_L11` changes the name of the 12th student to "Tom Hanks", and assigns
him to the class "Lab_L11"

<div markdown="span" class="alert alert-danger">
:warning: **Warning:**  The new fields will override the fields of the targeted student completely. i.e. to add an extra field, you will have to copy over the previous fields and add one additional parameter containing the new field to be added.
</div>

#### Delete a student: `delete_student`
Deletes a student from the active class list.

Format: `delete_student STUDENT_INDEX`
- The `STUDENT_INDEX` is the index of the student that is currently being shown on screen.

Examples:
- `delete_student 3` removes the 3rd student in the currently active/displayed class list

<div markdown="span" class="alert alert-warning">
:page_with_curl: **Note:** This command will delete the student with the given ID on the active class list, not from the global class list with all students obtained from using the `list` command.
</div>

#### List all students : `list` 
Lists all students tracked by TAA globally.

Format: `list`


#### Find a particular student : `find` [coming soon]
List the students in the class by their student number/name.

Format: `find FLAG STUDENT_NUMBER` or `find FLAG STUDENT_NAME`
- Flag -id refers to find by student number
- Flag -n refers to find by name
- The format of the command follows find flag String
- The name or student number of the student are not case-sensitive


Examples:
- find -name john lee
- find -id a0123456b


### CSV Parser

Stores and loads data in with CSV files.

* Import data in CSV format: `import`
* Export data in CSV format: `export`

Our CSV files follow the following format:
1. All CSV files are header-less. Student data has exactly 2 columns: name, tags.
2. If a student has no tags, a comma representing the tags column is still required because [if a column is defined as optional, it means that the column is required to exist, but the value can be blank.](https://www.ibm.com/docs/en/atlas-policy-suite/6.0.3?topic=files-rules-creating-populating-csv) 

Acceptable CSV format example:
```
Technoblade, Minecrafter Pig Anarchist
Meggy Spletzer,Inkling
John von Neumann,
```

#### Import data in CSV format: `import` [in dev]
Import data in CSV format from file.

Format: `import [FLAG] FILE_PATH`
* Flag -force overwrites records of existing students.
* Nothing is changed if file does not exist or file access denied.

#### Export data in CSV format: `export` [coming soon]
Export data in CSV format to file.

Format: `export [FLAG] FILE_PATH`
* If file exists, export is blocked unless -force flag is used. Otherwise, create file and export.
* Flag -force overwrites existing file.
* Nothing is changed if file access denied.

--------------------------------------------------------------------------------------------------------------------

## **Glossary**

|           Term           |                                                                               Explanation                                                                                | 
|:------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
|       Desktop App        |                           A software program that runs on a computer's desktop or laptop operating system, rather than through a web browser.                            |
|  Command Line Interface  |            A way of interacting with a computer program by typing in text commands instead of using a graphical user interface (GUI) with buttons and menus.             | 
| Graphical User Interface | A type of user interface that allows users to interact with a computer program using graphical elements such as buttons, menus, and icons instead of typing in commands. | 
|         Terminal         |                    Text-based interface used to interact with the computer's operating system. For Windows, it is usually called the Command Prompt.                     | 
|       Host Machine       |                                                    The computer that is used to run the software/program in question.                                                    | 
|        Parameter         |                                  A value that is passed in by the user. This value changes depending on what the user decides to enter.                                  | 
