package Prog_3;
abstract class Employee{
    abstract int calculateSalary(int lpa,int years );
    void displayDetails(){
        System.out.println("Emp details :");
    }
}
class FullTimeEmployee extends Employee {
    @Override
    int calculateSalary(int lpa, int years) {
        int salary = lpa * years;
        return salary;
    }
    }

    class PartTimeEmployee extends Employee {
        @Override
        int calculateSalary(int tpa, int years) {
            int salary = tpa * years;
            return salary;
        }
    }

        public class Polymorphism {
            public static void main(String[] args) {
                Employee e = new FullTimeEmployee();
                int result1= e.calculateSalary(12,2);
                e.displayDetails();
                System.out.println("Salary of fulltime emp is :" + result1);
                Employee f = new PartTimeEmployee();
                int result2=f.calculateSalary(13,4);
                f.displayDetails();
                System.out.println("Salary of fulltime emp is :" + result2);
            }
        }
