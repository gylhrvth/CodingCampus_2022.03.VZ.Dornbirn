package aron.week07.Camara;

public class Photo {

    public static void main(String[] args) {
        Lens lens1 = new Lens("Nikon", 18, 105);
        Lens lens2 = new Lens("Canon", 75, 300);
        Lens lens3 = new Lens("Futji", 55, 200);

        SDCard card1 = new SDCard("Samsung", 64.0f);
        SDCard card2 = new SDCard("Philipps", 32.0f);
        SDCard card3 = new SDCard("Kings", 16.0f);

        Camera cam1 = new Camera("sony", "DSC-RXCM4", 500, lens2, card1);
        Camera cam2 = new Camera("hasselblad", "X1D50C", 300, lens1, card2);
        Camera cam3 = new Camera("Nikon", "5700", 600, lens3, card3);

        System.out.println(cam1);
        for (int i = 0; i < 10; i++) {
            cam1.takeFoto();
            System.out.println(cam1);
            System.out.println("============================");
        }
        cam1.deletePhoto(10);
        System.out.println(cam1);
        System.out.println("============================");
        System.out.println(cam1);
        System.out.println("============================");
        cam1.switchLens(lens3);
        System.out.println("============================");
        cam1.switchSDCard(card3);
    }
//        System.out.println("=================");
//        System.out.println(hasselblad);
//        System.out.println("=================");
//        System.out.println(Nikon);
}



