package philipp.week07.zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private int yearOfEstablishment;
    private Vector<AnimalArea> animalArea;

    public Zoo(String name, int yearOfEstablishment) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        animalArea = new Vector<>();
    }

    @Override
    public String toString() {
        return "Zoo: " + name + ", established " + yearOfEstablishment
                + "\n" + "Animal area: \n" +animalArea;
    }

    public AnimalArea addArea (String name){
        AnimalArea a = new AnimalArea(name);
        animalArea.add(a);
        return a;
    }
    public void removeArea (AnimalArea animalArea){
        animalArea.setName(null);

    }


}

