class Person {

    void displayName(String n) {
        String name = n;
        System.out.println("name :" + name);
    }
}
    class collegeStudent extends Person {
        void displayMarks(int m) {
            int marks=m;
            System.out.println("marks :" + marks);
        }
    }

public class Inheritance {
    public static void main(String[] args){
        collegeStudent s1=new collegeStudent();
        s1.displayName("praj");
        s1.displayMarks(12);
    }

}
