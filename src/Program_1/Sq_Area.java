package Program_1;
import java.util.Scanner;
public class Sq_Area {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter side of sq :");
        int side=scanner.nextInt();
        int area= side*side;
        System.out.println("Area of sq is :"+area);
             scanner.close();
    }

}
