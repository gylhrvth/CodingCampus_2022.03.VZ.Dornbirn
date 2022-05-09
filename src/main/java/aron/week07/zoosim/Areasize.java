package aron.week07.zoosim;

public class Areasize {

    private String areaName;
    private int areaLong;
    private int areaWide;

    public Areasize(String areaName, int areaLong, int areaWide) {
        this.areaName = areaName;
        this.areaLong = areaLong;
        this.areaWide = areaWide;
    }

    @Override
    public String toString() {
        return "Areasize{" +
                "areaName='" + areaName + '\'' +
                ", areaLong=" + areaLong +
                ", areaWide=" + areaWide +
                '}';
    }
}
