package arda.week07.camera;

public class park {
    public static void main(String[] args) {
        Camera cam = new Camera("canon R4", "canon inc.", 25);
        Camera cam2 = new Camera("nikon C22", "nikon inc.", 25);
        Objective lens = new Objective("lens3000");
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
