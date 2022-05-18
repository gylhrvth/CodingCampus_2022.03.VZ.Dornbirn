package timo.week08;


public class Counter {

    private String name;
    private int capacity;
    private int maxCapacity;
    private boolean coffeBreak;


    public Counter(Bank bank, String name, int maxCapacity) {
        this.name = name;
        this.capacity = maxCapacity;
        this.maxCapacity = maxCapacity;
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


    public int empty() {
        capacity = 0;
        return capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public boolean getCoffeeBreak() {
        return coffeBreak;
    }

    public void setCoffeBreak(boolean coffeBreak) {
        this.coffeBreak = coffeBreak;
    }
}
