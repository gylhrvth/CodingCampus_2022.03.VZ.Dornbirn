package timo.week07.Camera;

public class Camera {
    private String model;
    private String manufacturer;
    private int megapixel;
    private Lens lens;
    private SDCard sd;


    public Camera(String model, String manufacturer, int megapixel, Lens lens, SDCard sd) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.megapixel = megapixel;
        this.lens = lens;
        this.sd = sd;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", lens: " + lens + ", Remaining free space: " + sd.getFreeMemory();
    }


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public Lens getLens() {
        return lens;
    }


    public void takePhoto() {
        float fotoSize = 5.0f;
        if (sd.getFreeMemory() >= fotoSize) {
            System.out.println("* CLICK *");
            sd.save(fotoSize);
        } else {
            System.out.println("Memory SD-Card limit reached!");
        }
    }

    public void deletePhoto(int numberOfPhotos) {
        float fotoSize = 3.0f;
        sd.delete(fotoSize * numberOfPhotos);
        System.out.println("Deleted " + numberOfPhotos + " photos");
    }

    public void switchLens(Lens newLens) {
        System.out.println("REPLACED: Lens (" + lens + ") WITH: Lens (" + newLens +")");
        lens = newLens;
    }

    public void switchSD(SDCard newSD) {
        System.out.println("REPLACED: Memory SD-Card (" + sd + ") WITH: Memory SD-Card (" + newSD + ")");
        sd = newSD;
    }


}
