package aron.week03;

import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {

        int [][] myArray = battlefield();
        for (int i = 0; i < myArray.length; i++){
            System.out.println(Arrays.toString(myArray[i]));
        }
    }
    public static int [][] battlefield(){

        int [][] data = new int [3][3];
        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data[y].length; x++) {

    }
}
        return data;
    }

}
