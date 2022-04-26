package sergej.week06;

import java.io.File;

public class FindBiggestFile {

    public static void getFilesRec(File f) {


        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            if (fileList != null) {
                for (int i = 0; i < fileList.length; i++) {
                    getFilesRec(fileList[i]);

                }
            }
        }
    }

    public static long maximum(File f) {

        long maximum = Integer.MIN_VALUE;
        if (f.isFile()) return f.length();
        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            if (fileList != null) {
                for (int i = 0; i < fileList.length; i++) {
                    if (fileList[i].length() > maximum) {
                        maximum = maximum(fileList[i]);
                    }
                }
            }
        }
        return maximum;
    }


    public static String getPath(File f, long maximum) {
        String path = "";
        if (f.isFile()) return f.getPath();
        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            if (fileList != null) {
                for (int i = 0; i < fileList.length; i++) {
                    if (fileList[i].length() != maximum)
                        path = getPath(fileList[i], maximum);
                }
            }
        }
        return path;
    }


    public static void main(String[] args) {

        getFilesRec(new File("C:\\Users\\orasc\\Programming\\CodingCampus_2022.03.VZ.Dornbirn\\src\\main\\java\\sergej"));
        long maxFileSize = maximum(new File("C:\\Users\\orasc\\Programming\\CodingCampus_2022.03.VZ.Dornbirn\\src\\main\\java\\timo"));
        System.out.println("The max File size in this dir is: " + maxFileSize);
        String maxPath = getPath(new File("C:\\Users\\orasc\\Programming\\CodingCampus_2022.03.VZ.Dornbirn\\src\\main\\java\\timo"), maxFileSize);
        System.out.println("The path is: " + maxPath);

    }
}
