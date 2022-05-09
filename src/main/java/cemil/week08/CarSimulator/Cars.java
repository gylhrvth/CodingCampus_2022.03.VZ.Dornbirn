package cemil.week08.CarSimulator;

public class Cars {

    private String manufacturer;
    private String model;
    private int hp;
    private int tankCap;
    private String fuel;
    private int weight;

    public Cars(String manufacturer,String model,int hp,int tankCap, String fuel,int weight){
        this.manufacturer = manufacturer;
        this.model = model;
        this.hp = hp;
        this.tankCap = tankCap;
        this.fuel = fuel;
        this.weight = weight;
    }
    public int drive(int kilometer){
        return weight / hp;
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
