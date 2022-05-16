package gyula.week09.bank;

public class Customer {

    public enum TRANSACTION {
        WITHDRAW,
        DEPOSIT
    }

    private String name;
    private TRANSACTION transaction;
    private int amount;

    public Customer(String name, TRANSACTION transaction, int amount){
        this.name = name;
        this.transaction = transaction;
        this.amount = amount;
    }

    public void printStructure() {
        System.out.printf("    %-20s %-9s %6d%n",
                name.substring(0, Math.min(name.length(), 20)),
                transaction,
                amount);
    }


    public TRANSACTION getTransaction() {
        return transaction;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
}
