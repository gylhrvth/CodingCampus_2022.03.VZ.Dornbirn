package murat.week9.car;

public class CarMain {

    public static void main(String[] args) {

        Car car1 = new Car("Mazda", "Demio", 108, 50.0f, 100.0f);
        Car car2 = new Car("Volkswagen", "Golf", 120, 60.0f, 30.0f);

        //car1.driveToTarget(113);
        car2.driveToTarget(150);

    }
}
