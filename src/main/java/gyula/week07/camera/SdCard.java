package gyula.week07.camera;

public class SdCard {
    private String model;
    private int capacity;
    private int reserved;

    private Camera insertedInCamera;

    public SdCard(String model, int capacity){
        this.model = model;
        this.capacity = capacity;
        this.reserved = 0;
        this.insertedInCamera = null;
    }

    public void reserve(int kilobytes){
        if (capacity - reserved >= kilobytes){
            reserved += kilobytes;
        } else {
            System.out.println("Memory is full, save of picture is not possible.");
        }
    }

    public Camera getCamera() {
        return insertedInCamera;
    }

    public void setCamera(Camera cam) {
        this.insertedInCamera = cam;
    }

    @Override
    public String toString() {
        return "SdCard{" +
                "model='" + model + '\'' +
                ", inserted="+ (insertedInCamera!=null?insertedInCamera.getModel():"not yet inserted") +
                ", capacity=" + capacity +
                ", reserved=" + reserved +
                ", free=" + (capacity - reserved) +
                '}';
    }
}
