package aron.week01;

public class HelloWorld {
    public static void main(String[] args){
        int number = 3;
        System.out.println("Hello World" + number);

        //line comment
        /*
        block comment
                */
        //sequence
        System.out.println("------------");
        System.out.println("Hello");
        System.out.println("World");

        //if-statement
        if (number > 5){
            System.out.println("Number is more than 5");
        }else{
            System.out.println("Number is less or equal 5");
        }

        //while and For-statement
        int counter = 0;
        int limit = 5;
        while (counter < limit) {
            System.out.println(counter + "gyula");
            ++counter;
            //counter += 1;
            //counter = counter + 1;
        }
        for(int counter2 = 0; counter2 < limit; ++counter2){
            System.out.println("A");

        }
        System.out.println();
    }
}
