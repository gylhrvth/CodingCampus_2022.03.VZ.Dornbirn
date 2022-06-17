package philipp.week14.ExerciseOop;

public class Person {
    public enum GENDER {
        FEMALE,
        MALE,
        DIVERS
    }

    private String name;
    private int age;
    private GENDER gender;

    public Person(String name, int age, GENDER gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nName: " + name + " - Age: " + age + " - Gender: " + gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }
}
