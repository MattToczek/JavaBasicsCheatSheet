package mechanics;

public class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("Starting camera...");
    }

    @Override
    public void operating() {
        System.out.println("Camera is functioning");
    }

    @Override
    public void turnOff() {
        System.out.println("Camera turning off.");
    }
}
