package arda.week08.bank;

import java.util.Random;

public class BankCreator {
    static Random rand = new Random();

    public static void main(String[] args) {
        Bank bank = new Bank("Maze Bank");
        int randomCash = rand.nextInt(71) + 30;
        int randomCashInBank = rand.nextInt(19974) + 27;

        Counter counter1 = new Counter(1, 500);
        Counter counter2 = new Counter(2, 500);
        Counter counter3 = new Counter(3, 500);
        Counter counter4 = new Counter(4, 500);

        Customer[] customers = {new Customer(bank, "Arda Yalcin", randomCash, randomCashInBank),
                new Customer(bank, "Stephen Strange", randomCash, randomCashInBank),
                new Customer(bank, "Gabe Newell", randomCash, randomCashInBank),
                new Customer(bank, "Marcus Holloway", randomCash, randomCashInBank),
                new Customer(bank, "Bill Jobs", randomCash, randomCashInBank)};

        bank.addCounter(counter1);
        bank.addCounter(counter2);
        bank.addCounter(counter3);
        bank.addCounter(counter4);

        for (Customer customer : customers) {
            customer.enterBank(bank);
        }

        for (int i = 1; i < 6; i++) {
            bank.simulateDays(i);
        }
    }
}
