package aron.week07.Camara;

public class Camera {

    private String manufacturer;
    private String model;
    private int megapixel;
    private Lens lens;
    private SDCard memoryCard;

    public Camera(String manufacturer, String model, int megapixel, Lens lens, SDCard memoryCard) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.memoryCard = memoryCard;
        this.megapixel = megapixel;
        this.lens = lens;

    }

    public void takeFoto() {
        float fotoSize = 0.3f;
        if (memoryCard.getFreeMemory() >= fotoSize) {
            System.out.println("click");
           memoryCard.save(fotoSize);
        } else {
            System.out.println("memory is full");

        }
    }

    public void deletePhoto(int numberOfPhotos) {
        float fotoSize = 3.0f;
        memoryCard.delete(fotoSize * numberOfPhotos);
        System.out.println("Deleted " + numberOfPhotos + " photos");
    }


    public void switchLens(Lens newLens) {
        System.out.println("chaned " + lens + " to lens: " + newLens);
        lens = newLens;
    }

    public void switchSDCard(SDCard newSD) {
        System.out.println("chaned " + memoryCard + " to lens: " + newSD);
        memoryCard = newSD;
    }

    @Override
    public String toString() {
        return "model=" + model + "\nFreespace" + memoryCard.getFreeMemory();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public Lens getLens() {
        return lens;
    }

    public SDCard getMemoryCard() {
        return memoryCard;
    }
}

