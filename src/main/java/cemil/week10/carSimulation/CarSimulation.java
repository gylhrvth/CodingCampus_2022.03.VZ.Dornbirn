package cemil.week10.carSimulation;

import java.util.ArrayList;
import java.util.List;


public class CarSimulation {


    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "A6",new Engine(3.0,326),  2005, 73));
        cars.add(new Car("BMW", "M5",new Engine(4.4,625), 1855, 80));
        cars.add(new Car("Mercedes", "E63 AMG",new Engine(4.0,612), 1840, 70));
        cars.add(new Car("Porsche", "911 Turbo s",new Engine(3.7,650), 1640, 74));
        cars.add(new Car("Simson", "M50",new Engine(0.5,14), 120, 10));

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
//                if (k > k/2){
//                    car.replaceEngine(2.0,256);
//
//                }

            }
        }


    }
}





