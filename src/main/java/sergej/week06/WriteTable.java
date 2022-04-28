package sergej.week06;

import sergej.week05.DataTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class WriteTable {

    public static void printStringsNames(String[] names, String[] last, int[] age, String[] place, float[] dist,int maxName,int maxLast,int maxPlace,int Mdist,PrintStream ps) {
        for (int i = 0; i < names.length; i++) {
            ps.println(String.format("|%"+-maxName+"s |%"+-maxLast+"s |%2d |%"+-maxPlace+"s |%"+(3+Mdist)+".2f", names[i], last[i], age[i], place[i],dist[i]));
        }
    }
    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        int maxName = DataTable.getMaxString(firstName);
        int maxLast = DataTable.getMaxString(lastName);
        int maxPlace = DataTable.getMaxString(place);

        int maxFloat = DataTable.getLength(distanceFromCapital[1]);
        String header = String.format("|%" + -maxName + "s |%" + -maxLast + "s |%s |%" + -maxPlace + "s |%" + (maxFloat) + "s", "First Name", "Last Name", "Age", "Place", "Distance");
        String line = "- ".repeat(header.length() / 2);

        try {
            File f = new File("assets/tmp/datatable.txt");
            System.out.println(f.getAbsolutePath());
            File dir = new File(f.getParent());
            System.out.println(dir.getAbsolutePath());
            dir.mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));
            ps.println(header);
            ps.println(line);
            printStringsNames(firstName, lastName, age, place,distanceFromCapital,maxName,maxLast,maxPlace,maxFloat,ps);
            ps.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }
}

