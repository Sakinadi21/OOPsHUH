package function2;

public class StudentClass {

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
            Student s1=new Student();
            s1.name="Mashrafi";

            fun(s1);


        }
    }


