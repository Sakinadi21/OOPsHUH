package Constructor;



// Defines the package in which the classes are located

public class StudentClass {
    // Class containing the main method to run the program

    public static void main(String[] args) {
        // Main method, entry point of the program

        Student s1 = new Student("Mashrafi", 01);

        // Creating an instance of the Student class using the constructor
        //  initializes the Student object with the given name and roll number

        System.out.println(s1.getName());
        // Prints the name of the student using the getter method

        System.out.println(s1.getRno());
        // Prints the roll number of the student using the getter method
    }
}
/*
About the Constructor:
A constructor is a special method that is called when an object of a class is created.
The purpose of a constructor is to initialize the newly created object.
The constructor in the Student class takes two parameters,
name and roll, and assigns them to the instance variables name and rno, respectively,
using  this keyword to distinguish between the instance variables and the parameters.
 */