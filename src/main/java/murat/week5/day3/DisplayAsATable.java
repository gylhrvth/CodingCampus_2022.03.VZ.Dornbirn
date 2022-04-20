package murat.week5.day3;

public class DisplayAsATable {
    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        int lengthFirstName = getMaxString(firstName);
        int lengthLastName = getMaxString(lastName);
        int lengthAge = getMaxInt(age);
        int lengthPlace = getMaxString(place);
        int lengthDist = getMaxFloat(distanceFromCapital);

        //System.out.println(lengthFirstName + " " + lengthLastName + " " + lengthAge + " " + lengthPlace + " " + lengthDist);

        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.printf("| %" + (-(lengthFirstName + 1)) + "s | %" + (-(lengthLastName + 1)) +
                    "s | %" + (lengthAge + 1) + "d | %" + (-(lengthPlace + 1)) +
                    "s |%" + (lengthDist + 3) + ".1f|%n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }

    }

    public static int getMaxString(String[] text) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < text.length; i++) {
            if (text[i].length() > max) {
                max = text[i].length();
            }
        }
        return max;
    }

    public static int getMaxInt(int[] number) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {

            if (number[i] > max) {
                max = number[i];
            }
        }

        return (int) (Math.log10(max) + 1);
    }

    public static int getMaxFloat(float[] distance) {

        float max = Float.MIN_VALUE;

        for (int i = 0; i < distance.length; i++) {
            if (distance[i] > max) {
                max = distance[i];
            }
        }
        return (int) (Math.log10(max) + 1);
    }
}
