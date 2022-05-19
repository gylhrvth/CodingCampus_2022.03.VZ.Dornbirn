package zah.week09.carSimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainCar {
    public static void main(String[] args) {


        Car car = new Car("BMW", "420 Coupe", new Engine("M35", 180, 0), 60, 2000);
        // car.drive(1000);


        int kmGoal = 1000;

        while (kmGoal > 0) {
            int km = car.drive(kmGoal);
            kmGoal -= km;

            if (kmGoal > 0) {
                car.refill();
            }
        }
    }


}
