package cemil.week10;


public class Customer {
    private String name;
    private int money;


    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public void toString(StringBuilder builder) {
        builder.append(name);


    }
}
