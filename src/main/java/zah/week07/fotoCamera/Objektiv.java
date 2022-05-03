package zah.week07.fotoCamera;

public class Objektiv {
    private float focalmin;
    private float focalmax;
    private String model;
    private String manufact;

    public Objektiv(float focalmin, float focalmax, String model, String manufact) {
        this.focalmin = focalmin;
        this.focalmax = focalmax;
        this.model = model;
        this.manufact = manufact;

    }

    @Override
    public String toString() {
        return "Objektiv{" +
                "focalmin=" + focalmin +
                ", focalmax=" + focalmax +
                ", model='" + model + '\'' +
                ", manufact='" + manufact + '\'' +
                '}';
    }
    public float getFocalmin(){
        return focalmin;
    }
    public float getFocalmax(){
        return focalmax;
    }

    public String getManufact() {
        return manufact;
    }

    public String getModel() {
        return model;
    }
}
