package rtfour;

public class Burger {
    private String bread;
    private String meat;
    private String name;
    private Cheese cheese;
    private Tomato tomato;
    private int addCount = 0;
    private float totalPrice = 20;
    private String additions;

    private final int additionsLimit = 4;

    public Burger(String bread, String meat, String name) {
        this.bread = bread;
        this.meat = meat;
        this.name = name;
    }

    public void addAddition(Addition addition) {
        if (addCount<additionsLimit){
            totalPrice += addition.getPrice();
            addCount++;
            additions = additions + " "+ addition.getName();
            System.out.println("U added " + addition.getName() + " Now your burger costs " + totalPrice + "$");
        }
        else{
            System.out.println("Too many additions. Please stop!");
        }

    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public int getAddCount() {
        return addCount;
    }
}
