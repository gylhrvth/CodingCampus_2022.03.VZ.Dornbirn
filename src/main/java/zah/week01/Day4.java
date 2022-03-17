package zah.week01;

public class Day4 {
    public static void main(String[] args) {



        printSlash1("x", 3, false);
        printSlash1("y", 4, true);


    }


    public static void printSlash1(String text, int size, boolean backSlash1) {
        if(backSlash1){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == j) {
                        System.out.print(text);
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }

        } else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i; j++) {
                    if (j+i == size - 1) {
                        System.out.print(text);
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }







}

