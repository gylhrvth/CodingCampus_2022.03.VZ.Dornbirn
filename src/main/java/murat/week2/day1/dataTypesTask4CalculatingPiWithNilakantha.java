package murat.week2.day1;

public class dataTypesTask4CalculatingPiWithNilakantha {
    public static void main(String[] args) {

       calculatingPiNilakantha(1000000);
    }

    public static void calculatingPiNilakantha(int iteration) {

        double muratPi = 3;
        double constant = 4;

        for (int i = 2; i < iteration; i += 2) {

            if (i % 4 == 0) {
                muratPi = muratPi - (constant / (i * (i + 1) * (i + 2)));
                System.out.println("Minus: " + muratPi + " " + constant + " "+ i + " " + " "+ (i+1) + " " + (i+2));
            } else {
                muratPi = muratPi + (constant / (i * (i + 1) * (i + 2)));
                System.out.println("Plus: " + muratPi + " " + constant + " "+ i + " " + " "+ (i+1) + " " + (i+2));
            }
        }
        System.out.println("Pi: " + muratPi);
    }
}
