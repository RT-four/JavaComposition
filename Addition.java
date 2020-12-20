package rtfour;

public class Addition {
    private String name;
    private float price;
    private int amount;
    private float singlePrice;

    public Addition(String name, int amount, float singlePrice) {
        this.name = name;
        this.amount = amount;
        this.price = amount*singlePrice;
    }

    public float getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }

}
