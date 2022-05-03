package gyula.week07.camera;

public class Main {
    public static void main(String[] args) {
        Camera cam1 = new Camera("Nikon", "F5", 24);
        Camera cam2 = new Camera("Sony", "A6400", 24);
        SdCard card = new SdCard("Samsung SD3000", 1000);

        cam1.takePicture();
        cam1.insertMemoryCard(card);
        cam1.takePicture();
        cam1.removeMemoryCard();

        cam2.insertMemoryCard(card);
        cam2.takePicture();

        System.out.println(cam1);
        System.out.println("***********************");
        System.out.println(cam2);
    }
}
