package sergej.week07;

public class PhotoBooth {
    public static void main(String[] args) {
        Camera sony = new Camera("DSC-RX10M4","Sony",18,105,20);

        System.out.println(sony);

        sony.takePhoto();
    }
}
