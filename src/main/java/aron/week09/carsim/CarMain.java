package aron.week09.carsim;

public class CarMain {

    public static void main(String[] args) {


        Car car1 = new Car("Mazda", "MX-5 RF", 97, 50, "Benzin", 1005);
        System.out.println(car1);
        System.out.println();
        int travelToDistance = 1000;
        while (travelToDistance > 0){
            int drivenDistance = car1.drive(travelToDistance);
            System.out.println(car1 + " has driven " + drivenDistance + " km.");
            travelToDistance -= drivenDistance;
            if (travelToDistance > 0){
                car1.refill();
            }
        }

    }
}
