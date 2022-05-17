package gyula.week09.hospital;

public class SportMedicine extends Doctor {
    private String favoritSport;


    public SportMedicine(String name, float salary, String licence, String favoritSport){
        super(name, salary, licence);
        this.favoritSport = favoritSport;
    }
}
