package cemil.week07;

import java.io.File;
import java.util.Scanner;

public class Day1File {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wo soll ich suchen?");
        String text = sc.nextLine();
        String path = "C:\\Program Files";
        fileNewList(text);
        System.out.println("sum: " + sumRecursilve(new File(text)));
        System.out.println("Count: " + countRecursiv(new File(text)));

    }

    public static long sumRecursilve(File f) {
        if (f.isFile()) return f.length();
        long sum = 0;
        File[] fileList = f.listFiles();
        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                sum += sumRecursilve(fileList[i]);
            }
        }
        return sum;
    }

    public static int countRecursiv(File f) {
        if (f.isFile()) return 1;

        int count = 0;
        File[] fileList = f.listFiles();
        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                count += countRecursiv(fileList[i]);
            }
        }
        return count;
    }

    public static void fileNewList(String path) {
        File f = new File(path);
        if (f.isDirectory()) {
            File[] filelist = f.listFiles();
            fileSort(filelist);
            printFile(filelist);
            System.out.println();


        }
    }


    public static void printFile(File[] fileslist) {
        for (int i = 0; i < fileslist.length; i++) {

            System.out.printf("%7s %-30s %10s%n",
                    fileslist[i].isDirectory() ? "-->D: " : "",
                    fileslist[i].getName(),
                    fileslist[i].isDirectory() ? "" : fileslist[i].length());

        }
    }


    public static void fileSort(File[] fileList) {
        for (int i = 0; i < fileList.length; i++) {
            for (int j = 0; j < fileList.length - 1 - i; j++) {
                Long size = fileList[j].isDirectory() ? Long.MIN_VALUE : fileList[j].length();
                Long nextSize = fileList[j + 1].isDirectory() ? Long.MIN_VALUE : fileList[j + 1].length();
                if (size > nextSize)
                    swap(fileList, j, j + 1);

            }
        }
    }


    private static void swap(File[] file, int left, int right) {
        File temp = file[left];
        file[left] = file[right];
        file[right] = temp;
    }

}
