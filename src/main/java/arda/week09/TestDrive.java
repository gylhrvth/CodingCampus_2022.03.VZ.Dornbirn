package arda.week09;

public class TestDrive {
    static final String GREEN = "\033[0;92m";
    static final String RESET = "\033[0m";

    private enum CAR_STATE {
        IDLE,
        DRIVING,
        REFUELING,
        BROKEN_DOWN,
    }

    private static CAR_STATE currentState = CAR_STATE.IDLE;

    public static void main(String[] args) {
        Car bmw = new Car("BMW", "M50D", 400, 73, 50, Car.FuelSource.Diesel, 1950);
        Car audi = new Car("AUDI", "A6", 326, 74, 68, Car.FuelSource.Diesel, 1890);
        Car lexus = new Car("LEXUS", "RS200", 200, 60, 46, Car.FuelSource.Gasoline, 1360);
        Car tesla = new Car("TESLA", "S", 1000, 90, 50, Car.FuelSource.Electricity, 1040);


        simCarDrivin(lexus, 1000);
    }

    public static void simCarDrivin(Car car, int distDestination) {
        switch (currentState) {
            case IDLE:
                System.out.println(car + GREEN + " is starting. Motor is revving and the women are staring." + RESET);
                currentState = CAR_STATE.DRIVING;
            case DRIVING:
                while (distDestination > 0) {
                    int actualDriving = car.drive(distDestination);
                    distDestination -= actualDriving;
                    car.refuel();
                }
        }
    }
}
