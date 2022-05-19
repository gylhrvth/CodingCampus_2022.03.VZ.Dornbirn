package aron.week07.zoosim;

import java.util.ArrayList;
import java.util.HashMap;

public class Animal {
    
    private  String name;
    private String genus;
    private Food food;
    private Integer requirement;

    public Animal(String name , String genus,Food food, Integer requirement){

        this.name = name;
        this.genus = genus;
        this.food = food;
        this.requirement = requirement;
    }

    public void foodAnimal(HashMap<Food, Integer> statistik) {
        System.out.println(name + " has received " + requirement + " " + food.getUnit() + " of " + food.getName());
        if (statistik.containsKey(food)) {
            statistik.put(food, statistik.get(food) + requirement);
        } else {
            statistik.put(food, requirement);
        }
    }

    public String getGenus() {
        return genus;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "Name= " + name +"|"+ "Genus= " + genus ;
    }
}



