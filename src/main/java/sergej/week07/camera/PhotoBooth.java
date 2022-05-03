package sergej.week07.camera;

public class PhotoBooth {
    public static void main(String[] args) {
        Camera sony = new Camera("DSC-RX10M4","Sony",18,105,20);
        MemoryCard sd = new MemoryCard(30f);
        sony.setSd(sd);

        System.out.println(sony);

        for (int i = 0; i < 10; i++) {
            sony.takePhoto();
        }

        System.out.println(">>>>>>"+sd.getFreeSpace()+"<<<<<<<<<");

        for (int i = 0; i < 100; i++) {
            sony.takePhoto();

        }
    }
}
