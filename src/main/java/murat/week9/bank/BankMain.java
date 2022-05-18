package murat.week9.bank;

public class BankMain {
    public static void main(String[] args) {

        Bank ba = Bank.createABank("Bank Austria");

        System.out.println("\nCOUNTERS AND CUSTOMERS-----------------------\n" + ba + "\n");

        ba.bankSimulation();

        ba.counterStats();
    }
}
