package aron.week07.zoosim;

public class Enclosure {

    private String name;
    private ClimateZone clima;
    private Areasize size;
    private Animal animal;

    public Enclosure(String name, ClimateZone clima, Areasize size, Animal animal){

        this.name = name;
        this.clima = clima;
        this.size = size;
        this.animal = animal;
    }

    @Override

    public String toString() {return "Enclosure{" + "name='" + name + '\'' + ", clima='" + clima + '\'' + ", size=" + size +  ", animal=" + animal + '}';

    }
}
