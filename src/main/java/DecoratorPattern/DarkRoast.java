package DecoratorPattern;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    public double cost() {
        return 1.99;
    }
}