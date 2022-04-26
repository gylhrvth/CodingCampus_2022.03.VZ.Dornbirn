package zah.week06;


import java.io.File;

public class Fileread {
    public static void main(String[] args) {
        directoryList("C:\\");


    }

    public static void directoryList(String path) {
        File f = new File(path);
        if (f.isDirectory()) {
            File[] fileList = f.listFiles();
            fileSort(fileList);
            for (int i = 0; i < fileList.length; i++) {
                System.out.printf("%3s %-30s %10s%n",
                        fileList[i].isDirectory()?"-->":"",
                        fileList[i].getName(),
                        fileList[i].isDirectory()?"":fileList[i].length());
            }

        }
    }

    public static void fileSort(File[] fileList){
        for (int i = 0; i < fileList.length; i++) {
            for (int j = 0; j <fileList.length - 1-i ; j++) {
                Long size = fileList[j].isDirectory()?Long.MIN_VALUE:fileList[j].length();
                Long nextSize = fileList[j+1].isDirectory()?Long.MIN_VALUE:fileList[j+1].length();
                if (size > nextSize)
                    swap2(fileList,j,j+1);

            }
        }
    }

    public static void swap2(File[] data, int name1, int name2) {
        File swap = data[name1];
        data[name1] = data[name2];
        data[name2] = swap;
    }
}

