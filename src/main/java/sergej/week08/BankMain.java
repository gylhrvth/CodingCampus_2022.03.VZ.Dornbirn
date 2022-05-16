package sergej.week08;

public class BankMain {

    public static void main(String[] args) {
        Bank bank = new Bank("Sparkasse");
        Counter counter1 = new Counter(bank,"Counter 1",500);
        Customer customer1 = new Customer("Hans",100);
        Customer customer2 = new Customer("Franz",200);
        Counter counter2 = new Counter(bank,"Counter2",1000);
        Counter counter3 = new Counter(bank,"Counter 3",2000);


        bank.addCounter(counter2);
        bank.addCounter(counter1);
        bank.addCounter(counter3);


        customer1.withdraw(500,customer1.checkCounter(bank));
        System.out.println(bank);
        customer1.deposit(100,customer1.checkCounter(bank));
        System.out.println(bank);

        customer2.withdraw(1000,customer2.checkCounter(bank));
        System.out.println(bank);
        customer2.deposit(10,customer2.checkCounter(bank));
        System.out.println(bank);


    }


}
