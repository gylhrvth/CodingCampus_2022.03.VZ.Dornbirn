package zah.week06;

import java.io.File;
import java.util.Scanner;

public class BigestFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Where should i search? ");
        String text = sc.nextLine();

        String big = text;
        File biggest = biggerData(new File(big));
        System.out.println("The biggest: " + biggest + "With :" + biggest.length() + " Byte");
        File f = new File("C:\\Users\\zah_r\\IdeaProjects\\CodingCampus_2022.03.VZ.Dornbirn\\src\\main\\java\\zah");
        fileSearchByName(f, "Exam");

    }


    public static File biggerData(File f) {
        if (f.isFile()) return f;
        File bigger = new File("");
        File[] fileList = f.listFiles();
        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                File test = biggerData(fileList[i]);
                if (test.length() > bigger.length()) {
                    bigger = test;
                }
            }
        }
        return bigger;
    }
    public static void fileSearchByName(File f, String criteria){
        if (f.isFile()){
            if (f.getName().contains(criteria)) {
                System.out.println(f.getAbsolutePath());
            }
        } else {
            File[] files = f.listFiles();
            if (files != null){
                for (int i = 0; i < files.length; i++) {
                    fileSearchByName(files[i], criteria);
                }
            }
        }
    }
}
