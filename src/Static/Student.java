package Static;

public class Student {
    // Static variable to keep track of the number of students
    public static int numberOfStudents = 0;
    public String name;
    public int id;

    // Constructor to initialize the student object and increment the number of students
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        numberOfStudents++;
    }
}
