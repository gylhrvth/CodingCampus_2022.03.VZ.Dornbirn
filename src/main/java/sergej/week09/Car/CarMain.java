package sergej.week09.Car;

public class CarMain {

    public static void main(String[] args) {
        Car car1 = new Car("Audi","A6",100,60,1500);
        Car car2 = new Car("Porsche","Cayman",150,70,1200);
        car1.drive(2000);
        car2.drive(7000);
    }



}
