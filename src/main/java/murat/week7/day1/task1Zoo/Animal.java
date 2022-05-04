package murat.week7.day1.task1Zoo;

public class Animal {
    public String name;
    public String species;
    public int age;
    public int weight;
    public int height;

    public Animal(String name, String species, int age, int weight, int height) {

        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String toString(){
        return name + " " + weight + " kg.";
    }

    public int getAge(){
        return age;
    }

    public int getWeight(){
        return weight;
    }
}
