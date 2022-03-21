package murat.week2.day1;

public class dataTypesTask3CalculatingPiWithLeibniz {
    public static void main(String[] args) {

        calculatingPi(1000000000);
    }

    public static void calculatingPi(int upperLimit) {

        double startPoint = 4;
        double muratPi = 4;

        // Addition part
        for (int i = 5; i < upperLimit; i += 4) {
            muratPi = muratPi + (startPoint / i);
        }

        // Substraction Part
        for (int j = 3; j < upperLimit; j += 4) {
            muratPi = muratPi - (startPoint / j);
        }

        System.out.println("Pi: " + muratPi);

    }
}
