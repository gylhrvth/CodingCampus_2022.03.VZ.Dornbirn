package zah.week06;

import java.io.File;

public class FileListExample {
    public  static void main(String[] args) {
        listFiles("C:\\");
    }

    public static void listFiles(String path){
        File f = new File(path);
        if (f.exists() && f.isDirectory()){
            File[] fileList = f.listFiles();
            for (int i = 0; i < fileList.length; i++) {
                System.out.printf(
                        "%1s %-30s %10s%n",
                        (fileList[i].isDirectory()?"D":" "),
                        fileList[i].getName(),
                        (fileList[i].isDirectory()?"":Long.toString(fileList[i].length()))
                );
            }
        }
    }
  /*  File f = new File("Hello.txt");
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.length());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.isDirectory());
    File[] files = f.listFiles();**/
}

