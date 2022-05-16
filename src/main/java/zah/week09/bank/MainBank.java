package zah.week09.bank;

public class MainBank {
    public static void main(String[] args) {
        Bank b =new Bank("Reiffeisenbank");

        Customer customer1 = new Customer("Hans",5624);
        Customer customer2 = new Customer("Franz",7624);
        Customer customer3 = new Customer("Julia",9624);
        Customer customer4 = new Customer("Maria",23624);

        BankCounter bk1= new BankCounter("Privileg");
        BankCounter bk2= new BankCounter("CurentAcount");
        b.addCustomer(customer1);
        b.addCustomer(customer2);
        b.addCustomer(customer3);
        b.addCustomer(customer4);

        b.addBankCounter(bk1);
        b.addBankCounter(bk2);





        System.out.println(b);

    }
}
