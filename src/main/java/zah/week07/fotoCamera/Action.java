package zah.week07.fotoCamera;

import zah.week07.fotoCamera.Camera;
import zah.week07.fotoCamera.MamoryCard;

public class Action {
    public static void main(String[] args) {
        Camera sony = new Camera("DSC-RX10M4", "Sony", 20);
        Camera canaon = new Camera("m600","Canon",5);
        Objektiv olimp = new Objektiv(18f, 200f, "Olympus", "DC-7");
        Objektiv rz = new Objektiv(65f, 500f, "zoro", "Dd-100");

        sony.swapOb(olimp);
        System.out.println(sony);

        MamoryCard sd = new MamoryCard(30f);
        canaon.swapOb(rz);
        System.out.println(canaon);
        sony.swapOb(rz);



        sony.setSd(sd);
        System.out.println(sony);
        System.out.println(canaon);

        for (int i = 0; i < 10; i++) {
            sony.takePhoto();

        }
        sd.checkFotos(sd.getFreeSpace());
        System.out.println(">>>>>>" + sd.getFreeSpace() + "<<<<<<<<<");

        for (int i = 0; i < 100; i++) {
            sony.takePhoto();

        }
        sony.setSd(sony.swapMem());
        sony.checkMemory();

    }
}
