public class Main {

    static int show(){
        try{
            System.out.println("Inside Try");
            return 1;

            System.out.println("hello world");
        }
        finally {
            System.out.println("Inside finally");
        }
    }

    public static void main(String[] args) {
        System.out.println(show());
    }
}
