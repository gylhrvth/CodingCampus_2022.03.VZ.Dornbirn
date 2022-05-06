package zah.week07.zoo;

import java.util.Vector;

public class Zoo {

    private String name;
    private int foundation;
    private Vector<Enclosure> enclosures;
    private Vector<Nurse> nurses;

    public Zoo(String name, int foundation) {

        this.name = name;
        this.foundation = foundation;
        this.enclosures = new Vector<>();
        this.nurses = new Vector<>();
    }


    public String toString(String id) {
        String out = id + "├──";
        out += name;
        out += " " + foundation + "\n";
        for (Nurse n:nurses) {
            out +=Zoo.ANSI_CYAN+"\n\t├──" + n.toString(id) + "\n"+Zoo.ANSI_RESET;
        }
        for (Enclosure enc : enclosures) {
            out +=Zoo.ANSI_GREEN+"\n\t├──" +enc.toString(id) + "\n"+Zoo.ANSI_RESET;
        }
        return out;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public Nurse addNurse(String name) {
        Nurse n = new Nurse(this, name);
        nurses.add(n);
        return n;
    }


    public Enclosure addEnclosure(String name) {
        Enclosure e = new Enclosure(name);
        enclosures.add(e);
        return e;
    }

    public Enclosure searchEnclosureByName(String name){
        for(Enclosure enc: enclosures){
            if (enc.getName().equals(name)){
                return enc;
            }
        }
        return addEnclosure(name);
    }

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_BLACK = "\u001B[30m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_GREEN = "\u001B[32m";
}

