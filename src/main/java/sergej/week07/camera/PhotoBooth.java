package sergej.week07.camera;

public class PhotoBooth {
    public static void main(String[] args) {
        Camera sony = new Camera("DSC-RX10M4", "Sony", 20);
        Camera kodak = new Camera("t-100", "Kodak", 2);
        Objective olympus = new Objective(18f, 200f, "Olympus", "DC7");
        Objective zeus = new Objective(20f, 200f, "Zeus", "AP2");
        MemoryCard sd = new MemoryCard(30f);
        MemoryCard sd16 = new MemoryCard(16f);

        sony.swapOb(olympus);
        kodak.swapOb(zeus);

        sony.setSd(sd);

        System.out.println(kodak);
        System.out.println(sony);

        sony.swapOb(zeus);

        System.out.println(kodak);
        System.out.println(sony);
        System.out.println(kodak);
        for (int i = 0; i < 10; i++) {
            sony.takePhoto();
        }

        System.out.println(">>>>>>" + sd.getFreeSpace() + "<<<<<<<<<");

        for (int i = 0; i < 100; i++) {
            sony.takePhoto();

        }

        sony.swapMem(sd16);
        sony.checkMemory();

        for (int i = 0; i < 20; i++) {
            sony.takePhoto();

        }
        sony.checkMemory();
    }
}
