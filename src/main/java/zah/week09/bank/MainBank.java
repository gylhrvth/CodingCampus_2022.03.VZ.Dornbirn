package zah.week09.bank;


import java.util.Random;
;

public class MainBank {
    private static Random rand = new Random();
    private static String[] firstNames = {"Aron", "Timo", "Sergej"};
    private static String[] lastNames = {"Simma", "Wohlgenannt", "Zumtobel", "Schmidt", "Klein", "Egger"};

    public static void main(String[] args) {
        Bank hypo = new Bank("Hypo Campus");
        for (int i = 0; i < 4; i++) {
          BankCounter c = new BankCounter(1+i, 1000);
            hypo.addCashier(c);
        }
        /* Start der Simulation */
        int maxTick = 200;
        for (int i = 1; i <= maxTick; i++) {
            generateCustomer(hypo);
            hypo.simulateTick();
        }
        while (!hypo.dayReady()){
            hypo.simulateTick();
        }
        hypo.printStructure();
    }

    private static void generateCustomer(Bank bank) {
        if (rand.nextInt(100) < 10){
            Customer.TRANSACTION t = Customer.TRANSACTION.WITHDRAW;
            if (rand.nextInt(100) < 20){
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










