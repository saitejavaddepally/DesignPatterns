public class Child extends Parent implements TestInterface{

    Child(){
        super();
        int x= 10;
        System.out.println(x);
        System.out.println("child");
    }


    @Override
    public void hello() {
        System.out.println("child hello");
    }
}
