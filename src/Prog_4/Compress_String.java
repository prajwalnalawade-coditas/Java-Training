package Prog_4;
public class Compress_String {
    public static void main(String[] args) {
        String str = "aaabcddd";
        StringBuilder new_str = new StringBuilder();
        int count =1 ;
        for(int i=0; i<str.length() ;i++)
        {
            if(i+1 <str.length() && str.charAt(i) == str.charAt(i+1) )
            {
                count++;
            }
            else
            {
                new_str.append(str.charAt(i)).append(count);
                count =1;
            }

        }
//        System.out.println(count);
        System.out.println("New String :" +new_str);
    }
}
