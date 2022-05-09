package aron.week07.zoosim;

import java.util.ArrayList;

public class Animal {
    
    private  String name;
    private String genus;
    private Enclosure  cageOfAnimal;

    public Animal(String name , String genus){

        this.name = name;
        this.genus = genus;
        this.cageOfAnimal = null;
    }

    public String getGenus() {
        return genus;
    }

    public String getName() {
        return name;
    }

    public void setCageOfAnimal(Enclosure cageOfAnimal) {
        this. cageOfAnimal = cageOfAnimal;
    }

    public Enclosure getCageOfAnimal() {
        return  cageOfAnimal;
    }

    @Override
    public String toString() {
        return
                "Name= " + name +"|"+ "Genus= " + genus +"|"+ "CageOfAnimal= " + cageOfAnimal+"|";
    }
}



