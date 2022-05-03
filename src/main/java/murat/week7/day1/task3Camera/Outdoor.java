package murat.week7.day1.task3Camera;

import murat.week7.day2.task4Camera.MemoryCard;
import murat.week7.day2.task4Camera.Objektive;

import java.text.StringCharacterIterator;
import java.util.Calendar;
import java.util.Date;

public class Outdoor {
    public static void main(String[] args) {

        Camera[] camList = {
                new Camera("Sony", "Alpha 7 III", 24),
                new Camera("Fujifilm", "X-T30 II FUJINON XF18", 26),
                new Camera("Canon", "EOS 250D", 24),
                new Camera("Panasonic", "DMC-FZ1000 4K", 20)
        };

        Objektive[] obList = {
                new Objektive("Aba", "Alpha", 1, 5, 11),
                new Objektive("Baba", "Beta", 2, 6, 22),
                new Objektive("Caba", "Gamma", 3, 8, 44),
                new Objektive("Dada", "Teta", 4, 7, 33)
        };

        MemoryCard[] memList = {
                new MemoryCard("Mem1", 16, 7),
                new MemoryCard("Mem2", 32, 22),
        };

        camList[1].setOb(obList[3]);
        camList[1].setMem(memList[1]);

        for (int i = 0; i < 5; i++) {
            camList[1].takeAPhoto();
        }

        System.out.println("\n-------Camera List----------");
        for (int i = 0; i < camList.length; i++) {
            System.out.println(camList[i]);
        }
        System.out.println("\n-------Objective List----------");
        for (int i = 0; i < obList.length; i++) {
            System.out.println(obList[i]);
        }
        System.out.println("\n-------Memory Card List----------");
        for (int i = 0; i < memList.length; i++) {
            System.out.println(memList[i]);
        }

    }

    private static void sort(Camera[] aList, Camera.EnumList anEnum) {

        boolean b = false;

        for (int i = 0; i < aList.length; i++) {
            for (int j = 0; j < aList.length - i - 1; j++) {

                switch (anEnum) {
                    case PRODUCER:
                        b = (aList[j].getProducer().compareTo(aList[j + 1].getProducer()) > 0);
                        break;
                    case MODEL:
                        b = (aList[j].getModel().compareTo(aList[j + 1].getModel()) > 0);
                        break;
                    case MEGAPIXEL:
                        b = aList[j].getMegapixel() > aList[j + 1].getMegapixel();
                        break;
                    default:
                        break;
                }

                if (b) {
                    Camera temp = aList[j + 1];
                    aList[j + 1] = aList[j];
                    aList[j] = temp;
                }
            }
        }
    }
}
