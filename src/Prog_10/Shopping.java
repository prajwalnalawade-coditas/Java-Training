package  Prog_10;
import java.io.File;
import java.util.Scanner;

class ShoppingApp {

    int id;
    String name;
    int price;
    int gst;
    int quantity;

    ShoppingApp(int id, String name, int price, int gst, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.gst = gst;
        this.quantity = quantity;
    }

    double getFinalPrice() {
        return price + (price * gst / 100);
    }
}

public class Shopping {

    public static void main(String[] args) throws Exception {

        Scanner fileScanner = new Scanner(new File("C:\\Users\\Coditas-Admin\\IdeaProjects\\Week1Java\\src\\Prog_10\\prog-10.txt"));

        ShoppingApp[] products = new ShoppingApp[10];
        int count = 0;

        // Read file
        while (fileScanner.hasNext()) {

            int id = fileScanner.nextInt();
            String name = fileScanner.next();
            int price = fileScanner.nextInt();
            int gst = fileScanner.nextInt();
            int quantity = fileScanner.nextInt();

            products[count] = new ShoppingApp(id, name, price, gst, quantity);
            count++;
        }

        fileScanner.close();

        Scanner sc = new Scanner(System.in);
        double total = 0;

        while (true) {

            System.out.println("Select product ID (0 to checkout):");

            for (int i = 0; i < count; i++) {
                System.out.println(products[i].id + " " + products[i].name);
            }

            int choice = sc.nextInt();

            if (choice == 0) break;

            for (int i = 0; i < count; i++) {
                if (products[i].id == choice) {
                    total += products[i].getFinalPrice();
                }
            }
        }

        System.out.println("Total Bill: " + total);
    }
}