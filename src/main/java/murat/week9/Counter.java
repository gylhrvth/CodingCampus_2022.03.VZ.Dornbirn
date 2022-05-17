package murat.week9;

import murat.Colors;

import java.util.List;
import java.util.Vector;

public class Counter {
    private int counterNumber;

    private boolean free;

    private float moneyAvailable;

    private List<Customer> customersAtACounter = new Vector<>();

    public Counter(int counterNumber, boolean free, float moneyAvailable) {

        this.counterNumber = counterNumber;
        this.free = free;
        this.moneyAvailable = moneyAvailable;
    }

    public int getCounterNumber() {

        return counterNumber;
    }

    public boolean isFree() {

        return free;
    }

    public float getMoneyAvailable() {

        return moneyAvailable;
    }

    public void setFree(boolean free) {

        this.free = free;
    }

    public void setMoneyAvailable(float moneyAvailable) {

        this.moneyAvailable = moneyAvailable;
    }

    @Override
    public String toString() {

        return Colors.ANSI_BLUE + counterNumber + " " + free + " " + moneyAvailable + Colors.ANSI_RESET;
    }

    public void addCustomer(Customer cus) {

        customersAtACounter.add(cus);
    }

    public void transactionACustomerAtACounter(Customer cus) {

        if (isFree()) {

            // If customer pays
            if (cus.isPayOrWithdraw()) {
                setMoneyAvailable(getMoneyAvailable() + cus.getMoney());
            } else {
                setMoneyAvailable(getMoneyAvailable() - cus.getMoney());
            }
        }
    }

    public static boolean allCountersAreOccupied(List<Counter> counters) {

        boolean allCountersOccupied = true;

        for (Counter counter : counters)
            if (counter.isFree()) {
                allCountersOccupied = false;
                break;
            }

        return allCountersOccupied;
    }

    public boolean thereIsNoMoneyAtACounter(Customer cus) {

        boolean thereIsNoMoney = false;

        // If customer withdraws and there is no money at the counter
        if ((this.getMoneyAvailable() - cus.getMoney() <= 0) && !cus.isPayOrWithdraw()) thereIsNoMoney = true;
        return thereIsNoMoney;
    }

    public void customerStatsForACounter() {

        System.out.println(Colors.ANSI_RED + "\nCounter: " + this.getCounterNumber() + " STATS------------------------" + Colors.ANSI_RESET);
        float totalTransaction = 0;
        for (Customer customer : customersAtACounter) {

            if (customer.isPayOrWithdraw()) {
                totalTransaction += customer.getMoney();
            } else {
                totalTransaction -= customer.getMoney();
            }

            System.out.println(customer.getName() + " " + (customer.isPayOrWithdraw() ? "paid " : " withdrew ") + customer.getMoney());
        }

        System.out.println("Total transaction " + Colors.ANSI_RED + totalTransaction + Colors.ANSI_RESET);
    }

}
