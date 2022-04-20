package sergej.week05;

public class DataTable {

    public static int getLength(float value){
        return (int)Math.max(Math.ceil(Math.log10((int)value)), 1);
    }

    public static int getMaxString(String[] names){
        int max = 0;
        for (int i = 0; i < names.length ; i++) {
            if(max < names[i].length()){
                max = names[i].length();
            }
        }
        return max;
    }



    public static void printStringsNames(String[] names, String[] last, int[] age, String[] place, float[] dist,int maxName,int maxLast,int maxPlace,int Mdist) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(String.format("%"+-maxName+"s %"+-maxLast+"s %2d %"+-maxPlace+"s %"+(3+Mdist)+".2f", names[i], last[i], age[i], place[i],dist[i]));
        }
    }

    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        String[] table = {};

        int maxName = getMaxString(firstName);
        int maxLast = getMaxString(lastName);
        int maxPlace = getMaxString(place);

        int maxFloat = getLength(distanceFromCapital[1]);



        System.out.println(String.format("%"+-maxName+"s %"+-maxLast+"s %s %"+-maxPlace+"s %"+-maxFloat+"s", "First Name", "Last Name", "Age", "Place","Distance"));
        printStringsNames(firstName, lastName, age, place,distanceFromCapital,maxName,maxLast,maxPlace,maxFloat);


    }
}
