Week 3 - LAB 1
HelloWorld! + compile/execute/jar in the command line + Complex + javadoc (Wednesday and Thursday morning)
Before starting 
 
In Java, it is customary to capitalize the first letter of class names (camel case), while attribute, method, package, and project names typically begin with a lowercase letter.
In today's lab, you will learn how to compile and run Java applications using the command line. You will also become familiar with creating and executing jar files, portable archives that include multiple Java classes and resources. Mastering these skills will enable you to work effectively in various development environments, not just within an Integrated Development Environment (IDE).
By the end of this OOP course, you are expected to have acquired proficiency in these techniques. Practice will help you remember these skills.

Goals 
 
Being able to run a simple Java application and create the corresponding .jar file, both from the command line and the IDE. Get familiar with the Javadoc tool. 

#### Exercise 1 
 
Consider the canonical program Hello World, which prints the message Hello, world to the terminal! 
 
a) Edit and execute this canonical program within Eclipse (or any other IDE):
Create a Java project named lab3 <= this is an Eclipse IDE concept (not Java!).
Create a Java package named hello.
Create a Java class named HelloWorld.
Add to the HelloWorld class a main method that prints the required string to the terminal.
Execute this canonical program within the Eclipse environment.
 
b) Compile and execute the program from the command line. 
 
c) Create a .jar file with the sources and compiled classes and execute it. You can use the IDE but should also know how to do it from the command line. 
 
Goals 
 
Understand the main Java primitives:
classes, attributes, and methods;
constructors;
inheritance from Object: toString, equals, hashCode.
Get familiar with the Javadoc tool. 
 
#### Exercise 2 
 
A complex number is a number that can be expressed in the form a+bi, where a and b are real numbers. In this expression, a is the real part, and b is the imaginary part of the complex number. Complex numbers are added by adding the real and imaginary parts, that is, (a+bi) + (c+di) = (a+c) + (b+d)i. They are subtracted by subtracting the real and imaginary parts, that is, (a+bi) - (c+di) = (a-c) + (b-d)i. The multiplication of two complex numbers is defined as (a+bi) (c+di) = (ac-bd) + (bc+ad)i.

a) In a package named complex, define a class Complex to represent complex numbers. Once created, a Complex object should be immutable; the add, subtract, and multiply routines return newly created Complex objects containing the results. 
 
b) Define the textual description of a Complex object as a+bi, where a is its real part, and b is its imaginary part. Please remember that this is done using the toString method. 
 
c) Create another independent package named main. Define therein a class named Main with a main method. In the main method, create two Complex objects and print them to the terminal. Then add them, subtract them, and multiply them. Print the resulting Complex object to the terminal for each of these operations.  
 
d) Create two Complex objects with the same real and imaginary parts. Test identity (==) and equality (equals) between them. Explain the result. 
 
e) Back in the complex package, override the equals method from Object to return true iff two complex numbers have the same real and imaginary part. Which other method from Object should also be overridden? Justify. Implement it accordingly. 
 
#### Exercise 3 
Add comments to the complex package and create the documentation with the Javadoc tool.
