package sergej.week07.zoo;


import java.util.Vector;

public class Zoo {

    private String name;
    private String city;
    private int founded;
    private Vector<Enclosure> enclosure;


    public Zoo(String name, String city, int founded) {
        this.name = name;
        this.city = city;
        this.founded = founded;
        enclosure = new Vector<>();

    }

    public String toString(String indentation) {
        String out = indentation + "├──";
        out += name;
        out += " " + founded + "\n";
        for (Enclosure enc : enclosure) {
            out += "\n\t├──"+enc.toString(indentation ) + "\n";
        }
        return out;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String getName() {
        return name;
    }

    public Enclosure addEnclosure(String name) {
        Enclosure e = new Enclosure(name);
        enclosure.add(e);
        return e;
    }

    public void removeEnclosure(Enclosure en) {
        enclosure.remove(en);
    }
    public Enclosure searchEnclosureByName(String name){
        for(Enclosure enc: enclosure){
            if (enc.getName().equals(name)){
                return enc;
            }
        }
        return addEnclosure(name);
    }




}
