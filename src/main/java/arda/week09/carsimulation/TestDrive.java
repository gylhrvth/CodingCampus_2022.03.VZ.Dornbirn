package arda.week09.carsimulation;

public class TestDrive {
    static final String GREEN = "\033[0;92m";
    static final String RED = "\033[1;31m";
    static final String RESET = "\033[0m";

    private enum CarState {
        IDLE,
        DRIVING,
        REFUELING,
        BROKEN_DOWN,
    }

    public static void main(String[] args) {

        Engine engine = new Engine(100);

        FuelTank bmwTank = new FuelTank(73, 73, Car.FuelSource.Diesel);
        FuelTank audiTank = new FuelTank(74, 68, Car.FuelSource.Diesel);
        FuelTank lexusTank = new FuelTank(60, 46, Car.FuelSource.Gasoline);
        Battery teslaBattery = new Battery(90, 65, Car.FuelSource.Electricity);
        FuelTank wayneIncTank = new FuelTank(100, 56, Car.FuelSource.Gasoline);

        Car bmw = new Car("BMW", "M50D", 400, bmwTank, 1950, engine);
        Car audi = new Car("AUDI", "A6", 326, audiTank, 1890, engine);
        Car lexus = new Car("LEXUS", "RS200", 200, lexusTank, 1360, engine);
        Car tesla = new Car("TESLA", "MODEL S", 1000, teslaBattery, 1340, engine);
        Aerodynamiccar batmobile = new Aerodynamiccar("[REDACTED]", "BATMOBILE", 2050, wayneIncTank, 1450, engine);
        Crappycar hotDogCar = new Crappycar("GIANT WIENER", "HOTDOG", 59, bmwTank, 3045, engine);

        //for (int i = 1; i < 10; i++) {
        simCarDrivin(batmobile, 3000);
        //}
    }

    public static void simCarDrivin(Car car, int distDestination) {
        //this method would actually be the person that drives.
        CarState currentState = CarState.IDLE;
        while (distDestination > 0) {
            switch (currentState) {
                case IDLE:
                    System.out.println("-------------------------------------------------");
                    System.out.println(car + GREEN + " is starting up." + RESET);
                    currentState = CarState.DRIVING;
                    break;
                case DRIVING:
                    while (distDestination > 0) {
                        int actualDriving = car.drive(distDestination);
                        distDestination -= actualDriving;
                        if (!car.isCarBrokenDown() && car.isOutOfFuel()) {
                            System.out.println("out of fuel");
                            currentState = CarState.REFUELING;
                            break;
                        } else if (car.isCarBrokenDown()) {
                            System.out.println("-------------------------------------------------");
                            System.out.println(RED + "[" + car + " has broken down]" + RESET);
                            currentState = CarState.BROKEN_DOWN;
                            break;
                        }
                    }
                    break;
                case BROKEN_DOWN:
                    car.replaceEngine(new Engine(85));
                    currentState = CarState.IDLE;
                    break;
                case REFUELING:
                    car.refuel();
                    currentState = CarState.DRIVING;
                    break;
            }
        }
    }
}
