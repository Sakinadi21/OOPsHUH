package This;

public class Student {

        public String name;
        private int rno;

        public int getRno(){ //getter
            return rno;
            //getter e kicu dei na direct return kri
        }
        public void setRno(int rno){
            this.rno=rno;
            //setter e asi ota print hoi but eikane voide takhe tai kono kicu
            // return kri na
        }
        /* this keyword is used to reference the current object,
        differentiate between instance variables and parameters,
        facilitate constructor chaining,
        return the current instance,
         and clarify code.
           */
    }


