package Patterns.Creational.Builder;

public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    // Getter methods

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce, and " + topping + " topping.";
    }

    // Builder class
    public static class Builder {
        private String dough;
        private String sauce;
        private String topping;

        public Builder() {
            // Default values
            this.dough = "Regular";
            this.sauce = "Tomato";
            this.topping = "Cheese";
        }

        // Setter methods in the builder class
        public Builder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        // Build method to create the Pizza object
        public Pizza build() {
            return new Pizza(this);
        }
    }

    public static void main(String[] args) {
        // Using the builder to construct a custom Pizza
        Pizza pizza = new Pizza.Builder()
                .dough("Thin crust")
                .sauce("Barbecue")
                .topping("Chicken")
                .build();

        System.out.println(pizza); // Output: Pizza with Thin crust dough, Barbecue sauce, and Chicken topping.
    }
}
