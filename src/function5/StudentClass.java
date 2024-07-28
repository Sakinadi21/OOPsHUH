package function5;

// Define the class StudentClass in the package function5
public class StudentClass {
    // Passing class to functions
    /*
     * We have to declare the class outside the main method.
     */

    // Creating a new data type Student as an inner static class of StudentClass
    public static class Student {
        public String name;  // Field for student's name
        int rno;      // Field for student's roll number
        double percent; // Field for student's percentage
    }

    // Method fun takes a Student object from function4.StudentClass package as parameter
    public static void fun(function5.StudentClass.Student x) {
        // Print the name of the student
        System.out.println(x.name);
        return;
    }

    // Method change takes a Student object and modifies its name
    // Demonstrating pass-by-reference: the original object is modified
    public static void change(Student s) {
        s.name = "Mashrafi"; // Update the name of the student object to "Mashrafi"
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create a new Student object
        Student s1 = new Student();
        // Set the name of the student to "Sakiba"
        s1.name = "Sakiba";
        // Print the name of the student
        System.out.println(s1.name); // Output: Sakiba

        // Call the change method and pass the Student object
        change(s1);
        // Print the name of the student after modification
        System.out.println(s1.name); // Output: Mashrafi

        // Call the fun method and pass the Student object
        fun(s1); // Output: Mashrafi
    }
}
/*
Pass-by-Reference in Java:
Java passes objects by reference, meaning that when an object is passed to a method,
 the method receives a reference to the original object.
Any changes made to the object within the method affect the original object outside
the method. This is demonstrated in the change method, where the name of the Student
object s1 is modified, and the change is reflected outside the method.*/