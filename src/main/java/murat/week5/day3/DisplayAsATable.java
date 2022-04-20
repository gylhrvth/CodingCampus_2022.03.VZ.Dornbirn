package murat.week5.day3;

public class DisplayAsATable {
    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.printf("|%-16s |%-13s |%-3d |%-15s |%-13.9f", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
            System.out.print("|");
            System.out.println();
            System.out.println("---------------------------------------------------------------------");

        }
    }
}
