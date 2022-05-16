package zah.week09.bank;

public class BankCounter {
    private String name;

    public BankCounter(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

