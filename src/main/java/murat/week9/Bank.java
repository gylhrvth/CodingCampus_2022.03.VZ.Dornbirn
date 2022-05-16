package murat.week9;

import murat.Colors;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Bank {
    private String name;

    private List<Counter> counters = new Vector<>();

    private List<Customer> customers = new Vector<>();

    public Bank(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public List<Counter> getCounters() {

        return counters;
    }

    public List<Customer> getCustomers() {

        return customers;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setCounters(List<Counter> counters) {

        this.counters = counters;
    }

    public void setCustomers(List<Customer> customers) {

        this.customers = customers;
    }

    public Counter addCounter(int counterNumber, boolean free, float moneyAvailable) {

        Counter counter = new Counter(counterNumber, free, moneyAvailable);
        counters.add(counter);
        return counter;
    }

    public Customer addCustomer(String name, boolean payOrWithdraw, float money, boolean satisfied) {

        Customer cus = new Customer(name, payOrWithdraw, money, satisfied);
        customers.add(cus);
        return cus;
    }

    @Override
    public String toString() {

        return "Bank{" +
                "name='" + name + '\'' +
                ", counters=" + counters +
                ",\n\t\t\t\t\t\tcustomers=" + customers +
                '}';
    }

    public static Bank createABank(String bankName) {

        Bank aBank = new Bank(bankName);
        Random rand = new Random();

        String[] letters = {"Tom", "Leonardo", "Kate", "Julia", "Bob", "Mia", "Aaron", "Kirk", "Isabella",
                "Sophia", "Jack", "Charlie", "Edward", "Arthur", "Charlotte", "Alice", "Teddy", "Lucas",
                "Eva", "Hugo", "Harriet", "Albert", "David", "Matilda"};

        for (int i = 1; i <= 3; i++) {
            aBank.addCounter(i, true, i * 1000);
        }

        int limit = rand.nextInt(10);
        for (int i = 1; i <= 5; i++) {
            aBank.addCustomer(letters[rand.nextInt(letters.length)], rand.nextBoolean(), (float) (i * 1000 / 5), false);
        }
        return aBank;
    }

    public void bankSimulation() {

        Random rand = new Random();

        for (int i = 0; i < customers.size(); i++) {

            for (int j = 0; j < counters.size(); j++) {

                // If a counter is free
                if (counters.get(j).isFree()) {

                    // If there are enough money at the counter
                    if (!counters.get(j).thereIsNoMoneyAtACounter(customers.get(i))) {

                        // If a customer is not served
                        if (!customers.get(i).getSatisfied()) {

                            // Transaction done
                            counters.get(j).transactionACustomerAtACounter(customers.get(i));

                            // Counter is occupied
                            counters.get(j).setFree(false);

                            // Customer is served
                            customers.get(i).setSatisfied(true);

                            System.out.println("Situation: " + (i + 1) + " Customer: " + customers.get(i) + " is at the counter " + counters.get(j) + " and " +
                                    (customers.get(i).isPayOrWithdraw() ? Colors.ANSI_GREEN + "pays " + customers.get(i).getMoney() + Colors.ANSI_RESET : Colors.ANSI_RED + "withdraws " + customers.get(i).getMoney() + Colors.ANSI_RESET));
                            System.out.println("Situation: " + (i + 1) + ": Money at the counter " + Colors.ANSI_YELLOW + Colors.BOLD + Colors.BG_BLACK + counters.get(j).getMoneyAvailable() + Colors.ANSI_RESET);

                            // Open a new random counter
                            if (Counter.allCountersAreOccupied(counters)) {
                                counters.get(rand.nextInt(counters.size() - 1)).setFree(true);
                                System.out.println("Situation: " + (i + 1) + " Counter " + counters.get(rand.nextInt(counters.size() - 1)) + " is FREE!");
                            }
                        }

                    } else {  // In case of no money at a counter
                        counters.get(j).setMoneyAvailable(5000);
                        counters.get(j).setFree(false);
                        System.out.println("Situation: " + (i + 1) + " Counter " + counters.get(j) + " filled the money box");
                        i--;
                        counters.get(rand.nextInt(counters.size() - 1)).setFree(true);
                        System.out.println("Situation: " + (i + 1) + " Counter " + counters.get(rand.nextInt(counters.size() - 1)) + " is FREE!");
                    }

                } else {

                    // System.out.println("Situation: " + (i + 1) + " Customer: " + customers.get(i) + " is waiting!!!");
                }
            }
        }
    }
}
