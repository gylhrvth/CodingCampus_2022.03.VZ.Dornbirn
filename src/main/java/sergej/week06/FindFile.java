package sergej.week06;

import java.io.File;
import java.util.Scanner;

public class FindFile {

    public static void getPath(File f, String text) {

        if (f.isFile()) {
            if (f.getName().contains(text)) {
                System.out.println(f.getAbsolutePath());
            }
        } else {
            File[] fileList = f.listFiles();
            if (fileList != null) {
                for (int i = 0; i < fileList.length; i++) {
                    getPath(fileList[i], text);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("What directory do you want to search?");
        File path = new File(sc.nextLine());
        System.out.println("What are you looking for ?");
        String text = sc.nextLine();
        getPath(path, text);


    }
}
