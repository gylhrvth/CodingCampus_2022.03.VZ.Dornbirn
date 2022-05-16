package cemil.week10;



public class BankMain {
    public static void main(String[] args) {

        NewBank bank = new NewBank("Sparkasse");

        Customer customer1 = new Customer("Hans",5624);
        Customer customer2 = new Customer("Franz",7624);
        Customer customer3 = new Customer("Julia",9624);
        Customer customer4 = new Customer("Maria",23624);

        BankCounter bankCounter1 = new BankCounter("Schalter 1");
        BankCounter bankCounter2 = new BankCounter("Schalter 2");

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);
        bank.addCustomer(customer4);

        bank.addBankCounter(bankCounter1);
        bank.addBankCounter(bankCounter2);



        System.out.println(bank);


    }

}
