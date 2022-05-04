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
                "Megapixel: " + megapixel + "mb" + "\n" +
                "Model: " + (ob != null ? ob.getModel() : "Kein Objektiv ist angeschlossen") + "\n";

    }

    public void takePhoto() {
        if (sd != null) {
            System.out.println("Click");
            sd.reserveSpace(0.3f);
            System.out.printf("Space left: %.3f mb  \n", sd.getFreeSpace());
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

    public void swapOb(Objektiv ob) {
        if (ob == null) {
            if (this.ob != null) {
                this.ob.setCamera(null);
            }
            this.ob = null;
        } else {
            if (ob.getCamera() != null) {
                System.out.println("Objectiv is allready mounted >>" + ob.getCamera());
                ob.getCamera().swapOb(null);
                System.out.println("Objectiv has been removed from the other camera");
            }
            this.ob = ob;
            ob.setCamera(this);
        }
    }
}


