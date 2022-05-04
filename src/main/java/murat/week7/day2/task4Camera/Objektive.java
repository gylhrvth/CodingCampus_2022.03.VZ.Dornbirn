package murat.week7.day2.task4Camera;

public class Objektive {

    private final String producer;

    private final String model;

    private final int megapixel;

    private final int focalMin;

    private final int focalMax;

    public Objektive(String producer, String model, int megapixel, int focalMin, int focalMax) {

        this.producer = producer;
        this.model = model;
        this.megapixel = megapixel;
        this.focalMin = focalMin;
        this.focalMax = focalMax;
    }

    public String toString() {

        return producer + " " + model + " " + megapixel + " " + focalMin + " " + focalMax;
    }

    public String getProducer() {

        return producer;
    }

    public String getModel() {

        return model;
    }

    public int getMegapixel() {

        return megapixel;
    }

    public int getFocalMin() {

        return focalMin;
    }

    public int getFocalMax() {

        return focalMax;
    }

}
