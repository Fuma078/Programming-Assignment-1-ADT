# Programming-Assignment-1-ADT
Programming Assignment in ADT & Solving Problem course that the program processes student information from a CSV file, offering functionality to sort the student names alphabetically and perform name searches.

* Author: Techit Wongkiti
* ID: 672115020

## Description
This program allows user to sort student data by:

* ID
* First name
* Last name

also allow user to search the student by First name and show the index where the name is located in the data.

## Table of Contents
1. [Installation](#installation)
2. [Usage](#usage)
3. [Features](#features)

## Installation
1. Save the source code in a file named `csvSorting.java`.
2. Prepare a `class_roaster67.csv` file with students data. Make sure that the data follows the correct format (e.g. ID, First Name, Last Name).
3. Compile the Java program:
```
javac csvSorting.java
```

## Usage
To use the program, follow these steps:

1. Run the program in your terminal.
2. The program will display options for sorting and searching:
- `-n` : sorting by Student ID.
- `-f` : sorting by First name.
- `-l` : sorting by Last name.
- `-s` : searching the student by First name.
3. Enter the option (e.g. `-f` for sorting by Student ID).
4. For the searching option (`-s`) enter the student First name when prompted.

Example interaction
```
Options for functions:
-n for sorting the student by ID
-f for sorting the student by First name
-l for sorting the student by Last name
-s for searching the student by First name
Choose function: -f
672115049 ANAWAT JANDEE
672115007 CHANCHAKORN JULLAPECH
672115006 CHANLACHAT PANYOYAI
672115008 CHANYA BUNRUEANG
672115005 CHETSADA KANKARN
672115009 CHIDNUCHA POBKEEREE
662115007 CHONCHANUN KHACHONPHURITHANAKUL
672115018 DALANPHOP KEAWSIRIPONG
672115004 JITTIPAT KAEWIJIT
672115001 KATIKA KANTHASON
672115002 KRITTAMETH TANSUWAN
662115039 MANAPAT KAEWLAI
672115039 METAVEE AEINJANG
672115010 NATANON SOMBOON
672115015 NATTAPON SUKKEAW
672115013 NATTHAN CHAMPATHIP
672115016 NATTHAPAT JAGKHURUANG
662115016 NATTHAPHUM CHAIKHAN
672115011 NATTHAPOOM SAENGKAEW
672115014 NATTIKORN SAE-SUE
672115028 NINA BURGER
672115012 NUT SUPAPORN
672115037 PHUTAWAN MUEANGMA
672115042 RANTICHA CHUMJAI
672115041 RAPHEEPHAT AEIPHINGCHAI
672115047 SAMAKOM MAKHIAO
672115046 SATTAPORN KOWARAKUN
622115040 SUCHANUN SIRIJANYA
672115048 SUKRITPONG WONGPANYA
672115024 TAT PUTJORN
672115020 TECHIT WONGKITI
672115019 THINNAPOP SRISOMBOON
672115044 VIDCHAYADA ABHICHARTTIBUTRA
672115045 VIRAWIT KONGTHONG
672115043 WASINPAT YANIN
```
Example of `-s` interaction
```
Options for functions:
-n for sorting the student by ID
-f for sorting the student by First name
-l for sorting the student by Last name
-s for searching the student by First name
Choose function: -s 
Enter name to search: Techit
Found at index: 21
```

## Features
1. Sorting Options: Allows sorting student data by:
    - ID
    - First name
    - Last name
2. Reading Student Data from a CSV File:

    - The program reads student data (ID, first name, and last name) from a CSV file, ignoring the first 7 lines of the file.
    
3. Sorting Options:

- The program provides sorting functionality based on different attributes of the student data:
    - Sort by ID: Sorts the students by their IDs.
    - Sort by First Name: Sorts the students alphabetically by their first names.
    - Sort by Last Name: Sorts the students alphabetically by their last names.
    
4. Searching by First Name:

    - Allows users to search for a student by their first name (case-insensitive).
    - Returns the index of the first matching record if found, or notifies the user if no match is found.
    
5. User-Friendly Menu:

   - Displays a clear menu of options for sorting and searching, enabling users to interact easily.
   
6. Custom Data Structure:

    - Utilizes a `Data` class to encapsulate student details (`ID`, `firstName`, `lastName`) for better code organization and reusability.
