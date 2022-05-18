package cemil.week10.carSimulation;

import java.util.List;
import java.util.Vector;

public class CarSimulation {
    public static void main(String[] args) {
        List<Car> cars = new Vector<>();

        cars.add(new Car("Audi","A6",326,74));
        cars.add(new Car("BMW","M5",625,80));
        cars.add(new Car("Mercedes","E63 AMG",600,70));
        cars.add(new Car("Porsche","911 Turbo",680,74));
        System.out.println(cars);

    }


}
