package philipp.week08.bank;

import sergej.week03.RandomArray;

import java.util.Random;

public class Customer {
    Random rn = new Random();

    private String name;
    private int money;
    private boolean deposit;

    public Customer(String name, int money, boolean deposit) {
        this.name = name;
        this.money = money;
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", deposit=" + deposit +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public boolean getDeposit() {
        return deposit;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void generateCustomer(int i) {
        name = "Customer " + i;
        money = rn.nextInt(10, 1000);
        if (i % 2 == 0) {
            deposit = true;
        } else {
            deposit = false;
        }
    }
}
