package Prog_5;
import java.util.Scanner;
public class Tax_regime {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your annual salary: ");
            double salary = sc.nextDouble();

            System.out.println("Select Regime: 1.New  2.Old");
            int choice = sc.nextInt();

            double tax = 0;

            if (choice == 1) {

                // New Regime

                if (salary > 1500000) {
                    tax += (salary - 1500000) * 0.30;
                    salary = 1500000;
                }

                if (salary > 1250000) {
                    tax += (salary - 1250000) * 0.25;
                    salary = 1250000;
                }

                if (salary > 1000000) {
                    tax += (salary - 1000000) * 0.20;
                    salary = 1000000;
                }

                if (salary > 750000) {
                    tax += (salary - 750000) * 0.15;
                    salary = 750000;
                }

                if (salary > 500000) {
                    tax += (salary - 500000) * 0.10;
                    salary = 500000;
                }

                if (salary > 250000) {
                    tax += (salary - 250000) * 0.05;
                }

            } else {

                // Old Regime (Example slabs)

                if (salary > 1000000) {
                    tax += (salary - 1000000) * 0.30;
                    salary = 1000000;
                }

                if (salary > 500000) {
                    tax += (salary - 500000) * 0.20;
                    salary = 500000;
                }

                if (salary > 250000) {
                    tax += (salary - 250000) * 0.05;
                }
            }

            System.out.println("Total Tax: " + tax);
        }
    }

