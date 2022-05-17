package murat.week9;

import murat.Colors;

public class Customer {
    private String name;

    private boolean payOrWithdraw;

    private float money;

    private boolean served;

    public Customer(String name, boolean payOrWithdraw, float money, boolean satisfied) {

        this.name = name;
        this.payOrWithdraw = payOrWithdraw;
        this.money = money;
        this.served = satisfied;
    }

    public String getName() {

        return name;
    }

    public boolean isPayOrWithdraw() {

        return payOrWithdraw;
    }

    public float getMoney() {

        return money;
    }

    public boolean getServed() {

        return served;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setMoney(float money) {

        this.money = money;
    }

    public void setServed(boolean served) {

        this.served = served;
    }

    @Override
    public String toString() {

        return Colors.ANSI_RED + name + " " + payOrWithdraw + " " + money + Colors.ANSI_RESET;
    }

}
