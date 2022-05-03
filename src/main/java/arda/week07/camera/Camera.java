package arda.week07.camera;

public class Camera {
    private String model;
    private String manufacturer;
    private int megapixel;
    private SdCard sdCard;
    private Objective lens;

    public Camera(String model, String manufacturer, int megapixel) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.megapixel = megapixel;
        this.sdCard = null;
        this.lens = null;
    }

    @Override
    public String toString() {
        return model;
    }

    public void takePhoto() {
        if (sdCard!=null){
            System.out.println("* Click! *");
            sdCard.reserve();
        } else {
            System.out.println("Memory card not inserted.");
        }
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

    public void mountLens(Objective lens) {
        if (this.lens == null) {
            if (lens.getMountedCam() == null) {
                this.lens = lens;
                lens.setMountedCam(this);
            } else {
                System.out.println("Lens is being mounted.");
            }
        } else {
            System.out.println("Camera already has a lens mounted on.");
        }
    }
    public void removeLens(){
        if (lens != null) {
            lens.setMountedCam(null);
            lens = null;
        } else {
            System.out.println("Lens has been taken off. ");
        }
    }

    public void insertSdCard(SdCard card) {
        if (this.sdCard == null) {
            if (card.getCameraWithCard() == null) {
                this.sdCard = card;
                card.setCameraWithCard(this);
            } else {
                System.out.println("SD Card is already in use with " + card.getCameraWithCard());
            }
        } else {
            System.out.println("Camera already has an sd card inserted.");
        }
    }

    public void removeCard() {
        if (sdCard != null) {
            sdCard.setCameraWithCard(null);
            sdCard = null;
        } else {
            System.out.println("SD Card has been taken out.");
        }
    }


}
