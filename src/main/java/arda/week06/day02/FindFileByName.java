package arda.week06.day02;

import arda.week06.day01.BiggestFileSize;

import java.io.File;
import java.util.Scanner;

public class FindFileByName {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String inputPath = BiggestFileSize.userInputPath();
        File file = new File(inputPath);
        String fileName = nameOfFile();
        searchFile(file,fileName);
    }
    public static String nameOfFile(){
        System.out.println("please enter the file you are looking for.");
        String input = sc.nextLine();
        while(input.contains("/ \\ : * ? \" < > |")){
            System.out.println("please enter a valid file name!");
            input = sc.nextLine();
        }
        return input;
    }
    public static void searchFile(File file, String input){
        if (file.isFile() && file.getName().contains(input)){
            System.out.println(file.getAbsolutePath());
        }else{
            File[] fileList = file.listFiles();
            if (fileList != null){
                for (int i = 0; i < fileList.length; i++) {
                    searchFile(fileList[i],input);
                }
            }
        }
    }
}
