package arda.week07.carsimulator;

public class Car {
    private String manufacturer;
    private String model;
    private int hp;
    private int tankCap;
    private String fuel;
    private int weight;

    public Car(String manufacturer,String model,int hp,int tankCap, String fuel,int weight){
        this.manufacturer = manufacturer;
        this.model = model;
        this.hp = hp;
        this.tankCap = tankCap;
        this.fuel = fuel;
        this.weight = weight;
    }
    public int drive(int kilometer){
        int kmDriven = weight / hp;



        return kmDriven;
    }

    public int getHp() {
        return hp;
    }

    public int getTankCap() {
        return tankCap;
    }

    public int getWeight() {
        return weight;
    }
}
