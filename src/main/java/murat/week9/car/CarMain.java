package murat.week9.car;

public class CarMain {

    public static void main(String[] args) {

        Car car1 = new Car("Mazda", "Demio", Car.DrivingType.GASOLINE, 30.0f, new Tank(50.0f), new Engine(108));
        Car car2 = new Car("Volkswagen", "Golf", Car.DrivingType.ELECTRICITY, 30.0f, new Tank(60.0f), new Engine(110));


        car1.driveToTarget(200);
        car2.driveToTarget(100);
        Engine.possibilityOfADefectedEngine(2);

    }
}
