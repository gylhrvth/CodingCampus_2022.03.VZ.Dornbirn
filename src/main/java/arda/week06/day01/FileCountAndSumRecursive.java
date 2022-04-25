package arda.week06.day01;

import java.io.File;

public class FileCountAndSumRecursive {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.03.VZ.Dornbirn\\src\\main\\java");
       System.out.println("amount of files: " + countFiles(file));
       System.out.println("sum of file sizes: " + sumOfFiles(file));
    }
    public static int countFiles(File file){
        int counter = 0;

        if (file.isFile()){
            return 1;
        }

        File[] fileList = file.listFiles();
        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                counter += countFiles(fileList[i]);
            }
        } else {
            System.out.println(file.getAbsolutePath() + " is not readable.");
        }
        return counter;
    }
    public static long sumOfFiles(File file){
        int sum = 0;

        if (file.isFile()){
            return file.length();
        }

        File[] fileList = file.listFiles();
        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                sum += sumOfFiles(fileList[i]);
            }
        }
        return sum;
    }
}
