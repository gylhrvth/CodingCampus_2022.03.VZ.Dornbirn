package zah.week07.zoo;

public class MainZoo {
    public static void main(String[] args) {
        Zoo z = new Zoo("ZooTime",1986);

        z.addEnclosure(new Enclosure("Aquarium"));
       // z.addEnclosure(new Enclosure("Terrarium"));
       // z.addEnclosure(new Enclosure("MankyEnclosure"));

        System.out.println(z);



    }
}
