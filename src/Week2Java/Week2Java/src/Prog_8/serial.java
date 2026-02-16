package Prog_8;
import java.io.*;
import java.io.Serializable;
class USER implements Serializable {  String username;
    transient String password;
    String email;
    public USER(String username,String password, String email){
        this.username=username;
        this.email=email;
        this.password=password;
    }
}
public class serial {
    public static void main(String[] args) {
        USER u = new USER("praj", "praj@coditas.com", "ab");
        try {
            FileOutputStream fis = new FileOutputStream("abc.txt");
            //it has basically created a pipe to the file

            ObjectOutputStream oos = new ObjectOutputStream(fis);
            //converts our object into bytes and then sends it to fos

            oos.writeObject(u);
            //from here we take object u and convert it into byte form and sending through fos
            //if we write oos.write(u) it wont work coz it expects only byte so by that method we are converting into byte
            oos.close();
            FileInputStream fos = new FileInputStream("abc.txt");
            ObjectInputStream ois = new ObjectInputStream(fos);
            USER newUser = (USER)
                    ois.readObject();

            System.out.println("result after serialization");
            System.out.println(newUser.username);
            System.out.println(newUser.email);
            System.out.println(newUser.password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}