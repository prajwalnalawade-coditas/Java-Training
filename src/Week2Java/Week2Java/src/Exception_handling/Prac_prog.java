package Exception_handling;

public class Prac_prog {
    public static void main(String[] args){
        try{
            int x=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by zero");

        }
        finally {System.out.println("Prog continues");}
    }

}
