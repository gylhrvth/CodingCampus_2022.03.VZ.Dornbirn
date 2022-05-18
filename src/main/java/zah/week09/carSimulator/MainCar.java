package zah.week09.carSimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainCar {
    public static void main(String[] args) {
        Vector<Car> cars = new Vector<>();
        cars.add(new Car("BMW","420 Coupe",150,60,1500));

        System.out.println(cars);



    }
}
