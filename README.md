# Week 3 - Homework: Students and Courses

This homework will help you learn how to write Java classes according to the specification.

The objectives of this week are following:
* Programming abstraction (i.e., the Student and Course classes).
* Overloading constructor.
* Identify public and private interfaces.
* Simple Data encapsulation and data validation.
* Simple string matching using regular expression.
* Overriding the toString() method.

To complete the homework you need to meet following requirements:
* Write the Student and Course Java classes according the specifications.
* Write a readable, sensible, usable, beautiful code.
* Pass all the unit tests.

##Student Class
Attributes:
* Name : name of a student, CANNOT be empty (""), default value is "John Doe"
* Student ID : student id number, default value is "560610000", MUST be in the pattern of "5X061PNNN" where ...
    * X is a number in [6-9]
    * P is a number in [0-2]
    * N is a number in [0-9]
* Year of birth : birth year of a student, Must be larger than 1989, default value is "1990", will be used to calculate student's age later
* s : status of a student, can be "true" for active or "false" for inactive

Methods:

* Default constructor : takes NO argument, initializes all attributes to their DEFAULT value.
* Constructor2 : takes Name and Student ID as arguments, initializes the other attributes to their DEFAULT value.
* Constructor3 : takes Name, Student ID and Year of birth as arguments, initializes the other attributes to their DEFAULT value.
* Constructor4 : takes Name, Student ID, Year of birth and status as arguments, initializes the other attributes to their DEFAULT value.
* Set Methods : for modifying value of each property (4 methods)
    * Set methods for Name, Student ID and Year of birth attributes MUST satisfy the conditions specified above.
    * if the modified (new) value does not satisfy with the above conditions, use the CURRENT value.
* Get Methods : for reading value of each property (4 methods)
* toString() method : for printing the student object's state which returns a string in the following pattern:
```
      "Sanguan Sornjai (590611702) was born in 1999 is an INACTIVE student."
```

##Course Class
Attributes:
* Course name : name of the course, CANNOT be empty (""), default value is "TBA"
* Course ID : course id number, default value is "000000", MUST be in the pattern of "NNNNNN" where ...
    * N is a number in [0-9]
* Lecturer : name of lecturer(s), CANNOT be empty (""), default value is "TBA"
* Maximum #Student : maximum number of students, CANNOT be less than 10, default value is 30
* Current #Student : current number of students, MUST be in the range of [0-MAX], default value is 0

Methods:

* Default constructor : takes NO argument, initializes all attributes to their DEFAULT value.
* Constructor2 : takes Course name and Course ID as arguments, initializes the other attributes to their DEFAULT value.
* Constructor3 : takes Course name, Course ID and Lecturer as arguments, initializes the other attributes to their DEFAULT value.
* Constructor4 : takes Course name, Course ID, Lecturer and Max #Student as arguments, initializes the other attributes to their DEFAULT value.
* Set Methods : for modifying value of each property (5 methods)
    * Set methods for all attributes MUST satisfy the conditions specified above.
    * if the modified (new) value does not satisfy with the above conditions, use the CURRENT value.
* Get Methods : for reading value of each property (5 methods)
* toString() method : for printing the class object's state which returns a string in the following pattern:
```
      "CPE200-OOP (261200), Teacher: Pruet Boonma, has ONE student, [maximum: 60]"
```

###Note:
You can match a string to a specified pattern using regular expression. Find more detail on the topic here: 
http://www.tutorialspoint.com/java/java_regular_expressions.htm
