package zah.week09.bank;

public class Customer {
    private String name;
    private int money;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void addCustomer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void toString(StringBuilder builder) {
        builder.append(name);


    }
}
