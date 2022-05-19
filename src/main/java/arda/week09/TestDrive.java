package arda.week09;

public class TestDrive {
    static final String GREEN = "\033[0;92m";
    static final String RED = "\033[1;31m";
    static final String RESET = "\033[0m";

    private enum CAR_STATE {
        IDLE,
        DRIVING,
        REFUELING,
        BROKEN_DOWN,
    }

    private static CAR_STATE currentState = CAR_STATE.IDLE;

    public static void main(String[] args) {

        Engine engine = new Engine(100);

        Tank bmwTank = new Tank(73, 50, Car.FuelSource.Diesel);
        Tank audiTank = new Tank(74, 68, Car.FuelSource.Diesel);
        Tank lexusTank = new Tank(60, 46, Car.FuelSource.Gasoline);

        Car bmw = new Car("BMW", "M50D", 400, bmwTank, 1950, engine);
        Car audi = new Car("AUDI", "A6", 326, audiTank, 1890, engine);
        Car lexus = new Car("LEXUS", "RS200", 200, lexusTank, 1360, engine);

        for (int i = 1; i < 5; i++) {
            simCarDrivin(bmw, 2000);
        }
    }

    public static void simCarDrivin(Car car, int distDestination) {
        switch (currentState) {
            case IDLE:
                System.out.println("-------------------------------------------------");
                System.out.println(car + GREEN + " is starting." + RESET);
                currentState = CAR_STATE.DRIVING;
                break;
            case DRIVING:
                while (distDestination > 0) {
                    int actualDriving = car.drive(distDestination);
                    distDestination -= actualDriving;
                    if (!car.isCarBrokenDown()) {
                        car.refuel();
                    } else {
                        System.out.println("-------------------------------------------------");
                        System.out.println(RED + "[" + car + " has broken down]" + RESET);
                        currentState = CAR_STATE.BROKEN_DOWN;
                        break;
                    }
                }
                break;
            case BROKEN_DOWN:
                car.replaceEngine(new Engine(85));
                System.out.println("-------------------------------------------------");
                System.out.println(GREEN + "[The engine of " + car + " has been replaced!]" + RESET);
                currentState = CAR_STATE.IDLE;
                break;
        }
    }
}
