package sergej.week07.zoo;

public class Main {
    public static void main(String[] args) {

        Zoo schoenbrunn = new Zoo("Tiergarten Schönbrunn", "Wien", 1752);

        Enclosure marsh = schoenbrunn.addEnclosure("Marsh");
        Enclosure desert = schoenbrunn.addEnclosure("Desert");
        Enclosure jungle = schoenbrunn.addEnclosure("Jungle");

        Animal croc = marsh.addAnimals("Hans", "Crocodile");
        Animal gerb = desert.addAnimals("Timo", "Gerbil");
        Animal monkey = jungle.addAnimals("Raz Fratelli", "Monkey");
        Animal snake = jungle.addAnimals("Peter", "Snake");

        schoenbrunn.removeEnclosure(marsh);
        jungle.removeAnimals(snake);

        System.out.println(schoenbrunn);

    }
}
