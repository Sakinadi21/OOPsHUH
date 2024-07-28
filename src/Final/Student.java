package Final;

public class Student {
    public String name;
    private int rno;
    final String schoolName="BBPS";

    public int getRno(){ //getter
        return rno;

    }
    public void setRno(int rno){
        this.rno=rno;
    }
}