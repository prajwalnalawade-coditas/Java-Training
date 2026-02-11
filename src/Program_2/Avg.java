package Program_2;
import java.util.Scanner;
public class Avg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First num :");
        int num1=sc.nextInt();
        System.out.println("Enter Second num :");
        int num2=sc.nextInt();
        System.out.println("Enter Third num :");
        int num3=sc.nextInt();
        int sum=(num1+num2+num3);
        System.out.println("Sum is "+sum);
        int avg=(num1+num2+num3)/3;
        System.out.println("The avg is :"+avg);
        sc.close();

    }
}
