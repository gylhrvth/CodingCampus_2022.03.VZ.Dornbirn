package gyula.week05;


public class TowerOfHanoi {
    static int countMoves = 0;

    public static void main(String[] args) {
        int size = 8;

        int[][] towers = createTowers(size);
        printTowersOfHanoi(towers);
        move(towers, 0, 2, 1, size);
    }


    /**
     * [ 5, 4, 3, 2, 1]
     * [ 0, 0, 0, 0, 0]
     * [ 0, 0, 0, 0, 0]
     *
     * @param size
     * @return
     */
    private static int[][] createTowers(int size){
        int[][] towers = new int[3][size];
        for (int i = 0; i < size; i++) {
            towers[0][i] = size - i;
            towers[1][i] = 0;
            towers[2][i] = 0;
        }
        return towers;
    }

    private static void move(int[][] towers, int from, int to, int via, int count){
        if (count == 1){
            ++countMoves;
            System.out.println("Move " + countMoves + ":");
            moveSingle(towers, from, to);
            try { Thread.sleep(1000); } catch (InterruptedException ie) {}
        } else {
            move(towers, from, via, to, count - 1);
            move(towers, from, to, via, 1);
            move(towers, via, to, from, count -1);
        }
    }

    private static void moveSingle(int[][] towers, int from, int to){
        int idxFrom = towers[from].length - 1;
        while ((idxFrom >= 0) && (towers[from][idxFrom] == 0)){
            idxFrom--;
        }
        int idxTo = 0;
        while ((idxTo < towers[to].length) && (towers[to][idxTo] != 0)){
            idxTo++;
        }
        towers[to][idxTo] = towers[from][idxFrom];
        towers[from][idxFrom] = 0;
        printTowersOfHanoi(towers);
    }


    private static void printTowersOfHanoi(int[][] towers){
        int sizeOfTower = 2 * towers[0].length + 1;
        for (int i = towers[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < towers.length; j++) {
                printSingleTower(towers, j, i);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printSingleTower(int[][] towers, int towerIdx, int rowIdx){
        System.out.print(" ".repeat(towers[towerIdx].length - towers[towerIdx][rowIdx] + 1));
        if (towers[towerIdx][rowIdx] > 0) {
            String text = String.valueOf((char) ('A' + towers[towerIdx][rowIdx] - 1));
            System.out.print(text.repeat(2 * towers[towerIdx][rowIdx] + 1));
        } else {
            System.out.print("|");
        }
        System.out.print(" ".repeat(towers[towerIdx].length - towers[towerIdx][rowIdx] + 1));
    }
}
