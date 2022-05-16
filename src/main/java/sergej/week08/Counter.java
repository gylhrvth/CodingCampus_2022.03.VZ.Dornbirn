package sergej.week08;

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

    public Counter depositToCounter(Transaction trans) {
        Counter counter = this;
        if (trans.getValue() + capacity <= maxCapacity && !counter.coffeBreak) {
            capacity += trans.getValue();
        } else {
            for (Counter c : bank.getListOfCounters()) {
                if (trans.getValue() + c.getCapacity() <= c.getMaxCapacity() && !c.coffeBreak) {
                    counter = c;
                    return counter;

                }

            }

        }

        return counter;
    }


    public Counter withdrawFromCounter(Transaction trans) {
        Counter counter = this;
        if (trans.getValue() <= capacity && !counter.coffeBreak) {
            capacity -= trans.getValue();
            System.out.println(  " withdrawed " + trans.getValue() + "€ from " + counter);
        } else {
            for (Counter c : bank.getListOfCounters()) {
                if (trans.getValue() <= c.getCapacity() && !c.coffeBreak) {
                    counter = c;
                    System.out.println(  " withdrawed " + trans.getValue() + "€ from " + counter);
                    return counter;
                }

            }
        }
        return counter;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int zero() {
        capacity = 0;
        return capacity;
    }

    public boolean getCoffeeBreak(){
        return coffeBreak;
    }
}
