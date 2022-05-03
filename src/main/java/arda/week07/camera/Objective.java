package arda.week07.camera;

public class Objective {
    private String lens;
    private Camera mountedCam;

    public Objective(String lens) {
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

    public Camera getMountedCam() {
        return mountedCam;
    }

    public void setMountedCam(Camera mountedCam) {
        this.mountedCam = mountedCam;
    }
}
