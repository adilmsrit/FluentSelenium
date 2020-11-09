package pSight.pizzaExample;

public class Pizza {

    private int size;
    private boolean cheese;
    private boolean olives;

    private Pizza(PizzaBuilder builder) {
        size = builder.size;
        cheese = builder.cheese;
        olives = builder.olives;
    }

    public static class PizzaBuilder {
        private final int size;

        // default is false
        private boolean cheese;
        private boolean olives;

        public PizzaBuilder(int size) {
            this.size = size;
        }

        public PizzaBuilder cheese(boolean value) {
            cheese = value;
            return this;
        }

        public PizzaBuilder olives(boolean value) {
            olives = value;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }

}
