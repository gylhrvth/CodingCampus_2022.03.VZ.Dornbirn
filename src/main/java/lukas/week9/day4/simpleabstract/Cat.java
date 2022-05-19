package lukas.week9.day4.simpleabstract;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void gibLaut() {
        System.out.println("Miau miau BRRR");
    }
}
