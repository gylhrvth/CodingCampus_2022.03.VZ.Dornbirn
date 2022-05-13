package timo.week08;


public class Transaction {

    private int value;
    private Customer customer;
    private Counter counter;

    public Transaction(Customer customer, Counter counter) { // save counter to list n bank vector para == vector bank liste
        this.value = customer.getMoney();
        this.customer = customer;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "value=" + value +
                ", customer=" + customer +
                ", counter=" + counter +
                '}';
    }
}
