package timo.week08;


public class Counter {

    private String name;
    private int capacity;
    private int maxCapacity;
    private boolean coffeBreak;
    private Transaction trans;
    private Bank bank;


    public Counter(Bank bank, String name, int maxCapacity) {
        this.name = name;
        this.capacity = maxCapacity;
        this.maxCapacity = maxCapacity;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return name + " (current capacity = " + capacity + "€)" + " Coffeebreak: " + coffeBreak;
    }

    public int fillCounter() {
        if (capacity == 0) {
            capacity = maxCapacity;
            coffeBreak = true;
        }

        return capacity;
    }

    public int depositToCounter(Transaction trans) {
        capacity += trans.getValue();

        return capacity;
    }


    public Counter withdrawFromCounter(Transaction trans) {
       Counter counter = this;
        if (trans.getValue() <= capacity && !counter.coffeBreak) {
            capacity -= trans.getValue();
        } else {
            for (Counter c : bank.getListOfCounters()) {
                if (!c.coffeBreak) {
                    counter = c;
                    return counter;
                }

            }
        }
        return counter;
    }

    public int empty() {
        capacity = 0;
        return capacity;
    }


}
