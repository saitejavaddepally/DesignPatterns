public class Parent implements TestInterface{

    public Parent(){
        System.out.println("Parent");
    }

    @Override
    public void hello() {
        System.out.println("parent hello");
    }
}
