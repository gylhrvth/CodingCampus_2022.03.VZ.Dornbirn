package timo.week07.Camera;

public class SDCard {
    private String manufacturer;
    private float capacity;
    private float reserved;

    public SDCard(String manufacturer, float capacity) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
        this.reserved = 0.0f;
    }


    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + ", Capacity: " + capacity;
    }

    public float getFreeMemory() {
        return capacity - reserved;
    }

    public void save(float dataSize) {
        if (reserved + dataSize <= capacity) {
            reserved += dataSize;
        } else {
            System.out.println("Unable to save, maximum capacity reached");
        }
    }

    public void delete(float dataSize) {
        if (reserved - dataSize >= 0) {
            reserved -= dataSize;
        } else {
            System.out.println("Unable to delete, data size too big");
        }
    }

}
