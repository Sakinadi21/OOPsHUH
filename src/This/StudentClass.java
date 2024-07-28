package This;

import GetSet.Student;

public class StudentClass {



        public static void change(GetSet.Student s){
            s.name="Mashrafi";
        }

        public static void main(String[] args) {
            GetSet.Student s1=new Student();
            s1.name="Sakiba";
            s1.setRno(87);
            //setter e amra () kicu ekta dei er por ota pass kri
            System.out.println(s1.getRno());
        }
    }


