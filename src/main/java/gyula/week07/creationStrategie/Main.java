package gyula.week07.creationStrategie;

public class Main {
    public static void main(String[] args) {
        Shelf s1 = new Shelf("Kinderbücher", 100);
        Book b1 = new Book("Anton Albert", "Der kleiner Frosch");
        Book b2 = new Book("Bertold Brecht", "Kochen für Anfänger");

        s1.addBook(b1);
        s1.addBook(b2);

        Vase v1 = new Vase(s1, "blue", 15);
        Vase v2 = new Vase(s1, "blue-green", 17);

        s1.addPicture(1998, "Hochzeit", "Onkel Tom und Tante Emma");

        System.out.println(s1);
    }

}
