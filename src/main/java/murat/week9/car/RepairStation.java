package murat.week9.car;

import java.util.ArrayList;
import java.util.List;

public class RepairStation {
    private String name;
    private String location;
    private List<Car> cars = new ArrayList<>();

    public RepairStation(String name, String location, List<Car> cars) {
        this.name = name;
        this.location = location;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "RepairStation{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", cars=" + cars +
                '}';
    }
}
