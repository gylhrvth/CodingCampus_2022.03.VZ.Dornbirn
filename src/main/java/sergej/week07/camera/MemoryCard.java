package sergej.week07.camera;

public class MemoryCard {

    private float freeSpace;

    public MemoryCard(float freeSpace){
        this.freeSpace = freeSpace;
    }

    @Override
    public String toString() {
        return "MemoryCard{" +
                "space=" + freeSpace +
                '}';
    }


    public float getFreeSpace(){
        return freeSpace;
    }

    public void reserveSpace(float spaceToReseve){
        if (this.freeSpace > spaceToReseve){
            this.freeSpace -= spaceToReseve;
        } else {
            System.out.println("Memory is full");
        }
    }
}
