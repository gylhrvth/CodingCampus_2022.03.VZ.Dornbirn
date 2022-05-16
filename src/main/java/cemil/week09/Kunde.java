package cemil.week09;

public class Kunde {

    private String name;
    private int money;


    public Kunde(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void addMoney(int money) {

    }

    public int getMoney() {
        return money;
    }

    public void simulate(){

    }

    @Override
    public String toString() {
        return Schalter.ANSI_GREEN + name + Schalter.ANSI_RESET;
    }
}
