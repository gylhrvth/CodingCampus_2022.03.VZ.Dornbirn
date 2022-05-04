package sergej.week07.camera;

public class Objective {

    private float focalMin;
    private float focalMax;
    private String model;
    private String manufactur;
    private Camera cam;

    public Objective(float focalMin, float focalMax, String manufactur, String model) {
        this.focalMin = focalMin;
        this.focalMax = focalMax;
        this.manufactur = manufactur;
        this.model = model;
        this.cam = null;
    }

    @Override
    public String toString() {
        return "Objective{" +
                "focalMin=" + focalMin +
                ", focalMax=" + focalMax +
                ", model='" + model + '\'' +
                ", manufactur='" + manufactur + '\'' +
                '}';
    }

    public float getFocalMax() {
        return focalMax;
    }

    public float getFocalMin() {
        return focalMin;
    }

    public String getManufactur() {
        return manufactur;
    }

    public Camera getCam() {
        return cam;
    }

    public void setCam(Camera cam) {
        this.cam = cam;
    }
}
