package arda.week08.bank;

import java.util.Random;

public class Counter {
    static final String RESET = "\033[0m";
    static final String RED = "\033[0;91m";
    static final String WHITE = "\033[0;97m";
    static final String YELLOW = "\033[0;93m";

    private enum COUNTER_STATE {
        UNOCCUPIED,
        OCCUPIED,
        COFFEE_BREAK,
        MONEY_REFILL,
    }

    private Random rand = new Random();
    private int tick;
    private COUNTER_STATE currentState = COUNTER_STATE.UNOCCUPIED;
    private Bank bank;
    private int counterNumber;
    private int moneyInCounter;
    private Customer currentCustomer = null;
    private final int withdrawnMoney;

    public Counter(int counterNumber, int moneyInCounter) {
        this.counterNumber = counterNumber;
        this.moneyInCounter = moneyInCounter;
        withdrawnMoney = rand.nextInt(moneyInCounter) + 5;
    }

    public void simulate() {
        switch (currentState) {
            case UNOCCUPIED -> {
                currentCustomer = bank.getNextCustomer();
                if (currentCustomer != null) {
                    currentState = COUNTER_STATE.OCCUPIED;
                    tick = 10;
                    System.out.println(YELLOW + currentCustomer.getCustomerName() + " is at " + RESET + RED + "counter" + counterNumber + "." + RESET);
                }
            }
            case OCCUPIED -> {
                --tick;
                if (tick <= 0) {
                    removeCustomer();
                    if (rand.nextInt(100) > 20) {
                        currentState = COUNTER_STATE.COFFEE_BREAK;
                        tick = 10;
                        System.out.println(WHITE + "-------------------------------------------------" + RESET);
                        System.out.println(YELLOW + "Counter" + counterNumber + " is now " + RESET + RED + "on break." + RESET);
                    } else {
                        System.out.println(YELLOW + "Counter" + counterNumber + " is " + RESET + RED + "unoccupied." + RESET);
                    }
                } else if (tick == 1) {
                    if (rand.nextInt(2) + 1 == 1) {
                        if (withdrawnMoney > moneyInCounter) {
                            System.out.println(YELLOW + currentCustomer + " has to wait for counter" + counterNumber + " to " + RESET + RED + "refill." + RESET);
                            System.out.println(YELLOW + currentCustomer + RESET + RED + " has to wait for the counter to refill." + RESET);
                            bank.letCustomerWait(currentCustomer);
                            removeCustomer();
                            currentState = COUNTER_STATE.MONEY_REFILL;
                            tick = 20;
                            System.out.println(YELLOW + "Counter" + counterNumber + " is being " + RESET + RED + "refilled" + RESET);
                        } else {
                            chanceToFart();
                            changeMoneyAmount(withdrawnMoney * (-1));
                            System.out.println(WHITE + "-----------------------------------------------------------" + RESET);
                            System.out.println(currentCustomer + " has withdrawn " + RED + withdrawnMoney + "€" + RESET + " at counter" + counterNumber + ".");
                            System.out.println("counter" + counterNumber + " has " + (moneyInCounter) + "€ left.");
                        }
                    } else {
                        int depositedMoney = rand.nextInt(currentCustomer.getCash()) + 5;
                        chanceToFart();
                        changeMoneyAmount(depositedMoney);
                        System.out.println(WHITE + "-----------------------------------------------------------" + RESET);
                        System.out.println(currentCustomer + " has deposited " + RED + depositedMoney + "€" + RESET + " at counter" + counterNumber + ".");
                        System.out.println("counter" + counterNumber + " has " + RED + (moneyInCounter) + "€" + RESET + " left.");
                    }
                }
            }
            case MONEY_REFILL -> {
                --tick;
                if (tick <= 0) {
                    refillMoney();
                    currentState = COUNTER_STATE.UNOCCUPIED;
                }
            }
            case COFFEE_BREAK -> {
                --tick;
                if (tick <= 0) {
                    currentState = COUNTER_STATE.UNOCCUPIED;
                    System.out.println(YELLOW + "Counter" + counterNumber + " is no longer on " + RESET + RED + "break." + RESET);
                }
            }
            default -> {
            }
        }
    }

    public void refillMoney() {
        moneyInCounter += 1050 * rand.nextInt(6);
        System.out.println(RED + "counter has been refilled!" + RESET);
    }

    public void removeCustomer() {
        if (currentCustomer != null) {
            currentCustomer = null;
        }
    }

    public int getCounterNumber() {
        return counterNumber;
    }

    public int getMoneyInCounter() {
        return moneyInCounter;
    }

    public void chanceToFart() {
        if (rand.nextInt(5) + 1 == 5) {
            System.out.println(WHITE + "-----------------------------------------------------------" + RESET);
            System.out.println(RED + currentCustomer + " has farted loudly." + RESET);
        }
    }

    public void changeMoneyAmount(int amount) {
        moneyInCounter += amount;
        if (moneyInCounter <= 0) {
            refillMoney();
        }
    }

    public boolean isAvailable() {
        return currentState == COUNTER_STATE.UNOCCUPIED;
    }

    @Override
    public String toString() {
        String output = "";
        output = "\nCounter" + counterNumber + "\n" + "     moneyInCounter: " + WHITE + moneyInCounter + "€" + RESET +
                "\n" + "        customers at counter: ";
        if (currentCustomer != null) {
            output += currentCustomer + "\n";
        }
        return output;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
