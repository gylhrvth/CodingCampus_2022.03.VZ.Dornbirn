package aron.week08.bank;


import java.util.Random;

public class Customer {


    private int value;
    private String name;
    private int amount;
    private Counter counter;



    public  Customer ( String name,int amount){

        this.name = name;
        this.amount = amount;
        this.value = value;
    }
    public int getValue() {

        return value;
    }

    public void setValue(int value) {

        this.value = value;
    }

    public void deposit(int amount,Counter counter) {
        Counter var = counter.depositToCounter(value);
        var.depositToCounter(value);
    }

    public void withdraw(int amount,Counter counter) {
        Counter var = counter.withdrawFromCounter(value);
        var.withdrawFromCounter(value);
    }

    public Counter checkCounter(Bank bank) {
        for (Counter c : bank.counters()) {
            if (!c.getBreak()) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", counter=" + counter+"\n";
    }
}
