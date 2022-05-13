package lukas.week8.day5.zoo;

public class ZooManager {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Alpenzoo");
        Caretaker geierwalli = new Caretaker("Geierwalli");
        Caretaker reinhold = new Caretaker("Reinhold");

        Animal animal = new Animal("Zimba", "Löwe");
        Animal animal1 = new Animal("Balu", "Bär");
        Animal animal2 = new Animal("Ka", "Python");
        Animal animal3 = new Animal("Lui", "Affe");
        Animal animal4 = new Animal("Bagira", "Panther");
        Animal animal5 = new Animal("Shirkan", "Tiger");

        Prison prison = new Prison("Serengeti");
        prison.addAnimal(animal);
        prison.addAnimal(animal1);
        prison.addAnimal(animal2);
        prison.addAnimal(animal3);
        prison.setCaretaker(reinhold);

        Prison prison2 = new Prison("Taklama");
        prison2.addAnimal(animal4);
        prison2.addAnimal(animal5);
        prison2.setCaretaker(geierwalli);

        zoo.addPrison(prison);
        zoo.addPrison(prison2);

        System.out.println(zoo);
    }
}
