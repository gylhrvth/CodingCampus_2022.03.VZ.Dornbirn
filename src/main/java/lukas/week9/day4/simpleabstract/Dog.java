package lukas.week9.day4.simpleabstract;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void gibLaut() {
        System.out.println("Wau wau wau!!!");
    }
}
