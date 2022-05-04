package timo.week07.Camera;

public class Lens {
    private String manufacturer;
    private int focalLengthMin;
    private int focalLengthMax;

    public Lens (String manufacturer, int focalLengthMin, int focalLengthMax) {
        this.manufacturer = manufacturer;
        this.focalLengthMin = focalLengthMin;
        this.focalLengthMax = focalLengthMax;
    }


    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + ", Focal Length: " + focalLengthMin + "/" + focalLengthMax;}
    }
