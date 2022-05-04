package arda.week07.tattooparlor;

public class TattooParlor {
    public static void main(String[] args) {
        Tattoo[] tattoos = {new Tattoo("koi", 5),
                new Tattoo("hannaya", 7),
                new Tattoo("dragon", 9),
                new Tattoo("bakaneko", 3)
        };
        printTattoos(tattoos);
        System.out.println("---------------");
        System.out.println("minimum tat size: " + getMin(tattoos));
        System.out.println("maximum tat size: " + getMax(tattoos));
        System.out.println("average tat size: " + getAvg(tattoos));
        System.out.println("----------------");
        sortTatSize(tattoos);
        System.out.println("sorted by size:");
        printTats(tattoos);
    }

    private static void printTattoos(Tattoo[] tat) {
        for (int i = 0; i < tat.length; i++) {
            System.out.println(tat[i]);
        }
    }

    private static Tattoo getMin(Tattoo[] tat) {
        Tattoo min = tat[0];
        for (int i = 0; i < tat.length; i++) {
            if (tat[i].getSize() < min.getSize()) {
                min = tat[i];
            }
        }
        return min;
    }

    private static Tattoo getMax(Tattoo[] tat) {
        Tattoo max = tat[0];
        for (int i = 0; i < tat.length; i++) {
            if (tat[i].getSize() > max.getSize()) {
                max = tat[i];
            }
        }
        return max;
    }

    private static int getAvg(Tattoo[] tat) {
        int avg = 0;
        for (int i = 0; i < tat.length; i++) {
            avg += tat[i].getSize();
        }
        return avg / tat.length;
    }

    private static void sortTatSize(Tattoo[] tat) {
        for (int i = 0; i < tat.length; i++) {
            for (int j = 0; j < tat.length - i - 1; j++) {
                if (tat[j].getSize() < tat[j + 1].getSize()) {
                    Tattoo swap = tat[j];
                    tat[j] = tat[j + 1];
                    tat[j + 1] = swap;
                }
            }
        }
    }

    private static void printTats(Tattoo[] tat) {
        for (int i = 0; i < tat.length; i++) {
            System.out.println(tat[i]);
        }
    }
}
