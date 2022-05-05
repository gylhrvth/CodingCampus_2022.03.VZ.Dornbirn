package zah.week07.fotoCamera;

public class MamoryCard {
    private float freeSpace;

    public MamoryCard(float freeSpace){
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
    public void checkFotos(float free){
        if (this.freeSpace>free){
            this.freeSpace-=free/0.3;
        }else {
            System.out.println("test ");
        }
    }

}
