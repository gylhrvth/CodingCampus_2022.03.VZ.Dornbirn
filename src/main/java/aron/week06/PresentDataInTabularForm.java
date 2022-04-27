package aron.week06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PresentDataInTabularForm {

    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        try {
            File f = new File("assets/tmp/aron.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(f);
            printDateTable(ps, firstName,lastName,age,place,distanceFromCapital);
            ps.close();

        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();

        }

//        try {
//            FileInputStream fis = new FileInputStream("assets/tmp/longText.txt");
//            Scanner sc = new Scanner(fis);
//            while (sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


    }

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

    public static void printDateTable(PrintStream ps, String[] name1, String[] name2, int[] age, String[] place, float[] distance) {

        String distanceHeader = "Distance to the next capital";
        int firstNameL = getMaxString(name1);
        int lastNameL = getMaxString(name2);
        int ageL = getALength(age[4]);
        int placeNameL = getMaxString(place);
        int distanceL = (int)Math.max(3 + getLength(distance[2]), distanceHeader.length());

        String header = String.format("| %-"+firstNameL+"s | %-"+lastNameL+"s | %"+ageL+"s | %-"+placeNameL+"s | %"+distanceL+"s |", "First Name", "Last Name", "Age", "Place", distanceHeader);
        ps.println(header);
        ps.println("-".repeat(header.length()));

        for (int i = 0; i < name1.length; i++) {
            String formatString = "| %-"+firstNameL+"s | %-"+lastNameL+"s | %"+ageL+"d  | %-"+placeNameL+"s | %"+distanceL+".2f | %n";
            ps.printf(formatString, name1[i], name2[i], age[i], place[i], distance[i]);

        }
    }
}
