package murat.week9;

import murat.Colors;
import zah.week07.zoo.Zoo;

import java.util.List;

public class Customer {
    private String name;

    private boolean payOrWithdraw;

    private float money;

    private boolean satisfied;

    public Customer(String name, boolean payOrWithdraw, float money, boolean satisfied) {

        this.name = name;
        this.payOrWithdraw = payOrWithdraw;
        this.money = money;
        this.satisfied = satisfied;
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

    public boolean getSatisfied() {

        return satisfied;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setMoney(float money) {

        this.money = money;
    }

    public void setPayOrWithdraw(boolean payOrWithdraw) {

        this.payOrWithdraw = payOrWithdraw;
    }

    public void setSatisfied(boolean satisfied) {

        this.satisfied = satisfied;
    }

    @Override
    public String toString() {

        return Colors.ANSI_RED + name + " " + payOrWithdraw + " " + money + Colors.ANSI_RESET;
    }

}
