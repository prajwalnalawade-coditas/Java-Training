package Evaluation_1;

public class Char_Ocurrence {

    public static void main(String[] args) {

        String str = "what is your name";

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            int count = 1;

            if (arr[i] == ' ') {
                continue;   // skip space
            }

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0';   // mark as visited
                }
            }

            if (arr[i] != '0') {
                System.out.println(arr[i] + " = " + count);
            }
        }
    }
}

