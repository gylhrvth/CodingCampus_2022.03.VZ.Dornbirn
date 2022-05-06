package aron.week07.person;

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")" + " (Height: " + height + ")"+ " (Weight: " + weight + ")";
    }

    public int getAge() {
        return age;
    }
    public int getheight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
}
