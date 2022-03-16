package zah.week01;

public class HelloWorld {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(" Hello World! " + number);

        //line comment
        /*
        Block Comment
         */
        // Sequence
        System.out.print(" ___________\n ");
        System.out.print(" Hello ");
        System.out.print(" World \n");
        // If-Statement
        if (number > 5) {
            System.out.println(" Number is more that 5");
        } else {
            System.out.println(" Number is less or equal 5");
        }

        // while- and for Statement
        int counter = 0;
        int limit = 5;
        while (counter < limit) {
            System.out.println(counter + " Razvan ");
            ++counter;
            //counter + =1;
            //counter = counter + 1;


        }
        for (int counter2 = 0; counter2 < limit; ++counter2) {
            System.out.print("A");
        }
        System.out.println();
        int counter5 = 10;
        for (counter5 = 10; counter5 >= -10; counter5 = counter5 - 1) {

        }
        System.out.println(counter5);

    }

}
