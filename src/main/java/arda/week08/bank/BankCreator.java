package arda.week08.bank;

import java.util.Random;

public class BankCreator {
    static Random rand = new Random();
    private static String[] FirstName = {"Stephen", "Steve", "Nathan", "Johnathan", "Arda", "Jeremy", "Richard", "James"};
    private static String[] LastName = {"Strange", "Lee", "Drake", "Yang", "Park", "Yalcin", "Clarkson", "Hammond", "May"};
    private static int randomCash = rand.nextInt(71) + 30;
    private static int randomCashInBank = rand.nextInt(19974) + 27;

    public static void main(String[] args) {
        Bank bank = new Bank("Maze Bank");

        Counter counter1 = new Counter(1, 500);
        Counter counter2 = new Counter(2, 500);
        Counter counter3 = new Counter(3, 500);
        Counter counter4 = new Counter(4, 500);

        bank.addCounter(counter1);
        bank.addCounter(counter2);
        bank.addCounter(counter3);
        bank.addCounter(counter4);

        for (int i = 0; i < 100; i++) {
            customerGenerator(bank);
            bank.simulate();
            System.out.println(bank);
        }
    }

    public static void customerGenerator(Bank bank) {
        Customer customer = new Customer(bank, FirstName[rand.nextInt(FirstName.length)]
                + " " + LastName[rand.nextInt(LastName.length)], randomCash, randomCashInBank);
        bank.addCustomer(customer);
    }
}
