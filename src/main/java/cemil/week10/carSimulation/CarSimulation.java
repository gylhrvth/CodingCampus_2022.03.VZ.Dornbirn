package cemil.week10.carSimulation;

import java.util.List;
import java.util.Vector;

public class CarSimulation {
    public static void main(String[] args) {
        List<Car> cars = new Vector<>();

        Car car1 = new Car("Audi", "A6", 326, 2005 , 73);
        Car car2 = new Car("BMW", "M5", 625, 1978, 80);
        Car car3 = new Car("Mercedes", "E63 AMG", 600, 2005, 70);
        Car car4 = new Car("Porsche", "911 Turbo", 680, 1750, 74);



        int kmGoal = 1000;




        while (kmGoal > 0) {
            int km = car1.drive(kmGoal);
            kmGoal -= km;
            System.out.println(km);
            if (kmGoal > 0) {
                car1.refill();
            }

        }


    }


}
