package philipp.week08.bank;

public class Customer {
    private String name;
    private double money;
    private boolean deposit;

    public Customer(String name, double money, boolean deposit) {
        this.name = name;
        this.money = money;
        this.deposit = deposit;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
    public boolean getDeposit() {
        return deposit;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
