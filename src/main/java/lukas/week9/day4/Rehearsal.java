package lukas.week9.day4;

import lukas.week9.day4.simpleabstract.Animal;
import lukas.week9.day4.simpleabstract.Cat;
import lukas.week9.day4.simpleabstract.Dog;
import lukas.week9.day4.simpleabstract.Maincoon;

import java.util.ArrayList;
import java.util.List;

public class Rehearsal extends Object {
    public static void main(String[] args) {
        animalActivator(animalList());
    }

    private static List<Animal> animalList() {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Alfons"));
        animalList.add(new Dog("Barki"));
        animalList.add(new Cat("Rambina"));
        animalList.add(new Cat("CatDog"));
        animalList.add(new Maincoon("Maincoon"));
        return animalList;
    }

    private static void animalActivator(List<Animal> animalList) {
        for (Animal animal : animalList) {
            animal.printName();
            animal.gibLaut();
        }
    }
}
