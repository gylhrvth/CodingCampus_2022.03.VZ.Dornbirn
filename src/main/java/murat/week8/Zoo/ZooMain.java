package murat.week8.Zoo;

public class ZooMain {
    public static void main(String[] args) {

        // Create a zoo
        Zoo zooDarica = ZooCreator.createAZoo();

        // ZOO WORLD
        for (int i = 0; i < 10; i++) {
            System.out.println(Zoo.ANSI_YELLOW + "\nDAY " + (i + 1) + " BEGINS________________________________________________________________________________" + Zoo.ANSI_RESET);

            System.out.println(Zoo.BOLD + "\n------------SIM 0.1 - ANIMAL CARERS ON DUTY------------\n" + Zoo.BOLD_RESET);
            zooDarica.simulation01();

            System.out.println(Zoo.BOLD + "\n--------------SIM 0.2 - NATURAL SELECTION------------" + Zoo.BOLD_RESET);
            zooDarica.simulation02();

            System.out.println();

            System.out.println(Zoo.BOLD + "\n------------SIM 0.3 - HEALING PROCESS------------" + Zoo.BOLD_RESET);
            zooDarica.simulation03();

            System.out.println(Zoo.BOLD + "\n--------------DAILY FOOD CONSUMPTION------------\n" + Zoo.BOLD_RESET);
            zooDarica.getFoods().get(0).foodStatistics(zooDarica);

            System.out.println();
            zooDarica.printStructure();
        }
    }
}
