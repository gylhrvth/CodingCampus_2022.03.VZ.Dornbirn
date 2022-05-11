package sergej.week07.zoo;

public class Food {

    private String name;
    private String unit;
    private Integer price;
    private Integer amount;

    public Food(String name, String unit, Integer price, Integer amount) {
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.amount = amount;
    }


    @Override
    public String toString() {
        return " " + unit + " of " + name ;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public Integer getPrice() {
        return price;
    }
}
