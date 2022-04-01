package arda.week03.day04;

public class FunctionReturnValues {
    public static void main(String[] args) {
        printHello();

        float temperature = getActualTemperature();

        int testVariable = 1;
        System.out.println(testVariable);
        increase(testVariable);
        System.out.println(testVariable);


        System.out.println("=========================================");
        int[] testArray = {1};
        System.out.println(testArray[0]);
        increaseArray(testArray);
        System.out.println(testArray[0]);
        System.out.println(java.util.Arrays.toString(testArray));
    }


    public static int[][] createEmptyField(){
        int size = 3;
        int[][] field = new int[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = 0;
            }
        }
        return field;
    }

    public static void addStone(int[][] field, int player, int posX, int posY){
        if (
                (posY >= 0) &&
                (posY < field.length) &&
                (posX >= 0) &&
                (posX < field[0].length) &&
                (field[posX][posY] == 0)){
            field[posX][posY] = player;
        }
    }

    public static void increaseArray(int[] data){
        data = new int[20];
        for (int i = 0; i < data.length; i++) {
            ++data[i];
        }
        System.out.println("increaseArray() " + java.util.Arrays.toString(data));
    }

    public static void increase(int value){
        ++value;
        System.out.println("increase() " + value);
    }


    public static float getActualTemperature(int weatherStationID){
        return 2.7f;
    }


    public static float getActualTemperature(){
        return 2.7f;
    }

    public static void printHello(){
        System.out.println("Hello");
    }
}
