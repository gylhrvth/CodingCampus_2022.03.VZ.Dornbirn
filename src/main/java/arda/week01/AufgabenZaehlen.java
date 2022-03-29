package arda.week01;

public class AufgabenZaehlen {
    public static void main(String[] args) {
        int counter = 0;
        int limit = 10;
        while (counter <= limit) {
            System.out.println(counter);
            ++counter;
        }

        System.out.println("-------------------");

        for(int counter2 = 0; counter2 <= 10; ++counter2){
            System.out.println(counter2);
        }
    }
}