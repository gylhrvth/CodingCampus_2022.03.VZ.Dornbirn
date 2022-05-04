package philipp.week07.person;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight;
    }

//    @Override
//    public String toString() {
//        return name + " (Age: " + age + ")";
//    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
    //    public void setAge(int age) {
//        this.age = age;
//    }
}
