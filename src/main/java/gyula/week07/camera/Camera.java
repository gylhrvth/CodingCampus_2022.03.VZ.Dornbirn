package gyula.week07.camera;

import com.sun.jdi.VMOutOfMemoryException;

public class Camera {
    private String manufacturer;
    private String model;
    private int resolution;

    private SdCard memoryCard;

    public Camera(String manufacturer, String model, int resolution){
        this.manufacturer = manufacturer;
        this.model = model;
        this.resolution = resolution;
        this.memoryCard = null;
    }

    public void insertMemoryCard(SdCard card) {
        if (this.memoryCard == null) {
            if (card.getCamera() == null) {
                this.memoryCard = card;
                card.setCamera(this);
            } else {
                System.out.println("The memory card is in a Camera soon inserted.");
            }
        } else {
            System.out.println("In this camera is a memory card inserted.");
        }
    }

    public void removeMemoryCard(){
        if (memoryCard != null) {
            memoryCard.setCamera(null);
            memoryCard = null;
        } else {
            System.out.println("No more memory card is in camera inserted");
        }
    }

    public void takePicture(){
        if (memoryCard!=null){
            System.out.println("* Click! *");
            memoryCard.reserve(300);
        } else {
            System.out.println("Camera is not ready. Memory card is missing");
        }
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", resolution=" + resolution +
                "}\n    " + memoryCard;
    }
}



