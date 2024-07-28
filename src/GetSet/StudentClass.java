package GetSet;

public class StudentClass {


    public static void change(Student s){
        s.name="Mashrafi";
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Sakiba";
        s1.setRno(1);
        //setter e amra () kicu ekta dei er por ota pass kri
        System.out.println(s1.getRno());
    }
}
