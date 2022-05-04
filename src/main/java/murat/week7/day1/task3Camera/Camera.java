package murat.week7.day1.task3Camera;

import murat.week7.day2.task4Camera.MemoryCard;
import murat.week7.day2.task4Camera.Objektive;

public class Camera {
    private final String producer;

    private final String model;

    private final int megapixel;

    private Objektive ob;

    private MemoryCard mem;

    public enum EnumList {
        PRODUCER,
        MODEL,
        MEGAPIXEL,
        FOCALMIN,
        FOCALMAX
    }

    public Camera(String producer, String model, int megapixel) {

        this.producer = producer;
        this.model = model;
        this.megapixel = megapixel;
        this.ob = null;
        this.mem = null;
    }

    public String toString() {

        return producer + " " + model + " " + megapixel + " " + ANSI_RED + ob + " " + mem + ANSI_RESET;
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

    public void setOb(Objektive ob) {

        this.ob = ob;
    }

    public void setMem(MemoryCard mem) {

        this.mem = mem;
    }

    public void takeAPhoto() {

        if (ob == null) {
            System.out.println("No photo without objective is possible");
            return;
        }
        if (mem == null) {
            System.out.println("Memory card is missing.");
            return;
        }

        System.out.println("Click");
        storageAdjuster();
        System.out.println("Objective: " + ob);
        System.out.println("Memory Card: " + mem);
    }

    public void storageAdjuster() {

        float onePicSize = 0.3f;
        mem.setFreeStorage(mem.getFreeStorage() - onePicSize);
    }

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_BLACK = "\u001B[30m";

    public static final String ANSI_RESET = "\u001B[0m";
}
