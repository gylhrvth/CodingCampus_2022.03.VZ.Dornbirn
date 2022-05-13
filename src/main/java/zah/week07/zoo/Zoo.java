package zah.week07.zoo;

import java.util.HashMap;
import java.util.Vector;

public class Zoo {

    private String name;
    private int foundation;
    private Vector<Enclosure> enclosures;
    private Vector<Nurse> nurses;
    private Vector<Feed> feeds;


    public Zoo(String name, int foundation) {

        this.name = name;
        this.foundation = foundation;
        this.enclosures = new Vector<>();
        this.nurses = new Vector<>();
        this.feeds = new Vector<>();
    }


    public String toString(String id) {
        String out = id + "├──";
        out += name;
        out += " " + foundation + "\n";
        for (Nurse n : nurses) {
            out += Zoo.ANSI_CYAN + "\n\t├──" + n.toString(id) + "\n" + Zoo.ANSI_RESET;
        }
        for (Enclosure enc : enclosures) {
            out += Zoo.ANSI_GREEN + "\n\t├──" + enc.toString(id) + "\n" + Zoo.ANSI_RESET;
        }
        return out;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public Feed addFeed(String name) {
        Feed feed = new Feed(name, "", 0);
        feeds.add(feed);
        return feed;
    }

    public Nurse addNurse(String name) {
        Nurse n = new Nurse(this, name);
        nurses.add(n);
        return n;
    }


    public void addEnclosure(Enclosure enc) {
        if (!enclosures.contains(enc)){
            enclosures.add(enc);
        }
    }

    public Enclosure searchEnclosureByName(String name) {
        for (Enclosure enc : enclosures) {
            if (enc.getName().equals(name)) {
                return enc;
            }
        }
        return new Enclosure(this,name);
    }

    public Feed searchFoodByName(String name) {
        for (Feed f : feeds) {
            if (f.getName().equals(name)) {
                return f;
            }

        }
        return addFeed(name);
    }

    public void simulate(int day) {
        HashMap<Feed, Integer> feedStatistik = new HashMap<>();

        System.out.println("Start day " + day);
        for (Nurse n : nurses) {
            n.simulate(day, feedStatistik);
        }
        printStatistc(feedStatistik);

        for (Enclosure enc: enclosures) {
            enc.simulateBites();

        }
    }

    private void printStatistc(HashMap<Feed, Integer> feedStatistik) {
        System.out.println("Feed statistic:");
        for (Feed f : feedStatistik.keySet()) {
            System.out.printf("%-20s %5d %-8s %7d%n", f.getName(), feedStatistik.get(f), f.getUnit(), (feedStatistik.get(f) * f.getUnitPrice()));
        }
    }

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_BLACK = "\u001B[30m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_GREEN = "\u001B[32m";

}

