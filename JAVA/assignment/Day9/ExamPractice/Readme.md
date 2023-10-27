----------------------------------------------------------------------

This is the read me file for the infoway java practice question set

----------------------------------------------------------------------
question 1)

Write the following four classes to practice using an abstract class and polymorphism. Submit all four classes.

Shape2D class
For this class, include just an abstract method name get2DArea() that returns a double.

Rectangle2D class
Make this class inherit from the Shape2D class. Have it store a length and a width as fields. 
Provide a constructor that takes two double arguments and uses them to set the fields. Note, 
the area of a rectangle is the length times the width.

Circle2D class
Also make this class inherit from the Shape2D class. Have it store a radius as a field. 
Provide a constructor that takes a double argument and uses it to set the field. 
Note, the area of a circle is PI times it's radius times it's radius.

Shape2DDriver class
Have this class provide a method named displayArea() that takes an object that is either a Rectangle2D or a Circle2D object (and you cannot use an Object type parameter). Have the method display (not return) the area of the object, rounded to one decimal place.
===============================================================================================================
Question2)
You are provided with Fish.java which represents all fishes.
Write a java class that represents one specific kind of fish. 

For example, if you were to create a Shark class, you
might add an object variables (instance field) that is unique to the shark (not specified in the Fish
class), for example, length of a shark. Create a constructor that accepts and initializes the new object
variable(s), and also calls super class’ constructor. 
The Shark class should also overwrite Fish class’greeting method so it has a unique greeting, 
for example, a shark’s greeting can print out, “I can bite you.” 

Last, the subclass should also have a unique method that Fish class doesn’t have. For example,
Shark class can have bite() method that prints out “Bite!!” which Fish class doesn’t have.