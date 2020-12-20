package rtfour;

public class DeluxeHamburger extends Burger{
    private String drink;
    private String chips;

    private final int additionsLimit = 6;

    public DeluxeHamburger(String bread, String meat, String drink, String chips) {
        super(bread, meat, "DeluxeHamburger");
        this.drink = drink;
        this.chips = chips;
    }
}
