package murat.Week1;

public class RandomNumber {


    public static void main(String[] args) {
        int min = 0;
        int max = 100;

        int randomNumber = (int) Math.floor(Math.random()*(max-min+1 + min));

        System.out.println(randomNumber);
    }
}
