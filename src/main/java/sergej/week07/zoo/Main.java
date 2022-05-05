package sergej.week07.zoo;

public class Main {
    public static void main(String[] args) {

        Zoo schoenbrunn = new Zoo("Tiergarten Schönbrunn", "Wien", 1752);

        Enclosure marsh = schoenbrunn.addEnclosure("Marsh");
        Enclosure desert = schoenbrunn.addEnclosure("Desert");
        Enclosure jungle = schoenbrunn.addEnclosure("Jungle");

        marsh.addAnimals("Hans", "Crocodile");
        desert.addAnimals("Timo","Gerbil");
        jungle.addAnimals("Raz Fratelli","Monkey");
        jungle.addAnimals("Peter","Snake");
        System.out.println(schoenbrunn);

    }
}
