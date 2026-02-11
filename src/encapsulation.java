class Student {
    private int marks;
    public void setMarks(int m){
        marks=m;
    }
    public int getMarks(){
        return marks;
    }

}
public class encapsulation {

    public static void main(String[] args){
        Student s1=new Student();
        s1.setMarks(80);
        System.out.println("marks"+s1.getMarks());

    }
}
