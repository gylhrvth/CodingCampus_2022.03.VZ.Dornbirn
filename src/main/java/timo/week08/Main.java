package timo.week08;


public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Gang Bank");
        Counter counter1 = new Counter(bank, "Counter 1", 500);
        Counter counter2 = new Counter(bank, "Counter2", 1000);
        Counter counter3 = new Counter(bank, "Counter 3", 1000);

        Customer customer1 = new Customer("Dieter", 100);

        bank.addCounter(counter1);
        bank.addCounter(counter2);
        bank.addCounter(counter3);

        System.out.println(bank);

        System.out.println();

        customer1.withdraw(700, customer1.checkCounter(bank));

        System.out.println(bank);

        System.out.println();

        customer1.deposit(100, customer1.checkCounter(bank));

        System.out.println(bank);
    }
}
