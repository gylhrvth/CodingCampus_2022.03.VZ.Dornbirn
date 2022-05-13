package lukas.week8.day4;

import java.util.HashMap;
import java.util.Map;

public class Rehearsal {
    public static void main(String[] args) {
        Map<String, String> hash = new HashMap<>();
        hash.put("Cookies", "Süß");

        System.out.println(hash.get("Cookie"));
        System.out.println(hash.get("Cookies"));

        Map<Person, Integer> personMap = new HashMap<>();

        Person arda = new Person("Arda");

        personMap.put(arda, 16);

        //Objekt arda steht nicht mehr direkt zur Verfügung
        //Userinput
        String input = "Arda";
        System.out.println(personMap.get(new Person(input)));
    }
}
