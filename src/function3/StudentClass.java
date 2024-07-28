
package function3;

    public class StudentClass {
        //Passing class to functions
        /*
         * We have to declare the class outside main
         *
         * */

        //creating a new data type
        public static class Student{
            String name;
            int rno;
            double percent;
        }

        public static void fun(Student x) {
            System.out.println(x.name);
            return;
        }

        public static void main(String[] args) {
            Student s1 = new Student();
            s1.name = "Mashrafi";
            System.out.println(s1.name);

            //updation
            s1.name = "Uddin";
            System.out.println(s1.name);

            //calling the function to pass the student object
            fun(s1);
        }
    }
