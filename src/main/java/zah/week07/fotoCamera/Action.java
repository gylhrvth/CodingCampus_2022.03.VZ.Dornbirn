package zah.week07.fotoCamera;

import zah.week07.fotoCamera.Camera;
import zah.week07.fotoCamera.MamoryCard;

public class Action {
    public static void main(String[] args) {
        Camera sony = new Camera("DSC-RX10M4","Sony",20);
        Objektiv olimp=new Objektiv(18f,200f,"Olympus","DC-7");
        Objektiv rz= new Objektiv(65f,500f,"zh","Dd-100");
        sony.setOb(olimp);
        System.out.println(sony);
        MamoryCard sd = new MamoryCard(30f);

        sony.setSd(sd);
        sony.swapOb(sony.setOb(rz));

        System.out.println(sony);

        for (int i = 0; i < 10; i++) {
            sony.takePhoto();
        }

        System.out.println(">>>>>>"+sd.getFreeSpace()+"<<<<<<<<<");

        for (int i = 0; i < 100; i++) {
            sony.takePhoto();

        }
        sony.setSd(sony.swapMem());
        sony.checkMemory();

    }
}
