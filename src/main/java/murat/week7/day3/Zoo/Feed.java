package murat.week7.day3.Zoo;

import java.util.HashMap;

public class Feed {
    private String name;

    private String unit;

    private float price;

    public Feed(String name, String unit, Float price) {

        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public String getUnit() {

        return unit;
    }

    public float getPrice() {

        return price;
    }

    @Override
    public String toString() {

        return "Feed{" +
                "name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                '}';
    }

    public void foodConsumptionStatistics(Zoo zoo) {

        HashMap<String, Float> foodConsumptionAtZoo = new HashMap<>();

        for (int i = 0; i < zoo.getFeeds().size(); i++) {
            foodConsumptionAtZoo.put(zoo.getFeeds().get(i).name, 5.0f);
        }

    }

}
