package arda.week07.day02;

import arda.week07.day01.Camera;

public class park {
    public static void main(String[] args) {
        Camera cam = new Camera("canon", "canon inc.", 25, null,null);
        Objective lens = new Objective("lens3000");
        SdCard card = new SdCard(10,0);
        cam.setSdCard(card);
        for (int i = 0; i < 100; i++) {
            boolean result = cam.takePhoto();
            if (!result){
                System.out.println("cannot take picture");
                break;
            }
            System.out.println(card.getPictures());
            System.out.println(card.getFreeSpace());
        }
    }
}
