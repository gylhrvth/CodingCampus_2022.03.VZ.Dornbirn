package sergej.week09.Bank;

import java.util.Random;

public class BankMain {

    public static void main(String[] args) {

        Random random = new Random();

        Bank bank1 = new Bank("Sparkasse");
        Counter count1 = new Counter("Counter1", 1000f);
        Counter count2 = new Counter("Counter2", 1000f);
        Counter count3 = new Counter("Counter3", 500f);

        Customer customer1 = new Customer(bank1, "Dieter");
        Customer customer2 = new Customer(bank1, "Hans");
        Customer customer3 = new Customer(bank1, "Franz");
        Customer customer4 = new Customer(bank1, "Klaus");
        Customer customer5 = new Customer(bank1, "Peter");

        bank1.addCustomer(customer2);
        bank1.addCustomer(customer1);
        bank1.addCustomer(customer3);
        bank1.addCustomer(customer4);
        bank1.addCustomer(customer5);

        bank1.addCounter(count1);
        bank1.addCounter(count2);
        bank1.addCounter(count3);


        for (Customer c : bank1.getListOfCustomer()) {
            int action = random.nextInt(1,3);
            if (action == 1) {
                c.deposit(random.nextInt(1000));
            } else if (action == 2) {
                c.withdraw(random.nextInt(1000));
            }
        }
        System.out.println(bank1);

    }


}
