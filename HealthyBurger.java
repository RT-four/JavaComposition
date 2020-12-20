package rtfour;

public class HealthyBurger extends Burger{
    public HealthyBurger(String meat) {
        super("Black bread", meat, "Healthy Burger");
    }

    @Override
    public void addAddition(Addition addition) {
        System.out.println("No additions available for this burger.");
    }
}
