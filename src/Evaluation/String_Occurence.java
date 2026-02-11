package Evaluation;
public class String_Occurence {
    public static void main(String[] args){
        String str= "what are you doing";
        StringBuilder newstr=new StringBuilder();
        int count=1;
        for(int i=0; i<str.length(); i++){
        if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
            count++;
        }
        else{
            newstr.append(str.charAt(i)).append(count);
            count=1;
        }

        }
        System.out.println(newstr);
    }
}
