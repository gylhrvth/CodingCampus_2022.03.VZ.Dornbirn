package murat.week3.day1;

import java.util.Random;

public class Task3RandomNumberArray {
    public static void main(String[] args) {

        Random rand = new Random();

        int randomNumber;
        int [] randomNumberArray;




        for (int i = 0; i < randomNumberArray.length; i++) {

          randomNumber = rand.nextInt(100);
           randomNumberArray [i] = randomNumber;
            System.out.print(randomNumberArray);
        }


    }
}
