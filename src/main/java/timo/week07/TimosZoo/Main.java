package timo.week07.TimosZoo;

public class Main {
    public static void main(String[] args) {

        Zoo z = new Zoo("Fluh Zoo", 1998);

        z.addEnclosure(new Enclosure("Aquarium"));
        z.addEnclosure(new Enclosure("Terrarium"));
        z.addEnclosure(new Enclosure("Monkey Enclosure"));

        System.out.println(z);



    }
}
