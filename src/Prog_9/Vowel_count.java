package Prog_9;
import java.io.File;
import java.util.Scanner;
public class Vowel_count {


        public static void main(String[] args) throws Exception {

            int count = 0;
            File file = new File("C:/Users/Coditas-Admin/Downloads/myfile.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {

                String line = sc.nextLine();

                for (int i = 0; i < line.length(); i++) {

                    char ch = line.charAt(i);

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        count++;
                    }
                }
            }

            sc.close();

            System.out.println("Total lowercase vowels: " + count);
        }
    }

