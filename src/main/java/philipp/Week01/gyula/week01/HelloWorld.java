package philipp.Week01.gyula.week01;

public class HelloWorld {
    public static void main(String[] args) {
        int number = 3;
        System.out.println("Hello World! " + number);

        // Line comment
        /*
            Block Comment
         */

        // Sequence
        System.out.print("---------------\n");
        System.out.print("Hello ");
        System.out.print("World!\n");

        // If-Statement
        if (number > 5) {
            System.out.println("Number is more than 5");
        } else {
            System.out.println("Number is less or equal 5");
        }

        System.out.println();

        // while- and for-Statement
        int counter = 0;
        int limit = 5;
        while (counter < limit){
            System.out.println(counter + " Gyula");
            ++counter;
            //counter += 1;
            //counter = counter + 1;
        }

        for (int counter2 = 0; counter2 < limit; ++counter2){
            System.out.print("A");
        }
        System.out.println();
    }
}
