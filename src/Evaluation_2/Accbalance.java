package Evaluation_2;
import java.io.File;
import java.util.Scanner;

class Balance {

    int trans_id;
    int amount;
    int tax;

    Balance(int trans_id, int amount, int tax) {
        this.trans_id = trans_id;
        this.amount = amount;
        this.tax = tax;
    }

    int final_balance() {
        return amount + (amount * tax) / 100;
    }
}

public class Accbalance {

    public static void main(String[] args) throws Exception {

        Scanner filescanner = new Scanner(new File("C:\\Users\\Coditas-Admin\\IdeaProjects\\Week1Java\\src\\Evaluation_2\\Evaluation 2"));

        Balance[] newamt = new Balance[10];
        int count = 0;

        // Reading file
        while (filescanner.hasNext()) {

            int trans_id = filescanner.nextInt();
            int amount = filescanner.nextInt();
            int tax = filescanner.nextInt();

            newamt[count] = new Balance(trans_id, amount, tax);
            count++;
        }

        filescanner.close();

        Scanner ab = new Scanner(System.in);

        int total_balance = 0;

        while (true) {

            System.out.println("Enter transaction id (0 to exit):");

            for (int i = 0; i < count; i++) {
                System.out.println(newamt[i].trans_id + " " + newamt[i].amount);
            }

            int choice = ab.nextInt();

            if (choice == 0) {
                break;
            }

            for (int i = 0; i < count; i++) {

                if (newamt[i].trans_id == choice) {

                    int final_amt = newamt[i].final_balance();
                    total_balance = total_balance + final_amt;

                    System.out.println("Transaction Added: " + final_amt);
                }
            }
        }

        System.out.println("Total Balance After Transactions: " + total_balance);
    }
}
