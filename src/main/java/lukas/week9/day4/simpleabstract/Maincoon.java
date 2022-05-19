package lukas.week9.day4.simpleabstract;

public class Maincoon extends Cat {
    public Maincoon(String name) {
        super(name);
    }

    @Override
    public void gibLaut() {
        System.out.println("Roar roar roar!!!");
    }
}
