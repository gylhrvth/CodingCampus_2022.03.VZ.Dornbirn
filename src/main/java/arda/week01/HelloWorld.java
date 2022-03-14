package arda.week01;

public class HelloWorld {
    public static void main(String[] arg) {
        int number = 5;
        System.out.println("Hello World " + number);

        // Line Comment
        /*
           Block Comment
        */
        // Sequence
        System.out.println(".........\n");
        System.out.println("Hello ");
        System.out.println("World\n ");

        // If-Statement
        if (number > 5) {
            System.out.println("number is more than 5");
        } else {
            System.out.println("number is less or equal");

            //while- and for- Statement
            int counter = 0;
            int limit = 5;
            while (counter < limit){
                System.out.println(counter + " Arda");
                ++counter;
                //counter = counter + 1;
                //counter += 1;
            }

            for (int counter2 = 0; counter2 < limit; ++counter2){
                System.out.print("A");
            }
            System.out.println();
        }

    }
}
