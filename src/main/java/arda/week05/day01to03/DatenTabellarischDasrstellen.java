package arda.week05.day01to03;

public class DatenTabellarischDasrstellen {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso","Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40,78,5,18,81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distaneFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        System.out.println("longest first name: " + getMaxStringLength(firstName));
        System.out.println("longest last name: " + getMaxStringLength(lastName));
        System.out.println("longest place name: " + getMaxStringLength(place));
        System.out.println("biggest age length: " + getMaxIntLength(age));
        System.out.println("furthest distance from capital: " + getMaxFloatLength(distaneFromCapital));

        System.out.println();
        tabelle(firstName, lastName, age, place, distaneFromCapital);
    }

    public static void tabelle(String[] firstName, String[] lastName, int[] age, String[] place, float[] dFC) {
        for (int i = 0; i < firstName.length; i++) {
            System.out.printf(" |%"+ (-(getMaxStringLength(firstName))) +"s | %"+
                    (-(getMaxStringLength(lastName)))+"s | %"+
                    ((getMaxIntLength(age)-2))+"d | %"+
                    (-(getMaxStringLength(place)))+"s | %"+
                    ((getMaxFloatLength(dFC)+1))+".1f |", firstName[i], lastName[i], age[i], place[i], dFC[i]);
            System.out.println();
        }
    }
    public static int getMaxStringLength(String[] nameArr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nameArr.length; i++) {
            if (max < nameArr[i].length()){
                max = nameArr[i].length();
            }
        }
        return max;
    }
    public static int getMaxIntLength(int[] ageArr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ageArr.length; i++) {
            if (max < ageArr[i]){
                max = i;
            }
        }
        return max;
    }
    public static int getMaxFloatLength(float[] dfcArr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dfcArr.length; i++) {
            if (max < dfcArr[i]){
                max = i;
            }
        }
        return max;
    }
}
