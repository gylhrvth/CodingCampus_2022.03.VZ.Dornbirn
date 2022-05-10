package arda.week07.zoosimulation;

import java.util.Random;

public class AnimalFood {
    private String foodType;
    private int foodAmount;
    private int price;

    public AnimalFood(String foodType, int foodAmount) {
        this.foodType = foodType;
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void reduceFoodAmount(int foodAmount) {
        this.foodAmount -= foodAmount;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getPrice() {
        Random rand = new Random();
        price = rand.nextInt(32) + 15;
        return price;
    }

    @Override
    public String toString() {
        return foodType + " " + foodAmount;
    }
}
