package mechanics;

public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Starting car...");
    }

    @Override
    public void operating() {
        System.out.println("Car is functioning");
    }

    @Override
    public void turnOff() {
        System.out.println("Car turning off.");
    }
}
