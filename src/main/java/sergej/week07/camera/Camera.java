package sergej.week07.camera;

public class Camera {

    private String model;
    private String manufact;
    private int megapixel;
    private MemoryCard sd;
    private Objective ob;

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
                "Brennweite minimum: " + (ob != null ? ob.getFocalMin() : "Kein Objektiv!!") + "mm" + "\n" +
                "Brennweite maximum: " + (ob != null ? ob.getFocalMax() : "Kein Objektiv!!") + "mm" + "\n" +
                "Megapixel: " + megapixel + "mb" + "\n" +
                "Objektiv: " + (ob != null ? ob.getManufactur() : "Kein Objektiv!!") + "\n";
    }

    public void takePhoto() {
        if (sd != null) {
            System.out.println("Click");
            sd.reserveSpace(0.3f);
            System.out.printf("Space left: %.2f mb\n", sd.getFreeSpace());
        } else {
            System.out.println("No memory card. Take photo is not allowed.");
        }

    }

    public void checkMemory() {
        if (sd != null) {
            System.out.println("Space on Memory left: " + sd.getFreeSpace());
        } else {
            System.out.println("NO card to check!");
        }
    }

    public void swapMem(MemoryCard mc) {
        this.sd = mc;

    }

    public void swapOb(Objective ob) {
        if (ob == null) {
            if (this.ob != null) {
                this.ob.setCam(null);
            }
            this.ob = null;
        } else {
            if (ob.getCam() != null) {
                System.out.println("Objectiv is allready mounted >>" + ob.getCam());
                ob.getCam().swapOb(null);
                System.out.println("Objectiv has been removed from the other camera");
                this.ob = ob;
                ob.setCam(this);
            }
            this.ob = ob;
            ob.setCam(this);
        }

    }


    public void setSd(MemoryCard sd) {
        this.sd = sd;
    }

}
