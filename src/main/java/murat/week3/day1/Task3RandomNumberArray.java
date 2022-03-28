package murat.week3.day1;

import java.util.Random;

public class Task3RandomNumberArray {
    public static void main(String[] args) {

        Random rand = new Random();

        int size = 100;
        int randomNumber;
        int[] randomNumberArray = new int[100];

        System.out.println();

        // Display every single value
        System.out.println("Every single element in the array");
        for (int i = 0; i < size; i++) {
            randomNumber = rand.nextInt(100);
            randomNumberArray[i] = randomNumber;
            System.out.print(randomNumberArray[i] + " ");
        }

        System.out.println();
        System.out.println();

        // Display 2nd, 5th, 10th... value
        System.out.println("2nd, 5th, 10th... elements in the array");
        for (int j = 0; j < size; j++) {
            if(j==1){
                System.out.print(2 + "No=" + randomNumberArray[1] + " ");      // Display the second value
            }
            if((j+1)%5 ==0){
                System.out.print(j+1 + "No=" + randomNumberArray[j] + " ");      // Display the every 5th value
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Each second element in the array");

        for (int k = 0; k < size; k += 2) {
            System.out.print(k+1 + "No=" + randomNumberArray[k] + "-");
        }

        System.out.println();
    }
}
