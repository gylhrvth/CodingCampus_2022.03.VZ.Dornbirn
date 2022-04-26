package timo.week05;


public class DateTable {
    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer fdfdfgfdgfjgfgfdgfdgdjgdjgfjgfdgjf", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 1008, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};




        printDateTable(firstName, lastName, age, place, distanceFromCapital);
    }

    public static int getStringLength(String[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i].length()) {
                max = array[i].length();
            }
        }
        return max;
    }

    public static int getMaxNumberLength(float[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
                int len = getNumberLength(array[i]);
                if (max < len) {
                    max = len;
                }
        }
        return max;
    }

    public static int getMaxNumberLength(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int len = getNumberLength(array[i]);
            if (max < len) {
                max = len;
            }
        }
        return max;
    }

    public static int getNumberLength(float value) {
        return (int)Math.max(1 + Math.log10(value), 1);
    }

    public static void printDateTable(String[] name1, String[] name2, int[] age, String[] place, float[] distance) {
        String distanceHeader = "Distance to the next capital";


        int firstNameL = getStringLength(name1);
        int lastNameL = getStringLength(name2);
        int ageL = getMaxNumberLength(age);
        int placeNameL = getStringLength(place);
        int distanceL = (int)Math.max(3 + getMaxNumberLength(distance), distanceHeader.length());

        String header = String.format("| %-"+firstNameL+"s | %-"+lastNameL+"s | %"+ageL+"s | %-"+placeNameL+"s | %"+distanceL+"s |", "First Name", "Last Name", "Age", "Place", distanceHeader);
        System.out.println(header);
        System.out.println("-".repeat(header.length()));

        for (int i = 0; i < name1.length; i++) {
            String formatString = "| %-"+firstNameL+"s | %-"+lastNameL+"s | %"+ageL+"d | %-"+placeNameL+"s | %"+distanceL+".2f | %n";
            System.out.printf(formatString, name1[i], name2[i], age[i], place[i], distance[i]);

        }
    }

}
