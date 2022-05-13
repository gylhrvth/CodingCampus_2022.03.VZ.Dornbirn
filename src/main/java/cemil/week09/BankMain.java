package cemil.week09;

import java.util.ArrayList;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank("Sparkasse");
        Schalter schalter1 = new Schalter("Jungel");
        Schalter schalter2 = new Schalter("Wald");
        Schalter schalter3 = new Schalter("Wiese");
        Schalter schalter4 = new Schalter("Gebirge");

        List<Kunde> kundes = new ArrayList<>();
        Kunde kunde2 = new Kunde("Löwe",24654);
        Kunde kunde3 = new Kunde("Bär",4352);
        Kunde kunde4 = new Kunde("Hase",13456);
        Kunde kunde5 = new Kunde("Esel",377);
        Kunde kunde6 = new Kunde("Schlange",12347);
        Kunde kunde7 = new Kunde("Köpek", 1245);

        kundes.add(kunde2);
        kundes.add(kunde3);
        kundes.add(kunde4);
        kundes.add(kunde5);
        kundes.add(kunde6);


        bank.addSchalter(schalter1);
        bank.addSchalter(schalter2);
        bank.addSchalter(schalter3);
        bank.addSchalter(schalter4);

        System.out.println(bank);





    }
}
