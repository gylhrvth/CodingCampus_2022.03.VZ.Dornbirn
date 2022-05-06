package timo.week07.Camera;

public class PhotoBooth {
    public static void main(String[] args) {
        Lens lens1 = new Lens("Canon", 18, 100);
        Lens lens2 = new Lens("Focus", 30, 180);
        Lens lens3 = new Lens("Fuji", 20, 200);

        SDCard sd1 = new SDCard("Samsung", 20.0f);
        SDCard sd2 = new SDCard("Phillips", 30.0f);
        SDCard sd3 = new SDCard("Toshiba", 50.0f);

        Camera cam1 = new Camera( "DSC-RX10M4", "Sony", 300, lens1 , sd1);
        Camera cam2 = new Camera("X1D-50C", "Hasselblad", 500, lens2, sd2);




        for (int i = 0; i < 5; i++) {
            System.out.println(cam1);
            cam1.takePhoto();
        }
        System.out.println();
        System.out.println("===========================================================================================");
        System.out.println();
        cam1.deletePhoto(1);
        System.out.println("Current setup is: " + cam1);
        System.out.println();
        System.out.println("===========================================================================================");
        System.out.println();
        cam1.switchLens(lens3);
        System.out.println("Current setup is: " + cam1);
        System.out.println();
        System.out.println("===========================================================================================");
        System.out.println();
        cam1.switchSD(sd2);
        System.out.println("Current setup is: " + cam1);

    }

}
