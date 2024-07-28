package function4;

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
        public static void change(int x) {
            x = 7;
            return;
        }

        public static void main(String[] args) {
            int x=6;
            System.out.println(x);
            change(x);
            System.out.println(x);

        }
    }

