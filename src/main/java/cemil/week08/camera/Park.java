package cemil.week08.camera;

import cemil.week08.camera.Day2Camera;
import cemil.week08.camera.Objecetiv;
import cemil.week08.camera.SdCard;

public class Park {
    public static void main(String[] args) {
        Day2Camera cam = new Day2Camera("canon R4", "canon inc.", 25);
        Day2Camera cam2 = new Day2Camera("nikon C22", "nikon inc.", 25);
        Objecetiv lens = new Objecetiv("lens3000");
        SdCard card = new SdCard(10, 0);

        System.out.println("===============================");
        cam.insertSdCard(card);
        cam.mountLens(lens);
        cam.takePhoto();
        cam2.insertSdCard(card);
        System.out.println(card);


         /*
        for (int i = 0; i < 100; i++) {
            boolean result = cam.takePhoto();
            if (!result){
                System.out.println("cannot take picture");
                break;
            }
            System.out.println(card.getPictures());
            System.out.println(card.getFreeSpace());
        }

          */
    }
}
