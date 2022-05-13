package sergej.week08;

public class BankMain {

    public static void main(String[] args) {
        Bank bank = new Bank("Sparkasse");
        Counter counter1 = new Counter(bank,"Counter 1",500);
        Customer customer1 = new Customer("Hans",100);
        Counter counter2 = new Counter(bank,"Counter2",1000);
        Counter counter3 = new Counter(bank,"Counter 3",1000);


        bank.addCounter(counter2);
        bank.addCounter(counter1);
        bank.addCounter(counter3);


        System.out.println(bank);

        System.out.println(counter1);

        counter1.zero();
        System.out.println(counter1);

        counter1.fillCounter();
        System.out.println(counter1);

        counter1.zero();
        System.out.println(counter1);

        customer1.deposit(50,counter1);
        System.out.println(counter1);
        System.out.println(counter2);
        customer1.withdraw(25,counter1);
        System.out.println(counter1);
        System.out.println(counter2);

        customer1.deposit(25,counter2);
        System.out.println(counter2);
        System.out.println(counter3);
        counter3.zero();
        System.out.println(counter3);
        customer1.deposit(50,counter2);
        System.out.println(counter3);

        customer1.checkCounter(bank);
        customer1.deposit(100,customer1.checkCounter(bank));

        System.out.println(bank);
    }


}
