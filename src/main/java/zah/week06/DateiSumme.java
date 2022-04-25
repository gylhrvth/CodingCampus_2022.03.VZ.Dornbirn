package zah.week06;

import java.io.File;

public class DateiSumme {
  static int count = 0;
    static long sum = 0;

    public static void main(String[] args) {
        directoryList("C:\\Users\\zah_r\\Desktop\\cv");
        System.out.println("...................");
        //   rekursive(C:\\Users\\zah_r\\Desktop\\text"");
        System.out.println("Count: " + countRecursiv(new File("C:\\Users\\zah_r\\Desktop\\cv")));
        System.out.println("sum: " + sumRecursilve(new File("C:\\Users\\zah_r\\Desktop\\cv")));
    }
    public static int sumRecursilve(File f){
        if (f.isFile())return 1;
        int sum =0;
        File[] fileList = f.listFiles();
        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                sum += fileList.length;
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

    public static void prinfile(File[] fileList) {
        for (int i = 0; i < fileList.length; i++) {
            System.out.printf("%3s %-30s %10s%n",
                    fileList[i].isDirectory() ? "-->" : "",
                    fileList[i].getName(),
                    fileList[i].isDirectory() ? "" : fileList[i].length());


        }
    }
// brauchen wir momentan nicht, Sind filename


//    public static void rekursive(String path) {
//        File f = new File(path);
//        File[] filesofList = f.listFiles();
//        //count = 0;
//        //sum=0;
//        if (filesofList != null) {
//            for (File file : filesofList) {
//                rekursive(file.getPath());
//                System.out.println(file.getName());
//                System.out.println(file.getAbsolutePath());
//                for (File value : filesofList) {
////                    count++;
////                    sum += value.length();
//                }
//                System.out.println();
////                System.out.println("You have: " + count + " Files");
////                System.out.println("You have: " + sum + " byte");
//            }
//        }
//    }

    public static void directoryList(String path) {
        File f = new File(path);
        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            fileSort(fileList);
            prinfile(fileList);



            for (File value : fileList) {
                count++;
                sum += value.length();
            }
            System.out.println();
            System.out.println("You have: " + count + " Files");
            System.out.println("You have: " + sum + " byte");
        }
    }


    public static void fileSort(File[] fileList) {
        for (int i = 0; i < fileList.length; i++) {
            for (int j = 0; j < fileList.length - i - 1; j++) {
                Long size = fileList[j].isDirectory() ? Long.MIN_VALUE : fileList[j].length();
                Long nextSize = fileList[j + 1].isDirectory() ? Long.MIN_VALUE : fileList[j + 1].length();
                if (size > nextSize) {
                    swap2(fileList, j, j + 1);
                }

            }
        }
    }


    public static void swap2(File[] data, int name1, int name2) {
        File swap = data[name1];
        data[name1] = data[name2];
        data[name2] = swap;
    }
}
