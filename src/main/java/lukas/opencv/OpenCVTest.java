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
        File images = new File("src/main/resources/opencv/images/");
        //Face recognition for every image in opencv/images folder
        for (File image : images.listFiles()) {
            recogniseFace(image.getAbsolutePath(), "assets/tmp/detected_" + image.getName().replaceAll("\\..*", "") + ".jpg");
        }
        //Otherwise the program stops with a negative value
        System.exit(0);
    }

    private static void recogniseFace(String path, String output) {
        Mat loadedImage = Imgcodecs.imread(path);
        MatOfRect facesDetected = new MatOfRect();
        CascadeClassifier cascadeClassifier = new CascadeClassifier();
        int minFaceSize = Math.round(loadedImage.rows() * 0.1f);
        cascadeClassifier.load("src/main/resources/opencv/haarcascade/haarcascade_frontalface_alt.xml");
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