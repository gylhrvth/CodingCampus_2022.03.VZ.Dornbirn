package timo.week09.Car;

public class CarMain {
    public static void main(String[] args) {


        Car car1 = new Car("Mazda", "RX-8", 169, 55, 1379);

        int kmGoal = 1000;

        while (kmGoal > 0) {
            int km = car1.drive(kmGoal);
            kmGoal -= km;
            if (kmGoal > 0) {
                car1.refill();
            }
        }
        System.out.println("\u001B[32m" + "The " + car1 + " has reached the goal!" + "\u001B[0m");

    }
}
