package zah.week07.fotoCamera;

public class Objektiv {
    private float focalmin;
    private float focalmax;
    private String model;
    private String manufact;
    private Camera camera;

    public Objektiv(float focalmin, float focalmax, String model, String manufact) {
        this.focalmin = focalmin;
        this.focalmax = focalmax;
        this.model = model;
        this.manufact = manufact;
        this.camera =null;

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


    public String getModel() {
        return model;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
