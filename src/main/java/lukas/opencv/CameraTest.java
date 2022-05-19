package lukas.opencv;

import nu.pattern.OpenCV;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.objdetect.Objdetect;
import org.opencv.videoio.VideoCapture;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * https://www.baeldung.com/java-opencv
 */
public class CameraTest {
    private static class ImageDrawer extends JPanel {
        private Image image;

        public void setImage(Image image) {
            this.image = image;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null) {
                g.drawImage(image, 0, 0, null);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        OpenCV.loadLocally();

        //Load CascadeClassifier
        CascadeClassifier cascadeClassifier = new CascadeClassifier();
        cascadeClassifier.load("src/main/resources/opencv/haarcascade/haarcascade_frontalface_alt.xml");

        Mat frame = new Mat();
        //0; default video device id
        VideoCapture camera = new VideoCapture(0);
        JFrame jframe = new JFrame("Title");
        jframe.setPreferredSize(new Dimension(1024, 768));
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageDrawer imageDrawer = new ImageDrawer();

        jframe.setContentPane(imageDrawer);
        jframe.setVisible(true);
        jframe.pack();

        while (true) {
            if (camera.read(frame)) {
                MatOfRect facesDetected = new MatOfRect();
                int minFaceSize = Math.round(frame.rows() * 0.1f);
                cascadeClassifier.detectMultiScale(frame,
                        facesDetected,
                        1.1,
                        3,
                        Objdetect.CASCADE_SCALE_IMAGE,
                        new Size(minFaceSize, minFaceSize),
                        new Size()
                );
                Rect[] facesArray = facesDetected.toArray();
                for (Rect face : facesArray) {
                    Imgproc.rectangle(frame, face.tl(), face.br(), new Scalar(0, 0, 255), 3);
                }
                imageDrawer.setImage(mat2Img(frame));
                imageDrawer.repaint();
            }
        }
    }

    private static Image mat2Img(Mat mat) throws IOException {
        MatOfByte bytes = new MatOfByte();
        Imgcodecs.imencode(".jpg", mat, bytes);
        InputStream inputStream = new ByteArrayInputStream(bytes.toArray());
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        return bufferedImage.getScaledInstance(1024, 768, Image.SCALE_DEFAULT);
    }
}
