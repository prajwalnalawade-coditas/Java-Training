package prog_6;

public class Diamond_pattern {

    public static void main(String[] args) {

        // Upper half
        for (int i = 1; i <= 4; i++) {

            for (int space = 1; space <= 4 - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 3; i >= 1; i--) {

            for (int space = 1; space <= 4 - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}