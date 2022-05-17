package zah.week09.bank;

import java.util.Random;
import java.util.Vector;

public class BankCounter {
    private static Random rand = new Random();
    private enum CASHIER_STATE {
        FREE,
        SERVICE,
        REFILL,
        COFFEE_BREAK
    }
    private int id;
    private int balance;
    private Bank bank;
    private Customer currentCustomer = null;
    private CASHIER_STATE currentState = CASHIER_STATE.FREE;
    private int tickToLeft;
    private Vector<Customer> dailyStat = new Vector<>();

    public BankCounter(int id, int balance){
        this.id = id;
        this.balance = balance;
    }

    public void printStructure() {
        System.out.printf("    %2d (Balance: %6d) has served %d customers.%n", id, balance, dailyStat.size());
        for (Customer c : dailyStat){
            System.out.printf("        %s%n", c.getName());
        }
    }

    public void setBank(Bank bank) {
        if (this.bank == null) {
            this.bank = bank;
        }
    }

    public void simulateTick() {
        switch (currentState){
            case FREE:
                currentCustomer = bank.getNextCustomer();
                if (currentCustomer != null){
                    currentState = CASHIER_STATE.SERVICE;
                    tickToLeft = 5 + rand.nextInt(5);
                    System.out.printf("%s comes to cashier %d%n", currentCustomer.getName(), id);
                }
                break;
            case SERVICE:
                --tickToLeft;
                if (tickToLeft <= 0){
                    currentCustomer = null;
                    if (rand.nextInt(100) < 20){
                        currentState = CASHIER_STATE.COFFEE_BREAK;
                        tickToLeft = 10;
                        System.out.printf("%d is ready. He take coffee break%n", id);
                    } else {
                        currentState = CASHIER_STATE.FREE;
                        System.out.printf("%d is ready for the next customer.%n", id);
                    }
                } else if (tickToLeft == 1) {
                    if (currentCustomer.getTransaction() == Customer.TRANSACTION.WITHDRAW){
                        if (currentCustomer.getAmount() > balance) {
                            System.out.printf("%s has to wait for the next free cashier.%n", currentCustomer.getName());
                            bank.sendCustomerBackToWaiting(currentCustomer);
                            currentCustomer = null;
                            currentState = CASHIER_STATE.REFILL;
                            tickToLeft = 20;
                            System.out.printf("%d has to refill the desk.%n", id);
                        } else {
                            balance -= currentCustomer.getAmount();
                            dailyStat.add(currentCustomer);
                            System.out.printf("%d has given %s %d$.%n", id, currentCustomer.getName(), currentCustomer.getAmount());
                        }
                    } else {
                        balance += currentCustomer.getAmount();
                        dailyStat.add(currentCustomer);
                        System.out.printf("%d has received %s %d$.%n", id, currentCustomer.getName(), currentCustomer.getAmount());
                    }
                }
                break;
            case REFILL:
                --tickToLeft;
                if (tickToLeft <= 0){
                    balance += 1000 + 1000 * rand.nextInt(5);
                    currentState = CASHIER_STATE.FREE;
                }
                break;
            case COFFEE_BREAK:
                --tickToLeft;
                if (tickToLeft <= 0){
                    currentState = CASHIER_STATE.FREE;
                    System.out.printf("%d has finished the break. He is ready for the next customer.%n", id);
                }
                break;
            default:
                break;
        }
    }

    public boolean isFree(){
        return currentState == CASHIER_STATE.FREE;
    }
}

