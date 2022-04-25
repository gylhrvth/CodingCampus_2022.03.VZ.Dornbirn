package sergej.week06;

import java.io.File;

public class FilesRecursive {

    public static void getFilesRec(File f) {
        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            FileExample.countFiles(fileList);
            FileExample.sortFiles(fileList);
            if (fileList != null){
                for (int i = 0; i < fileList.length; i++) {
                    getFilesRec(fileList[i]);
                    System.out.printf(
                            "%1s %-100s %12s%n",
                            (fileList[i].isDirectory() ? "D" : " "),
                            fileList[i].getAbsolutePath().substring(Math.max(0, fileList[i].getAbsolutePath().length() - 100)),
                            (fileList[i].isDirectory() ? "" : Long.toString(fileList[i].length()))
                    );
                }
            }
        }
    }
    public static void main(String[] args) {

        getFilesRec(new File("C:\\Users\\orasc\\Programming\\CodingCampus_2022.03.VZ.Dornbirn\\src\\main\\java\\sergej"));

    }
}
