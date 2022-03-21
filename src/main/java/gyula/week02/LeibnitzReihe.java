package gyula.week02;

public class LeibnitzReihe {
    public static void main(String[] args) {
        //leibnitz(0.000005);
        // leibnitz2(10000);
        // squareRootTwo();
        squareRoot(2.0);
        System.out.println("========");
        squareRoot(0.01);
    }

    public static void leibnitz2(int countOfIteration) {
        double myPi = 0;
        for (int i = 0; i < countOfIteration; i++) {
            if (i % 2 == 0){
                myPi += 4.0/(2*i + 1);
            } else {
                myPi -= 4.0/(2*i + 1);
            }
        }
        System.out.println(myPi);
    }


    public static void leibnitz(double precision) {
        double myPiMin = 0d;
        double myPiMax = 4d;
        int i = 1;

        while (myPiMax - myPiMin > precision) {
            myPiMax = myPiMin + 4.0 / i;
            myPiMin = myPiMax - 4.0 / (i + 2);
            i += 4;
        }
        System.out.println(myPiMax);
        System.out.println(myPiMin);
    }


    public static void squareRootTwo(){
        double value = 1.0;
        for (int i = 0; i < 100; i++) {
            value = value/2 + 1/value;
            System.out.println(value);
        }
    }


    public static void squareRoot(double value){
        double minSq = 0;
        double maxSq = value;
        if (value < 1){
            minSq = value;
            maxSq = 1;
        }

        double distance = 1;
        while (distance > 0.0005*value){
            double midSq = minSq + (maxSq-minSq)/2;
            if (midSq*midSq > value){
                maxSq = midSq;
            } else {
                minSq = midSq;
            }
            distance = minSq*minSq - value;
            if (distance<0) {
                distance *= -1;
            }
            System.out.println(minSq + " " + maxSq);
        }
    }
}
