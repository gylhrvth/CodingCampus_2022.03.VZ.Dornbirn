package aron.week07.Camara;

public class SDCard {
    private String manufacture;
    private float capacity;
    private float reserved;


    public SDCard(String manufacture, float capacity) {
        this.manufacture = manufacture;
        this.capacity = capacity;
        this.reserved = 0.0f;
    }

    @Override
    public String toString() {
        return "SDCard{" +
                "manufacture='" + manufacture + '\'' +
                ", capacity=" + capacity +
                ", reserved=" + reserved +
                '}';
    }

    public float getFreeMemory() {
        return capacity - reserved;
    }

    public void delete(float dataSize) {
        if (reserved - dataSize >= 0) {
            reserved -= dataSize;
        }else {
            System.out.println("full of memory");
        }
    }

    public void save(float dataSize) {
        if (reserved + dataSize <= capacity) {
            reserved += dataSize;
        }else {
            System.out.println("full of memory");
        }
    }
}

