package aron.week08.bank;

public class MainBank {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Customer customer1 = new Customer("John", 500);
        Customer customer2 = new Customer("Kurt", 100);
        Customer customer3 = new Customer("Jinx", 1000);
        Customer customer4 = new Customer("Lucy", 80);
        Customer customer5 = new Customer("Victor", 90);
        Customer customer6 = new Customer("Darius", 600);
        Customer customer7 = new Customer("Ezio", 400);
        Customer customer8 = new Customer("Sally", 80);

        Counter counter1 = new Counter(bank, "Counter1", 5000);
        Counter counter2 = new Counter(bank, "Counter2", 1000);
        Counter counter3 = new Counter(bank, "Counter3", 3000);

        bank.addCounter(counter1, customer1);
        bank.addCounter(counter2, customer2);
        bank.addCounter(counter3, customer3);
        bank.addCounter(counter1, customer4);
        bank.addCounter(counter2, customer5);
        bank.addCounter(counter1, customer6);
        bank.addCounter(counter2, customer7);
        bank.addCounter(counter3, customer8);


        customer1.withdraw(1000, customer1.checkCounter(bank));
        System.out.println(bank);
        customer1.deposit(100, customer1.checkCounter(bank));
        System.out.println(bank);

        customer2.withdraw(1100, customer2.checkCounter(bank));
        System.out.println(bank);
        customer2.deposit(10, customer2.checkCounter(bank));
        System.out.println(bank);

        customer3.withdraw(1000, customer3.checkCounter(bank));
        System.out.println(bank);
        customer3.deposit(100, customer3.checkCounter(bank));
        System.out.println(bank);

        customer4.withdraw(1000, customer4.checkCounter(bank));
        System.out.println(bank);
        customer4.deposit(100, customer4.checkCounter(bank));
        System.out.println(bank);

        customer5.withdraw(1000, customer5.checkCounter(bank));
        System.out.println(bank);
        customer5.deposit(100, customer5.checkCounter(bank));
        System.out.println(bank);

        customer6.withdraw(1000, customer6.checkCounter(bank));
        System.out.println(bank);
        customer6.deposit(100, customer6.checkCounter(bank));
        System.out.println(bank);

        customer7.withdraw(1000, customer7.checkCounter(bank));
        System.out.println(bank);
        customer7.deposit(100, customer7.checkCounter(bank));
        System.out.println(bank);

        customer8.withdraw(1000, customer8.checkCounter(bank));
        System.out.println(bank);
        customer8.deposit(100, customer8.checkCounter(bank));
        System.out.println(bank);


    }


        public static final String RED = "\033[0;31m";
        public static final String CYAN = "\033[0;36m";
        public static final String RESET = "\033[0m";
    }
