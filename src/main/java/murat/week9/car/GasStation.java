package murat.week9.car;

public class GasStation {
    private String name;
    private String location;

    public GasStation(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "GasStation{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

