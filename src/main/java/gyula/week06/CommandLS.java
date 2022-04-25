package gyula.week06;

import java.io.File;

public class CommandLS {
    public static void main(String[] args) {
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
}
