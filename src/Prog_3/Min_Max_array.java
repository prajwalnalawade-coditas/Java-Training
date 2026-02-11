package Prog_3;
import java.util.Scanner;
public class Min_Max_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
            System.out.println("Enter the no of elements in  array :");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(
            int i = 0; i<n;i++)

            {
                System.out.println("Enter the num " + (i + 1));
                arr[i] = sc.nextInt();
            }

            int smallest = arr[0];
            int largest = arr[0];
            for(
            int i = 0;
            i<n;i++)

            {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
                    System.out.println("Smallest no is :"+smallest);
                        System.out.println("largestest no is :"+largest);
                        sc.close();
        }
    }


