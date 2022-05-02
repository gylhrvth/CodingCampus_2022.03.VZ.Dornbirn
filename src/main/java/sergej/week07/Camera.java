package sergej.week07;

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
        return "Camera{" +
                "model='" + model + '\'' +
                ", manufact='" + manufact + '\'' +
                ", focalMin=" + focalMin +
                ", focalMax=" + focalMax +
                ", megapixel=" + megapixel +
                '}';
    }

    public void takePhoto(){
        System.out.println("Click");

    }

    public String getModel(){
        return model;
    }

    public String getManufact(){
        return manufact;
    }

    public int getFocalMin(){
        return focalMin;
    }

    public int getFocalMax(){
        return focalMax;
    }

    public int getMegapixel(){
        return megapixel;
    }
}
