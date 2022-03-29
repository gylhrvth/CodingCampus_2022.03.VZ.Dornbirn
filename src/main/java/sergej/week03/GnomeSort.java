package sergej.week03;

import java.util.Arrays;

public class GnomeSort {
    public static void gnomeSort(int[] array){
        int i = 1;
        while(i< array.length){
            if(array[i]>array[i-1]){
                i++;
            }else{
                int swap = array[i];
                array[i] = array[i-1];
                array[i-1] = swap;
                if( i > 1){
                    i--;
                }

            }
        }
    }

    public static void main(String[] args) {

        int[] newList = RandomArray.randomList(10);

        gnomeSort(newList);
        System.out.println(Arrays.toString(newList));

    }
}
