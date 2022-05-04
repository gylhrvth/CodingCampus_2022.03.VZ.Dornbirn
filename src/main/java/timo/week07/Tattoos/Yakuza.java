package timo.week07.Tattoos;

import timo.week07.Tattoos.Tattoo;

public class Yakuza {
    public static void main(String[] args) {
        Tattoo[] tattoos = {
                new Tattoo("Hanaya", 50, false, "black, red"),
                new Tattoo("Kitsune", 3, true, "white"),
                new Tattoo("Devilman", 6, false, "red"),
                new Tattoo("Samurai", 30, true, "black"),
        };

        printTattoos(tattoos);
        System.out.println();
        System.out.println("Smallest tattoo is: " + getMin(tattoos));
        System.out.println("Biggest tattoo is: " + getMax(tattoos));
        System.out.println("Average tattoo size is: " + getAvg(tattoos));
        System.out.println();
        System.out.println("Tattoos sorted by motives: ");
        bubbleSortMotive(tattoos, true);
        printTattoos(tattoos);
        System.out.println();
        System.out.println("Tattoos sorted by colour: ");
        bubbleSortColours(tattoos, true);
        printTattoos(tattoos);
        System.out.println();
        System.out.println("Tattoos sorted by size: ");
        bubbleAscending(tattoos);
        printTattoos(tattoos);




    }

    private static void printTattoos(Tattoo[] tat){
        for (int i = 0; i < tat.length; i++) {
            System.out.println(tat[i]);
        }
    }

    private static Tattoo getMin (Tattoo[] tat) {
        Tattoo min = tat[0];
        for (int i = 0; i < tat.length; i++) {
            if (tat[i].getSize() < min.getSize()){
                min = tat[i];
            }
        }
        return min;
    }

    private static Tattoo getMax (Tattoo[] tat) {
        Tattoo max = tat[0];
        for (int i = 0; i < tat.length; i++) {
            if (tat[i].getSize() > max.getSize()){
                max = tat[i];
            }
        }
        return max;
    }

    private static int getAvg (Tattoo[] tat) {
        int sum = 0;
        for (int i = 0; i < tat.length; i++) {
            sum += tat[i].getSize();

        }
        return sum / tat.length;
    }

    public static void bubbleSortMotive(Tattoo[] array, boolean ascending) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (ascending) {
                    if (array[j].getMotive().compareTo(array[j + 1].getMotive()) > 0) {
                        swap(array, j, j + 1);
                    }
                } else {
                    if (array[j].getMotive().compareTo(array[j + 1].getMotive()) < 0) {
                        swap(array, j, j + 1);
                    }
                }
            }
        }
    }

    public static void bubbleSortColours(Tattoo[] array, boolean ascending) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (ascending) {
                    if (array[j].getColours().compareTo(array[j + 1].getColours()) > 0) {
                        swap(array, j, j + 1);
                    }
                } else {
                    if (array[j].getColours().compareTo(array[j + 1].getColours()) < 0) {
                        swap(array, j, j + 1);
                    }
                }
            }
        }
    }


    private static void swap(Tattoo[] array, int indexA, int indexB) {
        Tattoo swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
    }

    public static void bubbleAscending(Tattoo[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].getSize() > array[j + 1].getSize()) {
                    swap(array,j,j+1);
                }
            }
        }

    }


}
