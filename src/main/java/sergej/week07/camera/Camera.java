package sergej.week07.camera;

public class Camera {

    private String model;
    private String manufact;
    private int focalMin;
    private int focalMax;
    private int megapixel;

    public Camera(String model, String manufact, int focalMin, int focalMax, int megapixel) {
        this.model = model;
        this.manufact = manufact;
        this.focalMin = focalMin;
        this.focalMax = focalMax;
        this.megapixel = megapixel;
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
        System.out.println("Click");

    }

    public String getModel() {
        return model;
    }

    public String getManufact() {
        return manufact;
    }

    public int getFocalMin() {
        return focalMin;
    }

    public int getFocalMax() {
        return focalMax;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void setFocalMax(int focalMax) {
        this.focalMax = focalMax;
    }

    public void setFocalMin(int focalMin) {
        this.focalMin = focalMin;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
