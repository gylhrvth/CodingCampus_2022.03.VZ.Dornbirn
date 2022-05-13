package murat.week8.Zoo;

import java.util.Map;

public class Food {
    private String name;

    private String unit;

    private float price;

    public Food(String name, String unit, float price) {

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

        return name + " " + unit + " " + price;
    }

    public void foodStatistics(Zoo zoo) {

        float dailyFoodCostForAZoo = 0;

        for (Map.Entry<Food, Float> entry : zoo.foodConsumptionInAZoo().entrySet()) {
            dailyFoodCostForAZoo += zoo.foodConsumptionInAZoo().get(entry.getKey()) * entry.getKey().price;
            System.out.println("Name: " + Zoo.ANSI_BLUE + entry.getKey().getName() + Zoo.ANSI_RESET + " Price: " + entry.getKey().getPrice() + " Amount: " + entry.getValue());
        }

        System.out.println("Total daily cost: " + Zoo.ANSI_RED + dailyFoodCostForAZoo + " €" + Zoo.ANSI_RESET);
    }
}
