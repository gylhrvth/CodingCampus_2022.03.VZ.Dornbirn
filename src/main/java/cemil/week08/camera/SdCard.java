package cemil.week08.camera;



public class SdCard {
    private int space;
    private int pictures;
    private Day2Camera cameraWithCard;

    public SdCard(int space, int pictures) {
        this.space = space;
        this.pictures = pictures;
        this.cameraWithCard = null;
    }

    public double getFreeSpace() {
        double picSize = 0.3;
        double freeSpace = 0;
        picSize = pictures * picSize;
        freeSpace = space - picSize;
        return freeSpace;
    }

    public boolean reserve() {
        if (getFreeSpace() >= 0.3) {
            pictures++;
            return true;
        } else {
            System.out.println("sdcard is full");
            return false;
        }
    }

    public Day2Camera getCameraWithCard() {
        return cameraWithCard;
    }

    public void setCameraWithCard(Day2Camera cameraWithCard) {
        this.cameraWithCard = cameraWithCard;
    }

    public int getSpace() {
        return space;
    }

    public int getPictures() {
        return pictures;
    }

    @Override
    public String toString() {
        return "SdCard{ " +
                "space = " + space +
                ", pictures = " + pictures +
                ", cameraWithCard = " + cameraWithCard +
                ", free space = " + getFreeSpace() +
                ", inserted = "+ (cameraWithCard!=null?cameraWithCard.getModel():"not yet inserted") +
                '}';
    }

}
