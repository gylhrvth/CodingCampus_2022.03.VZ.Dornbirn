package cemil.week08.camera;

import cemil.week08.camera.Day2Camera;

public class Objecetiv {
    private String lens;
    private Day2Camera mountedCam;

    public Objecetiv(String lens) {
        this.lens = lens;
    }

    public void setLens(String lens) {
        this.lens = lens;
        this.mountedCam = null;

    }

    public boolean isMounted() {
        if (this.lens != null) {
            System.out.println("lens is not mounted");
            return false;
        } else {
            System.out.println("is mounted");
            return true;
        }
    }

    public Day2Camera getMountedCam() {
        return mountedCam;
    }

    public void setMountedCam(Day2Camera mountedCam) {
        this.mountedCam = mountedCam;
    }

}
