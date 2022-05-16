package sergej.week09;

public class BankMain {

    public static void main(String[] args) {

        Bank bank1 = new Bank("Sparkasse");
        Counter count1 = new Counter("Counter1", 1000f);
        Counter count2 = new Counter("Counter2", 1000f);
        Counter count3 = new Counter("Counter3", 500f);

        Customer customer1 = new Customer("Dieter");
        Customer customer2 = new Customer("Hans");

        bank1.addCustomer(customer2);
        bank1.addCustomer(customer1);

        bank1.addCounter(count1);
        bank1.addCounter(count2);
        bank1.addCounter(count3);
        System.out.println(bank1);
        customer1.withdraw(150, count1);
        System.out.println(bank1);
        customer1.deposit(100, count1);
        customer1.withdraw(1000,count1);
        System.out.println(bank1);

    }


}
