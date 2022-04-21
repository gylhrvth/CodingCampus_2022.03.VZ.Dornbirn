package cemil.week06;

public class Day3Strings {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distaneFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        tabelle(firstName, lastName, age, place, distaneFromCapital);


    }

    public static void tabelle(String[] first, String[] last, int[] age, String[] place, float[] distance) {
        String headerLine = String.format("| %-20s | %-15s | %5s | %-15s | %-13s |", "Firstname", "Lastname", "Age", "Place", "DistanceCap");
//        System.out.printf("| %-20s | %-15s | %10s | %-15s | %-13s |%n", "Firstname", "Lastname", "Age", "Place", "DistanceCap");
        System.out.println(headerLine);
        System.out.println("|" + "-".repeat(headerLine.length() - 2) + "|");
        for (int i = 0; i < first.length; i++) {

            System.out.printf("| %-20s | %-15s | %5d | %-15s | %10.2f km |%n", first[i], last[i], age[i], place[i], distance[i]);

        }

    }
}
