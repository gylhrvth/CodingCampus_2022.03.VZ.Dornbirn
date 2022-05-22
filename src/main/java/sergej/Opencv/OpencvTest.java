package sergej.Opencv;

import nu.pattern.OpenCV;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class OpencvTest {
    public static class ImageDrawer extends JPanel {
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

    private static Image mat2Img(Mat mat) throws IOException {
        MatOfByte bytes = new MatOfByte();
        Imgcodecs.imencode(".jpg", mat, bytes);
        InputStream inputStream = new ByteArrayInputStream(bytes.toArray());
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        return bufferedImage.getScaledInstance(1280, 720, Image.SCALE_FAST);
    }

    public static void main(String[] args) throws IOException {
        OpenCV.loadShared();

        CascadeClassifier cascadeClassifier = new CascadeClassifier();


        VideoCapture capture = new VideoCapture("C:\\Users\\orasc\\Programming\\CodingCampus_2022.03.VZ.Dornbirn\\assets\\tmp\\lowRes.avi");
        // int fourcc = VideoWriter.fourcc('P', 'I', 'M', '1');
        //capture.set(Videoio.CAP_PROP_FOURCC, fourcc);


        Mat frame = new Mat();
        JFrame jframe = new JFrame("VisualBallistic");
        jframe.setPreferredSize(new Dimension(1285, 725));
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        OpencvTest.ImageDrawer imageDrawer = new OpencvTest.ImageDrawer();

        jframe.setContentPane(imageDrawer);
        jframe.setVisible(true);
        jframe.pack();

        //whiteball hsv color code upper lower limits
        int sensitivity = 70;
        Scalar whitelower = new Scalar(0, 0, 255 - sensitivity);
        Scalar whiteupper = new Scalar(255, sensitivity, 255);
        //green zero hsv color code upper lower limits
        Scalar greenlower = new Scalar(30, 90, 10);
        Scalar greenupper = new Scalar(70, 255, 255);


        Mat dst = new Mat();
        Mat hsv = new Mat();
        Mat mask = new Mat();
        Mat erode = new Mat();
        Mat dilate = new Mat();
        Mat hierachy = new Mat();
        List<MatOfPoint> contours = new ArrayList<>();

        Mat dstG = new Mat();
        Mat hsvG = new Mat();
        Mat maskG = new Mat();
        Mat erodeG = new Mat();
        Mat dilateG = new Mat();
        Mat hierachyG = new Mat();
        List<MatOfPoint> contoursG = new ArrayList<>();

        int elementType = Imgproc.CV_SHAPE_ELLIPSE;
        int kernelSize = 4;

        Mat element = Imgproc.getStructuringElement(elementType, new Size(2 * kernelSize + 1, 2 * kernelSize + 1));

        while (true) {
            if (capture.read(frame)) {
                // Filtering the white ball
                Imgproc.GaussianBlur(frame, dst, new Size(11, 11), 0); // make it blurry
                Mat blurred = dst;
                Imgproc.cvtColor(blurred, hsv, Imgproc.COLOR_BGR2HSV); // make it hsv color
                Core.inRange(hsv, whitelower, whiteupper, mask); // balltracking
                Imgproc.erode(mask, erode, element); // erode
                Imgproc.dilate(erode, dilate, element); // dilate
                //Track ball
               /* Imgproc.findContours(mask, contours, hierachy, Imgproc.RETR_CCOMP, Imgproc.CHAIN_APPROX_SIMPLE);
                // Iterator<MatOfPoint> it = contours.iterator();


                // test4
                if (hierachy.size().height > 0 && hierachy.size().width > 0) {
                    for (int i = 0; i >= 0; i = (int) hierachy.get(0, i)[0]) {
                        Imgproc.drawContours(frame, contours, i, new Scalar(250, 0, 0));

                    }
                }*/


                //test3
              /*  if (contours.size() > 0) {
                    MatOfPoint2f contours2f = new MatOfPoint2f();
                    contours2f.fromList(it.next().toList());
                    float[] radius = new float[1];
                    Point center = new Point();
                    Imgproc.minEnclosingCircle(contours2f, center, radius);
                    if (radius[0] < 10) {
                        Imgproc.circle(frame, center, (int) radius[0], new Scalar(0, 255, 255), 2);
                        Imgproc.circle(frame, center, 5, new Scalar(0, 0, 255), -1);
                    }

                }*/
                //test2

               /*for (int i = 0; i < contours.size(); i++) {
                    MatOfPoint2f contours2f = new MatOfPoint2f();
                    contours2f.fromList(contours.get(i).toList());
                    float[] radius = new float[1];
                    Point center = new Point();
                    Imgproc.minEnclosingCircle(contours2f, center, radius);
                    double a = Imgproc.contourArea(contours.get(i));
                    if (radius[0] < 50) {
                        Imgproc.circle(frame, center, (int)radius[0], new Scalar(0, 255, 255), 2);
                        Imgproc.circle(frame, center, 5, new Scalar(0, 0, 255), -1);}

                }*/
                //Test1
                /*if (it.hasNext()) {
                    System.out.println(it.next());
                    double c =  Math.max(it.next().elemSize(),Imgproc.contourArea(count));
                    float x,y,radius = Imgproc.minEnclosingCircle(pts,c,radiusF);
                    Imgproc.circle(frame, new Scalar(0, 0, 255), 3);
                }*/


                // Filtering the green zero
                Imgproc.GaussianBlur(frame, dstG, new Size(11, 11), 0); // make it blurry
                Mat blurredG = dstG;
                Imgproc.cvtColor(blurredG, hsvG, Imgproc.COLOR_BGR2HSV); // make it hsv color
                Core.inRange(hsvG, greenlower, greenupper, maskG); // zeroTracking (green)
                Imgproc.erode(maskG, erodeG, element); // erode
                Imgproc.dilate(erodeG, dilateG, element); // dilate

                Imgproc.findContours(dilateG, contoursG, hierachyG, Imgproc.RETR_CCOMP, Imgproc.CHAIN_APPROX_SIMPLE);
                // Iterator<MatOfPoint> it = contours.iterator();


                // testZeroGreen4
                if (hierachyG.size().height > 0 && hierachyG.size().width > 0) {
                    for (int i = 0; i >= 0; i = (int) hierachyG.get(0, i)[0]) {
                        Imgproc.drawContours(frame, contoursG, -1, new Scalar(250, 0, 0), 3);

                    }

                }

                imageDrawer.setImage(mat2Img(frame));
                imageDrawer.repaint();

            }
        }

    }

}

