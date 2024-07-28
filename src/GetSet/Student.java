package GetSet;

public class Student {
    public String name;
    private int rno;
    double percent;



    public int getRno(){ //getter
        return rno;
        //getter e kicu dei na direct return kri
    }
    public void setRno(int roll){
        rno=roll;
        //setter e asi ota print hoi but eikane voide takhe tai kono kicu return kri na
    }
}
