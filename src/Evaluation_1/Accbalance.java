package Evaluation_1;
import java.io.File;
import java.util.Scanner;

class Balance{
    int trans_id;
    int amount;
    int tax;
    Balance(int trans_id, int amount,int tax){
        this.trans_id=trans_id;
        this.amount=amount;
        this.tax=tax;
    }
    int final_balance(){
        return amount= amount+(amount*tax)/100;
    }

}
public class Accbalance {
    public static void main(String[] args)throws Exception{
        Scanner filescanner=new Scanner(new File("C:\\Users\\Coditas-Admin\\Desktop"));
        Balance[] newamt=new Balance[10];
        int count=0;
        while(filescanner.hasNextLine());{
            int trans_id= filescanner.nextInt();
            int amount= filescanner.nextInt();
            int tax= filescanner.nextInt();
            newamt[count]=new Balance(trans_id,amount,tax);
            count++;

            Scanner ab=new Scanner(System.in);
            int totbal=0;

            while(true){

                System.out.println("enter transaction id to continue");

                for(int i=0;i<count;i++){
                    System.out.println(newamt[i].trans_id+""+newamt[i].amount);
                }
            }
        }
    }
}
