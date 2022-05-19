package cemil.week10.carSimulation;

import java.util.List;
import java.util.Vector;

public class CarSimulation {


    public static void main(String[] args) {
        List<Car> cars = new Vector<>();
        cars.add(new Car("Audi", "A6", 326, 2005, 73));
        cars.add(new Car("BMW", "M5", 625, 1978, 80));
        cars.add(new Car("Mercedes", "E63 AMG", 600, 2005, 70));
        cars.add(new Car("Porsche", "911 Turbo", 680, 1750, 74));
        cars.add(new Car("Simson", "M50", 14, 120, 10));

        int kmGoal = 1000;
        for (Car car : cars) {
            int k = kmGoal;
            while (k > 0) {
                int km = car.drive(k);
                k -= km;
//                System.out.println(car.getName() + " has driving " + (km - car.getTankCapacity()) + " km with " + car.getTankCapacity() + " l");

                if (k > 0) {
                    car.refill();
                }

            }
        }


    }
}





