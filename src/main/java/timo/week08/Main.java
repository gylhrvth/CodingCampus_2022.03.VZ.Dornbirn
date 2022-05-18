package timo.week08;


import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Gang Bank");
        Counter counter1 = new Counter(bank, "Counter 1", 5000);
        Counter counter2 = new Counter(bank, "Counter2", 5000);
        Counter counter3 = new Counter(bank, "Counter 3", 5000);

        Customer customer1 = new Customer(bank, "Dieter");
        Customer customer2 = new Customer(bank, "Hans");
        Customer customer3 = new Customer(bank, "Franz");
        Customer customer4 = new Customer(bank, "Klaus");
        Customer customer5 = new Customer(bank, "Peter");

        bank.addCounter(counter1);
        bank.addCounter(counter2);
        bank.addCounter(counter3);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);
        bank.addCustomer(customer4);
        bank.addCustomer(customer5);

        System.out.println(bank);


        for (Customer c : bank.getCustomers()) {
            Random random = new Random();
            int action = random.nextInt(1, 3);

            if (action == 1) {
                c.deposit(random.nextInt(1000));
            } else if (action == 2) {
                c.withdraw(random.nextInt(1000));
            }
        }

        System.out.println(bank);

    }
}
