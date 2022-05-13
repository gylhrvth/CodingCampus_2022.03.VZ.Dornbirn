package timo.week07.TimosZoo;

public class Food {

    private String name;
    private String unit;
    private int price;

    public Food(String name, String unit, int price) {
        this.name = name;
        this.unit = unit;
        this.price = price;
    }


    @Override
    public String toString() {
        return name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}