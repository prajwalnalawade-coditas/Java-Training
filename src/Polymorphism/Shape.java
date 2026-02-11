package Polymorphism;
class Shape_of_obj {
    void draw() {
        System.out.println("Shape");
    }
}
class Circle extends Shape_of_obj {
    void draw() {
        System.out.println("Printing circle");
    }
}
class Square extends Shape_of_obj {
    void draw(){
        System.out.println("Drawing square");
    }
}
public class Shape {
    public static void main(String[] args) {
        Shape_of_obj s1 = new Circle();
        s1.draw();
        Shape_of_obj s2 = new Square();
        s2.draw();

    }
}
