package prog_5;
class stud {
    int marks;
}

public class Pass_byval {
//    int s1=40;
    static void res(int marks){
        System.out.println("method with primitive"+marks);
        marks=marks+1;
    }
    static void finalm(stud s){
        s.marks=50;
        System.out.println("method with object"+s.marks);
    }
    public static void main(String[] args){
    int marks=11;
    System.out.println("Before method call"+marks);
    res(marks);
        System.out.println("After method call"+marks);
        stud s1=new stud();
        s1.marks=12;
        System.out.println("before method call"+s1.marks);
        finalm(s1);
         System.out.println("After method call"+s1.marks);


    }
}
