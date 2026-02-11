public class Constructor_prog {
    int bookid;
    String bookname;

    Constructor_prog(int i, String n) {
        bookid = i;
        bookname = n;}
        void study () {
            System.out.println("String[] args");
        }
        public static void main (String[]args){
            Constructor_prog s1 = new Constructor_prog(1, "praj");
            s1.study();
        }
    }
