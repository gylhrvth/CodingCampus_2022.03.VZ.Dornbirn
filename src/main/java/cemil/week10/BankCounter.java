package cemil.week10;

public class BankCounter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankCounter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
