package DecoratorPattern;

public abstract class Beverage {

    String description = "Unknown beverage";
    abstract double cost();

    public String getDescription() {
        return description;
    }
}
