package Morepack;

public class StudentClass {
    public static void fun(function5.StudentClass.Student x) {
        // Print the name of the student
        System.out.println(x.name);
        return;
    }

    // Method change takes a Student object and modifies its name
    // Demonstrating pass-by-reference: the original object is modified
    public static void change(function5.StudentClass.Student s) {
        s.name = "Mashrafi"; // Update the name of the student object to "Mashrafi"
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create a new Student object
        function5.StudentClass.Student s1 = new function5.StudentClass.Student();
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
//class in different file but same package.