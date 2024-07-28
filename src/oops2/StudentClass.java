package oops2;

public class StudentClass {
    //creating a new data type
    public static class Student{
        String name;
        int rno;
        double percent;
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Mashrafi";
        s.rno=01;
        s.percent=98;
        System.out.println("Name:"+s.name);
        System.out.println(s.percent+9);


    }
}
/*OOPS refer to using objects in programming.
Class is user defined blueprint through which objects are created.
Objects of same class have same properties.
 Objects are instance of class.
 */
