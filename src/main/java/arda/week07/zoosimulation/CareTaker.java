package arda.week07.zoosimulation;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private String name;
    private Enclosure taskedToCage;
    public CareTaker(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTaskedToCage(Enclosure taskedToCage) {
        this.taskedToCage = taskedToCage;
    }

    public Enclosure getTaskedToCage() {
        return taskedToCage;
    }

    @Override
    public String toString() {
        return "CareTaker: " + name;
    }
}
