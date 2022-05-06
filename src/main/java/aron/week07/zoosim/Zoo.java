package aron.week07.zoosim;

public class Zoo {

    private String name;
    private String year;
    private Enclosure enclosure;

    public Zoo (String name, String year, Enclosure enclosure){

        this.name = name;
        this.year = year;
        this.enclosure = enclosure;
    }

    @Override

    public String toString() {return "Zoo{" + "name='" + name + '\'' + ", year=" + year + ", enclosure=" + enclosure + '}';}

    public String getName() {return name;}

    public String getYear() {return year;}


    public Enclosure getEnclosure(){return enclosure;}
}

