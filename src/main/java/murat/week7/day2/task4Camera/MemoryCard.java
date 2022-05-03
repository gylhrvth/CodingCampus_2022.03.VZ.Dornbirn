package murat.week7.day2.task4Camera;

public class MemoryCard {

    private final String name;

    private float totalStorage;

    private float freeStorage;

    public MemoryCard(String name, float totalStorage, float freeStorage) {

        this.name = name;
        this.totalStorage = totalStorage;
        this.freeStorage = freeStorage;
    }

    public String toString() {

        return "Name: " + name + " Total Storage: " + totalStorage + " Free Storage: " + freeStorage;
    }

    public String getName() {

        return name;
    }

    public float getTotalStorage() {

        return totalStorage;
    }

    public float getFreeStorage() {

        return freeStorage;
    }

    public void setFreeStorage(float aNumber) {

        this.freeStorage = aNumber;
    }
}
