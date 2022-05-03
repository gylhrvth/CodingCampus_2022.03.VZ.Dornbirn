package murat.week7.day1.task1Zoo;

public class Zoo {
    public static void main(String[] args) {

        Animal[] animalList = {
                new Animal("Lion", "Mammal", 4, 190, 120),
                new Animal("Lizard", "Reptile", 10, 1, 20),
                new Animal("Eagle", "Bird", 2, 5, 50),
                new Animal("Elephant", "Mammal", 2, 4000, 396),
        };

        System.out.println("Minimum weight: " + getMin(animalList));
        System.out.println("Maximum weight: " + getMax(animalList));
        System.out.println("Average weight: " + getAve(animalList) + " kg.");
    }

    public static void printList(Animal[] listOfAnimals) {

        for (int i = 0; i < listOfAnimals.length; i++) {
            System.out.printf(listOfAnimals[i] + " ");
        }
    }

    public static Animal getMin(Animal[] listOfAnimals) {

        Animal min = listOfAnimals[0];

        for (int i = 0; i < listOfAnimals.length; i++) {
            if (listOfAnimals[i].getWeight() < min.getWeight()) {
                min = listOfAnimals[i];
            }
        }
        return min;
    }

    public static Animal getMax(Animal[] listOfAnimals) {

        Animal max = listOfAnimals[0];

        for (int i = 0; i < listOfAnimals.length; i++) {
            if (listOfAnimals[i].getWeight() > max.getWeight()) {
                max = listOfAnimals[i];
            }
        }
        return max;
    }

    public static float getAve(Animal[] listOfAnimals) {

        float ave = 0;

        for (int i = 0; i < listOfAnimals.length; i++) {
            ave += listOfAnimals[i].getWeight();
        }
        ave = ave / listOfAnimals.length;

        return ave;
    }
}
