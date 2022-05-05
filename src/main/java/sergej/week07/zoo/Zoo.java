package sergej.week07.zoo;


import java.util.Vector;
public class Zoo {

    private String name;
    private String city;
    private int founded;
    private Vector<Enclosure> enclosure;




    public Zoo(String name,String city,int founded){
        this.name = name;
        this.city = city;
        this.founded = founded;
        enclosure = new Vector<>();

    }

    @Override
    public String toString() {
        return "Zoo: " + name  + ", " + city + ",Founded: " + founded +
                "\nEnclosure:"+enclosure;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public int getFounded() {
        return founded;
    }
    public Enclosure addEnclosure(String name){
        Enclosure e = new Enclosure(name);
        enclosure.add(e);
        return e;
    }

}
