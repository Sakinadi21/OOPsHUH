
package Constructor;
// Defines the package in which the classes are located

public class Student {
    // Class representing a student

    private String name;
    // Instance variable to store the name of the student
    // Changed to private for encapsulation

    private int rno;
    // Instance variable to store the roll number of the student
    // Changed to private for encapsulation

    public Student(String name, int roll) {
        // Constructor to initialize the Student object

        this.name = name;
        // Use 'this' to refer to the instance variable 'name'
        // Assigns the parameter 'name' to the instance variable 'name'

        this.rno = roll;
        // Use 'this' to refer to the instance variable 'rno'
        // Assigns the parameter 'roll' to the instance variable 'rno'
    }

    public String getName() {
        // Getter method for the name
        return name;
        // Returns the name of the student
    }

    public void setName(String name) {
        // Setter method for the name
        this.name = name;
        // Sets the name of the student
    }

    public int getRno() {
        // Getter method for the roll number
        return rno;
        // Returns the roll number of the student
    }

    public void setRno(int rno) {
        // Setter method for the roll number
        this.rno = rno;
        // Sets the roll number of the student
    }
}
