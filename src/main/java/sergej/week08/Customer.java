package sergej.week08;

import java.util.Random;

public class Customer {

    Random random = new Random();

    private String name;
    private int money;
    private Transaction trans;
    private Counter counter;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;

    }

    public void deposit(int amount,Counter counter){
        Transaction tn = new Transaction(this,counter);
        tn.setValue(amount);
        counter.depositToCounter(tn);
    }

    public void withdraw(int amount,Counter counter){
        Transaction tn = new Transaction(this,counter);
        tn.setValue(amount);
        counter.withdrawFromCounter(tn);
    }

    public int getMoney() {
        return money;
    }
}
