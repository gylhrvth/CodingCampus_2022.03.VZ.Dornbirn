package sergej.week07.camera;

public class Camera {

    private String model;
    private String manufact;
    private int focalMin;
    private int focalMax;
    private int megapixel;
    private MemoryCard sd;

    public Camera(String model, String manufact, int focalMin, int focalMax, int megapixel) {
        this.model = model;
        this.manufact = manufact;
        this.focalMin = focalMin;
        this.focalMax = focalMax;
        this.megapixel = megapixel;
        this.sd = null;
    }

    @Override
    public String toString() {
        return "Model: " + model + "\n" +
                "Hersteller: " + manufact + "\n" +
                "Brennweite minimum: " + focalMin + "mm" + "\n" +
                "Brennweite maximum: " + focalMax + "mm" + "\n" +
                "Megapixel: " + megapixel + "mb" + "\n";
    }

    public void takePhoto() {
        if (sd != null) {
            System.out.println("Click");
            sd.reserveSpace(0.3f);
            System.out.println("Space left: " + sd.getFreeSpace());
        } else {
            System.out.println("No memory card. Take photo is not allowed.");
        }

    }

    public void setSd(MemoryCard sd) {
        this.sd = sd;
    }
}
