package staticFunctions;

public class StudentClass {

        public static void change(Student s){
            s.name = "Mashrafi";
        }

        public static void main(String[] args) {
            // Main method, entry point of the program

            Student s1 = new Student("Mashrafi", 01);
            System.out.println(Student.getNumberOfStudents());  // Call the static method to get the number of students
        }
    }


