package Prog_6;
import java.util.ArrayList;
import java.util.List;
public class LambdaDemo {

    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();

        employees.add("Amit");
        employees.add("Rahul");
        employees.add("Anita");
        employees.add("Kiran");

        //  Print all names
        System.out.println("All Employees:");
        employees.forEach(name -> System.out.println(name));

        //  Filter names starting with 'A'
        System.out.println("\nEmployees starting with A:");
        employees.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));

        // Sort alphabetically
        employees.sort((a, b) -> a.compareTo(b));

        System.out.println("\nSorted Employees:");
        employees.forEach(System.out::println);
    }
}
