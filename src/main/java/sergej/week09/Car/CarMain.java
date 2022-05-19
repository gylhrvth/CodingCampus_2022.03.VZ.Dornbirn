package sergej.week09.Car;

public class CarMain {

    public static void main(String[] args) {

        Engine engine1 = new Engine("V12",100);
        Engine engine2 = new Engine("V8",150);

        Fueltank tank1 = new Fueltank(60,engine1);
        Fueltank tank2 = new Fueltank(70,engine2);

        Car car1 = new Car("Audi","A6",engine1,tank1,1500);
        Car car2 = new Car("Porsche","Cayman",engine2,tank2,1200);

        car1.drive(1000);
        car2.drive(7000);
    }



}
