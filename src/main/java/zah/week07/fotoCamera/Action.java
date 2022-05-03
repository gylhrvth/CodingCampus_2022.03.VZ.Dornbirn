package zah.week07.fotoCamera;

import zah.week07.fotoCamera.Camera;
import zah.week07.fotoCamera.MamoryCard;

public class Action {
    public static void main(String[] args) {
        Camera sony = new Camera("DSC-RX10M4","Sony",18,105,20);
        MamoryCard sd = new MamoryCard(30f);

        sony.setSd(sd);

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
