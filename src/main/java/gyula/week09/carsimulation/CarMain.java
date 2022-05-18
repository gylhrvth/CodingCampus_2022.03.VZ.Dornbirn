package gyula.week09.carsimulation;

public class CarMain {
    public static void main(String[] args) {
        Car c = new Car("Cemil", "BMW M5", 460, 1900, 40.5f, 60f, Car.EPowerSource.PETROL);

        int kmGoal = 1000;

        while (kmGoal > 0) {
            int km = c.drive(kmGoal);
            kmGoal -= km;
            System.out.println("We've driven " + km + " km.");
            if (kmGoal > 0){
                c.refill();
            }
        }
    }
}
