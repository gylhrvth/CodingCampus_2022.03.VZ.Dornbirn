package gyula.week06;

import java.io.File;

public class FileSearchByName {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\gyula.horvath\\IdeaProjects\\CodingCampus_2022.03.VZ.Dornbirn\\src\\main\\java\\gyula");
        fileSearchByName(f, "Exam");

        File big = searchBiggestFile(f);
        System.out.println("With " + big.length() + " bytes is the file " + big.getAbsolutePath() + " the largest.");
    }


    public static void fileSearchByName(File f, String criteria){
        if (f.isFile()){
            if (f.getName().contains(criteria)) {
                System.out.println(f.getAbsolutePath());
            }
        } else {
            File[] files = f.listFiles();
            if (files != null){
                for (int i = 0; i < files.length; i++) {
                    fileSearchByName(files[i], criteria);
                }
            }
        }
    }


    public static File searchBiggestFile(File f){
        if (f.isFile()) return f;
        else {
            File biggest = new File("");
            File[] files = f.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    File testFile = searchBiggestFile(files[i]);
                    if (testFile.length() > biggest.length()){
                        biggest = testFile;
                    }
                }
            }
            return biggest;
        }
    }
}
