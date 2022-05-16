package cemil.week10;

import java.util.ArrayList;
import java.util.List;


public class NewBank {
    private String name;
    private List<Customer> customers = new ArrayList<>();
    private List<BankCounter> bankCounters = new ArrayList<>();


    public NewBank(String name) {
        this.name = name;
    }

    public void addBankCounter(BankCounter bankCounter) {
        if (!bankCounters.contains(bankCounter)) {
            bankCounters.add(bankCounter);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for (Customer c : customers) {
            builder.append(System.lineSeparator());
            c.toString(builder);
        }

        for (BankCounter bc : bankCounters) {
            builder.append(System.lineSeparator());
            builder.append(bc.toString());
        }

        return builder.toString();
    }


}
