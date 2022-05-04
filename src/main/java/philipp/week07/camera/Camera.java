package philipp.week07.camera;

public class Camera {
    private String model;
    private String brand;
    private float megapixel;
    private float focalLengthMin;
    private float focalLengthMax;


    public Camera(String model, String brand, float megapixel, float focalLengthMin, float focalLengthMax) {
        this.model = model;
        this.brand = brand;
        this.megapixel = megapixel;
        this.focalLengthMin = focalLengthMin;
        this.focalLengthMax = focalLengthMax;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public float getMegapixel() {
        return megapixel;
    }



}
