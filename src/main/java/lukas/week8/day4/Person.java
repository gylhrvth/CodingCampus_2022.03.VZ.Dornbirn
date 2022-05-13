package lukas.week8.day4;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Person) {
            Person p = (Person) o;
            return p.name.equals(this.name);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hashCode = name.hashCode();
        System.out.println("Hashcode of: " + name + " -> " + hashCode);
        return hashCode;
    }

//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return name.equals(person.name);
//    }
//
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}
