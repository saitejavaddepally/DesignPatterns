package Patterns.Creational.Builder;

public class Main {

    public static void main(String[] args) {
        StringResultBuilderImpl builder = new StringResultBuilderImpl();

        builder.append("Hello");
        builder.append(" ");
        builder.append("World");
        builder.append("!");
        builder.append(" ");
        builder.append("2024");

        System.out.println(builder.build());


    }

}
