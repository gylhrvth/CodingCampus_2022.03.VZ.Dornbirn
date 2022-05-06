package aron.week07.Camara;

public class Lens {

    private String manufacture;
    private int focalLengthMin;
    private int focalLengthMax;

    public Lens (String manufacture,int focalLengthMin,int focalLengthMax){
        this.manufacture = manufacture;
        this.focalLengthMin = focalLengthMin;
        this.focalLengthMax = focalLengthMax;
    }

    @Override
    public String toString() {return "Lens{" + "manufacture='" + manufacture + '\'' + ", focalLengthMin=" + focalLengthMin + ", focalLengthMax=" + focalLengthMax + '}';
    }
}


