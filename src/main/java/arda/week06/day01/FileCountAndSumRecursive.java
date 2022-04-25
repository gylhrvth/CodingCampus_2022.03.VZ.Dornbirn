package arda.week06.day01;

import java.io.File;

public class FileCountAndSumRecursive {
    public static void main(String[] args) {
        File file = new File("c:\\");
       System.out.println("amount of files: " + countFiles(file));
       //System.out.println("sum of file sizes: " + sumOfFiles(file));
    }
    public static int countFiles(File file){
        File[] fileList = file.listFiles();
        int counter = 0;
        for (int i = 0; i < fileList.length; i++) {
            if (!fileList[i].isDirectory()){
                counter++;
            }else{
                counter += countFiles(fileList[i]);
            }
        }
        return counter;
    }
    public static int sumOfFiles(File file){
        File[] fileList = file.listFiles();
        int sum = 0;
        for (int i = 0; i < fileList.length; i++) {
            if (!file.isDirectory()){
                sum += fileList[i].length();
            }else{
                sum += sumOfFiles(fileList[i]);
            }
        }
        return sum;
    }
}
