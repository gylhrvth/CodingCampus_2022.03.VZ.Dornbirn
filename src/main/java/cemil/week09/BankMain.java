package cemil.week09;


import java.util.List;
import java.util.Vector;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank("Sparkasse");
//        List<Schalter> schalters = new Vector<>();
        Schalter schalter1 = new Schalter("Bank Counter 1");
        Schalter schalter2 = new Schalter("Bank Counter 2");
        Schalter schalter3 = new Schalter("Bank Counter 3");
        Schalter schalter4 = new Schalter("Bank Counter 4");

        List<Kunde> kundes = new Vector<>();
        Kunde kunde1 = new Kunde("Kunde 1",24654);
        Kunde kunde2 = new Kunde("Kunde 2",4352);
        Kunde kunde3 = new Kunde("Kunde 3",13456);
        Kunde kunde4 = new Kunde("Kunde 4",377);
        Kunde kunde5 = new Kunde("Kunde 5",12347);
        Kunde kunde6 = new Kunde("Kunde 6", 1245);

        kundes.add(kunde1);
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
