# Computer_Specifications_Program_Java
Draw UML class diagrams of the following example. 
Problem: 
A class named Processor has 
    • Two public attributes i.e. price and speed (float value like 2.8, 3.2 etc in MHz)
    • A parameterized constructor to initialize attributes with user-defined values

Class MainMemory consists of
    • Two public attributes i.e. size (4,8 etc in Gb) and price
    • A parameterized constructor to initialize attributes with user-defined values

Class MotherBoard has 
    • a private data member named compName of type string
    • a no-argument or default constructor to initialize with default name intel
    • setter function setCompName() to set the name of the computer
    • getter function getCompName() to get the name of the computer

Class Monitor has 
    • a private data member named size (17, 19 inches) of type Int that represents size of screen
    • A parameterized constructor to initialize attribute size.
    • setter function setMonitorSize() to set the value to size.
    • getter function getMointorSize() to get the size of screen.
    • public remove() method, that will change the size of screen to zero (0)

Design a class named Computer that includes 
    • An array of type Processor. containing all the processors. 
    • A data member named ram of type MainMemory
    • A data member named mboard of type MotherBoard
    • A data member named screen of type Mointor
    • A parameterized constructor that accept Three arguments of type string as computer Name, Array of all the Processors and type MainMemory to initialize members of these types. Moreover, within this constructor, instantiate object of Monitor class with default screen size of 15 inches.
    • A public setter function setMointor() that can change the size of monitor. if monitor size is set to Zero i.e 0. it's means that monitor does not exist

    • A display() function that print complete computer specification. like

Computer: intel with monitor size 17 inches
CPU(s): 1.8, 3.2, MHz
RAM: 8 Gb

    • A Computer can't have more than 4 processors. in case of more than 4 processors, it should display error message. and also we all know that Computer can exist without monitor.

Draw UML diagram for each class and show aggregation and composition relationship between these classes. You are also required to show cardinality in UML diagram, submit your design in PDF format. 
2. Implementation: (12 marks)
Implement the above classes in Main() method. Create three computers with data given below, this is the output that your program should display. 
Computer: intel with monitor size 17 inches
CPU(s): 1.8, 2.2, MHz
RAM: 4 Gb

Computer: Dell without monitor 
CPU(s): 1.8, 2.2, 3.3, MHz
RAM: 8 Gb

Computer: hp with monitor size 15 inches
CPU(s): 1.8, MHz
RAM: 2 Gb

