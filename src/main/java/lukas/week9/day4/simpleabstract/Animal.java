package lukas.week9.day4.simpleabstract;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

    public abstract void gibLaut();
}
