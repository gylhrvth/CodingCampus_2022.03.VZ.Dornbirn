package timo.week01;

public class HelloWorld {
    public static void main(String[] args) {
        int number = 4;
        System.out.println("Hello World! " + number);

        // Line comment

        /*
        Block comment
         */

        // Sequence
        System.out.println("-------------");
        System.out.println("Hello ");
        System.out.println("World!");


        // If-Statement
        if (number > 5) {
            System.out.println("Number is more than 5");
        } else {
            System.out.println("Number is less or equal 5");
        }

        // while- and for-Statement
        int counter = 0;
        int limit = 5;
        while (counter < limit) {
            System.out.println(counter + " Timo");
            counter = counter + 1;
            //counter +=1 or ++counter
        }

        for (int counter2 = 0; counter2 < limit; ++counter2) {
            System.out.println("A");
        }
        System.out.println();
    }
}
