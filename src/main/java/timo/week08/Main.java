package timo.week08;


public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Gang Bank");
        Counter counter1 = new Counter(bank, "Counter 1", 500);
        Counter counter2 = new Counter(bank, "Counter2", 1000);

        Customer customer1 = new Customer("Dieter", 100);

        bank.addCounter(counter2);
        bank.addCounter(counter1);

        System.out.println(bank);

        System.out.println(counter1);

        counter1.empty();
        System.out.println(counter1);

        counter1.fillCounter();
        System.out.println(counter1);

        counter1.empty();
        System.out.println(counter1);

        customer1.deposit(50, counter1);
        System.out.println(counter1);

        customer1.withdraw(25, counter1);
        System.out.println(counter1);
        System.out.println(counter2);
    }
}
