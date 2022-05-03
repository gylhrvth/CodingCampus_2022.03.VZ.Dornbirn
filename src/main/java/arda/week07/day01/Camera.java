package arda.week07.day01;

import arda.week07.day02.Objective;
import arda.week07.day02.SdCard;

public class Camera {
    private String model;
    private String manufacturer;
    private int megapixel;
    private SdCard sdCard;
    private Objective lens;

    public Camera(String model, String manufacturer, int megapixel, SdCard sdCard,Objective lens) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.megapixel = megapixel;
        this.sdCard = sdCard;
        this.lens = lens;
    }

    @Override
    public String toString() {
        return manufacturer + " " + model + " (" + megapixel + " megapixel " + ")";
    }

    public boolean takePhoto() {
        System.out.println("\"click\"");
        return sdCard.reserve();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public String getModel() {
        return model;
    }

    public void setSdCard(SdCard sdCard) {
        this.sdCard = sdCard;
    }

    public void setLens(Objective lens) {
        this.lens = lens;
    }
}
