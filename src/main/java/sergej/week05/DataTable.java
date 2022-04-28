package sergej.week05;

public class DataTable {

    public static int getLength(float value){
        return (int)Math.max(Math.ceil(Math.log10((int)value)), 1);
    }

    public static int getALength(int value){
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



    public static void printStringsNames(String[] names, String[] last, int[] age, String[] place, float[] dist,int maxName,int maxLast,int maxPlace,int Mdist,int maxAge) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("| %"+-maxName+"s | %"+-maxLast+"s | %"+(maxAge+1)+"d | %"+-maxPlace+"s | %"+(5+Mdist)+".2f |%n", names[i], last[i], age[i], place[i],dist[i]);
        }
    }

    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        String[] table = {};

        String firstNameTableHeader = "First Name";
        int maxName = Math.max(getMaxString(firstName), firstNameTableHeader.length());
        int maxLast = getMaxString(lastName);
        int maxPlace = getMaxString(place);
        int maxFloat = getLength(distanceFromCapital[1]);
        int maxAge = getALength(age[4]);

        String header = String.format("| %-"+maxName+"s | %-"+maxLast+"s | %-"+maxAge+"s | %-"+maxPlace+"s | %-"+maxFloat+"s |", firstNameTableHeader, "Last Name", "Age", "Place","Distance");
        String line = "- ".repeat(header.length()/2);
        System.out.println(header);
        System.out.println(" -".repeat(header.length()/2));
        printStringsNames(firstName, lastName, age, place,distanceFromCapital,maxName,maxLast,maxPlace,maxFloat,maxAge);


    }
}
