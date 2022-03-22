package murat.week2.day1;

public class dataTypesTask3CalculatingPiWithLeibnizVersion1 {
    public static void main(String[] args) {

        calculatingPi(100000000);
    }

    public static void calculatingPi(int iteration) {

        double startPoint = 4;
        double muratPi = 4;

        // Addition part
        for (int i = 5; i < iteration; i += 4) {
            muratPi = muratPi + (startPoint / i);
        }

        // Substraction Part
        for (int j = 3; j < iteration; j += 4) {
            muratPi = muratPi - (startPoint / j);
        }

        System.out.println("Pi: " + muratPi);

    }
}
