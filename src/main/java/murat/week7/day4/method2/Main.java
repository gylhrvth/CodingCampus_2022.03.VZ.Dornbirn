package murat.week7.day4.method2;

public class Main {

    public static void main(String[] args) {
        Shelf vaseShelf = new Shelf("Chinese Vase Shelf", 100);

        Vase chinaVase = new Vase(vaseShelf, "Blue", 25);
        Vase thaiVase = new Vase(vaseShelf, "Green", 30);
        System.out.println(vaseShelf);
    }

}
