package cemil.week10.bank;


import java.util.Random;

public class BankMain {
    private static Random rand = new Random();
    private static String[] firstNames = {"Cemil", "Timo", "Sergej", "Razvan", "Aron", "Murat", "Arda", "Philipp"};
    private static String[] lastNames = {"Simma", "Wohlgenannt", "Zumtobel", "Schmidt", "Klein", "Egger", "Müller", "Schwazmann"};

    public static void main(String[] args) {
        Bank sparkasseDornbirn = new Bank("Sparkasse Dornbirn");
        for (int i = 0; i < 5; i++) {
            Cashier c = new Cashier(1 + i, 1000);
            sparkasseDornbirn.addCashier(c);
        }
        /* Start der Simulation */
        int maxTick = 200;
        for (int i = 1; i <= maxTick; i++) {
            generateCustomer(sparkasseDornbirn);
            sparkasseDornbirn.simulateTick();
        }
        while (!sparkasseDornbirn.dayReady()) {
            sparkasseDornbirn.simulateTick();
        }
        sparkasseDornbirn.printStructure();
    }

    private static void generateCustomer(Bank bank) {
        if (rand.nextInt(100) < 10) {
            Customer.TRANSACTION t = Customer.TRANSACTION.WITHDRAW;
            if (rand.nextInt(100) < 20) {
                t = Customer.TRANSACTION.DEPOSIT;
            }
            Customer c = new Customer(
                    firstNames[rand.nextInt(firstNames.length)] + " " +
                            lastNames[rand.nextInt(lastNames.length)],
                    t,
                    100 + (rand.nextInt(16) * 100));
            bank.addCustomer(c);
            System.out.printf("%s has arrived in the bank.%n", c.getName());
        }
    }
}
