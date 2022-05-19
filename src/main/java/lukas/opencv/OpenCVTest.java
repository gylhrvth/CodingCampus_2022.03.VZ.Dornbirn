package lukas.opencv;

import nu.pattern.OpenCV;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.objdetect.Objdetect;

import java.io.File;

/**
 * https://www.baeldung.com/java-opencv
 * <p>
 * Some fotos from Google are used
 */
public class OpenCVTest {
    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) {
        OpenCV.loadLocally();
        //The paths won't work in a bundled application...
        File imageFolder = new File("src/main/resources/opencv/images/");
        //Load CascadeClassifier
        CascadeClassifier cascadeClassifier = new CascadeClassifier();
        cascadeClassifier.load("src/main/resources/opencv/haarcascade/haarcascade_frontalface_alt.xml");
        //Face recognition for every image in opencv/images folder
        long start = System.currentTimeMillis();
        File[] images = imageFolder.listFiles();
        for (File image : images) {
            recogniseFace(image.getAbsolutePath(), "assets/tmp/detected_" + image.getName().replaceAll("\\..*", "") + ".jpg", cascadeClassifier);
        }
        System.out.println("Detection for " + images.length + " images took: " + (System.currentTimeMillis() - start) + "ms");
        //Otherwise the program stops with a negative value
        System.exit(0);
    }

    private static void recogniseFace(String path, String output, CascadeClassifier cascadeClassifier) {
        Mat loadedImage = Imgcodecs.imread(path);
        MatOfRect facesDetected = new MatOfRect();
        int minFaceSize = Math.round(loadedImage.rows() * 0.1f);
        cascadeClassifier.detectMultiScale(loadedImage,
                facesDetected,
                1.1,
                3,
                Objdetect.CASCADE_SCALE_IMAGE,
                new Size(minFaceSize, minFaceSize),
                new Size()
        );
        Rect[] facesArray = facesDetected.toArray();
        for (Rect face : facesArray) {
            Imgproc.rectangle(loadedImage, face.tl(), face.br(), new Scalar(0, 0, 255), 3);
        }
        Imgcodecs.imwrite(output, loadedImage);
    }
}