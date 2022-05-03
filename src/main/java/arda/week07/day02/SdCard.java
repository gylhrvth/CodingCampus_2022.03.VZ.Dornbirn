package arda.week07.day02;

import arda.week07.day01.Camera;

public class SdCard {
    private int space;
    private int pictures;

    public SdCard(int space, int pictures) {
        this.space = space;
        this.pictures =pictures;
    }

    public double getFreeSpace() {
        double picSize = 0.3;
        double freeSpace = 0;
        picSize = pictures * picSize;
        freeSpace = space - picSize;
        return freeSpace;
    }
    public boolean reserve(){
        if (getFreeSpace() >= 0.3){
            pictures++;
            return true;
        }else{
            System.out.println("sdcard is full");
         return false;
        }
    }

    public int getSpace() {
        return space;
    }

    public int getPictures() {
        return pictures;
    }
}
