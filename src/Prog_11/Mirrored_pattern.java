package Prog_11;

public class Mirrored_pattern {

        public static void main(String[] args) {

            int n = 5;

            // Upper half
            for (int i = 1; i <= n; i++) {

                // Left stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                // Middle spaces
                for (int space = 1; space <= 2 * (n - i); space++) {
                    System.out.print("  ");
                }

                // Right stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

            // Lower half
            for (int i = n - 1; i >= 1; i--) {

                // Left stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                // Middle spaces
                for (int space = 1; space <= 2 * (n - i); space++) {
                    System.out.print("  ");
                }

                // Right stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }

