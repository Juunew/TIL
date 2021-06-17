package Prob03_0617;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    private int createCar;

    public Car createCar() {
        Car car = new Car();
        return car;
    }

    public static CarFactory getInstance() {
        if(instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }
}
