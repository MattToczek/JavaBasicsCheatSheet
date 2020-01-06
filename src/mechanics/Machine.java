package mechanics;

// if a class is defined as abstract, it means that is cannot be used in an instance - it's children will be what are used
public abstract class Machine {
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // abstract method forces all children to have this method
    public abstract void start();
    public abstract void operating();
    public abstract void turnOff();

    // can pass a method to child classes that calls abstract methods:
    public void run() {
        start();
        operating();
        turnOff();
    }

}
