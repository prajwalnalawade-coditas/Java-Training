class withoutThis {
String name;
double balance;

void without_this(String name, double balance) {
    name = name;
    balance = balance;
}

void withthis(String name, double balance) {
    this.name = name;
    this.balance = balance;
}

void display() {
    System.out.println(name + balance);
}
}

public class This{
        public static void main(String[] args){
             withoutThis s1 =new  withoutThis();
             s1.without_this("abc",1.2);
             s1.display();
             s1.withthis("abc",1.2);
            s1.display();
        }
}

