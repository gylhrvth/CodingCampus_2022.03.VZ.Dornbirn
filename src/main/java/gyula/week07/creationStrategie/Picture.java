package gyula.week07.creationStrategie;

public class Picture {
    private int year;
    private String description;
    private String persons;

    public Picture(int year, String description, String persons){
        this.year = year;
        this.description = description;
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "year=" + year +
                ", description='" + description + '\'' +
                ", persons='" + persons + '\'' +
                '}';
    }
}
