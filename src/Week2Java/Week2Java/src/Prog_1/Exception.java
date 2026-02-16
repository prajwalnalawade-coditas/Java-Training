package Prog_1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter a :");
            int a=sc.nextInt();
            System.out.println("Enter b :");
            int b=sc.nextInt();
            double div =(double) a / b;
            System.out.println("Div= :"+ div);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Enter only numbers");
        }
        finally {
            System.out.println("Program executed successfully");
        }
    }
}