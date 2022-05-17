package sergej.week09;


public class Counter {

    private String name;
    private float capacity;
    private float maxCapacity;
    private boolean coffeBreak;


    public Counter( String name, float maxCapacity) {
        this.name = name;
        this.capacity = maxCapacity;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return name + " (current capacity = " + capacity + "€)" + " Coffeebreak: " + coffeBreak;
    }

    public float getCapacity() {
        return capacity;
    }

    public float getMaxCapacity() {
        return maxCapacity;
    }

    public boolean isCoffeBreak() {
        return coffeBreak;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public void setCoffeBreak(boolean coffeBreak) {
        this.coffeBreak = coffeBreak;
    }

    public void withdraw(float amount) {
        capacity -= amount;
    }
}
