package lukas.week7.day4.zoo;

public class ZooController {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Gefängnis", 1950);

        Prison prison = new Prison("P1");
        zoo.addPrison(prison);

        Prison prison1 = new Prison("P2");
        zoo.addPrison(prison1);

        Prison prison2 = new Prison("P3");
        zoo.addPrison(prison2);

        Prison prison3 = new Prison("P4");
        zoo.addPrison(prison3);

        zoo.removePrison(prison);

        System.out.println(Prison.ALL_CREATED_PRISONS_EVER);
    }
}
