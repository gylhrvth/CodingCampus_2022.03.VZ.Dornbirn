package cemil.week08.Person;

public class Day1Person {

        private String name;
        private int age;
        private int height;
        private int weight;

    public Day1Person(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

        @Override
        public String toString () {
        return name + " (Age: " + age + ")";
    }

        public int getAge () {
        return age;
    }

    }

