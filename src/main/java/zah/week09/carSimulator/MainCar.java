package zah.week09.carSimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainCar {
    public static void main(String[] args) {


        Car car = new Car("BMW", "420 Coupe", new Engine("M35", 180, 0), new Tank(70), 2000);
        RepairStation rs = new RepairStation();
        // car.drive(1000);
       // driver(car);
        //changeEngine(rs, car);


        int kmGoal = 1000;

        while (kmGoal > 0) {
            int km = car.drive(kmGoal);
            kmGoal -= km;
            if (Tank.getTankContent == 0) {
                Tank.refill();
            }
            if (kmGoal >  0) {
                rs.repairCar(car);
            }
        }
    }

//    public static void driver(Car car) {
//        int kmGoal = 1000;
//        while (kmGoal > 0) {
//            int km = car.drive(kmGoal);
//            kmGoal -= km;
//            if (Tank.getTankContent == 0) {
//                Tank.refill();
//                break;
//            }
//        }
//    }
//
//    public static void changeEngine(RepairStation rs, Car car) {
//        int kmGoal = 10000;
//
//        while (kmGoal > 0) {
//            int km = car.drive(kmGoal);
//            kmGoal -= km;
//            if (kmGoal > kmGoal / 2) {
//                rs.repairCar(car);
//            }
//        }
//    }
}
