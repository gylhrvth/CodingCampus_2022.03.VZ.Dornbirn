package zah.week07.fotoCamera;

import sergej.week07.camera.MemoryCard;

public class Camera {
    private String model;
    private String manufact;
    private int megapixel;
    private MamoryCard sd;
    private Objektiv ob;

    public Camera(String model, String manufact, int megapixel) {
        this.model = model;
        this.manufact = manufact;
        this.megapixel = megapixel;
        this.sd = null;
        this.ob = null;
    }

    @Override
    public String toString() {
        return "Model: " + model + "\n" +
                "Hersteller: " + manufact + "\n" +
                "Megapixel: " + megapixel + "mb" + "\n"+
                "Model: "+ ob.getModel() + "\n";

    }

    public void takePhoto() {
        if (sd != null) {
            System.out.println("Click");
            sd.reserveSpace(0.3f);
            System.out.println("Space left: " + sd.getFreeSpace());
        } else {
            System.out.println("No memory card. Take photo is not allowed.");
        }

    }

    public void setSd(MamoryCard sd) {
        this.sd = sd;
    }

    public void checkMemory() {
        if (sd != null) {
            System.out.println("Space on Memory left: " + sd.getFreeSpace());
        } else {
            System.out.println("test");
        }
    }


    public MamoryCard swapMem() {
        MamoryCard newC = new MamoryCard(30f);

        return newC;

    }

    public Objektiv swapOb(Objektiv ob) {
        Objektiv newO = ob;
        return newO;
    }

    public Objektiv setOb(Objektiv ob) {
        this.ob = ob;
        return ob;
    }
}


