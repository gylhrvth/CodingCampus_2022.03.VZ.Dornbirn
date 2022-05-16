package murat.week9;

public class BankMain {
    public static void main(String[] args) {

        Bank ba = Bank.createABank("Bank Austria");

        System.out.println(ba + "\n");

        ba.bankSimulation();

        System.out.println("\nMoney at the bank");
        for (int i = 0; i < ba.getCounters().size(); i++) {
            System.out.println(ba.getCounters().get(i).getMoneyAvailable());
        }

        System.out.println("\nCustomers satisfied");
        for (int i = 0; i < ba.getCustomers().size(); i++) {
            System.out.println(ba.getCustomers().get(i).getSatisfied());
        }

    }

}
