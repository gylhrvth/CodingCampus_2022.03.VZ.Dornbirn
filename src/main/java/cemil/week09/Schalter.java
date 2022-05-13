package cemil.week09;

public class Schalter {

    private String name;

    public Schalter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ANSI_RED + name + ANSI_RESET;
    }



    public void makeBusiness(Kunde kunde, int amount) {

    }

















    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
}



