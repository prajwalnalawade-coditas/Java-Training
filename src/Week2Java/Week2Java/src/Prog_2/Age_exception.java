package Prog_2;
import java.util.Scanner;
 class InvalidAgeException extends RuntimeException{
  InvalidAgeException(String message){
   super(message);
  }
}
public class Age_exception {
  void Agechk(int age){
   if(age<18){
    throw new InvalidAgeException("Your age is less than 18!!!cant proceed further");

   }
  }
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   Age_exception a=new Age_exception();
   try{
    System.out.println("Enter your age :");
   int age=sc.nextInt();
   a.Agechk(age);
   System.out.println("Your age is eligible!!!");
  }
   catch(InvalidAgeException e){
    System.out.println("error :"+e.getMessage());
   }

}
}