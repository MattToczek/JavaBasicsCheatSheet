package InnerClasses;

public class Robot {
    private int id;

    //declaring a nested class within Robot class
    private class Brain {
        public void think () {
            //inner-class can access private data from outer-class
            System.out.println("Robot " + id + " is thinking...");
        }
    }

    // static inner classes used to create objects that need to be grouped with the outer class but accessed outside
    public static class Battery {
        public void charge() {
            System.out.println("Battery charging...");
        }
    }

    public Robot(int id){
        this.id = id;
    }

    public void start() {
        System.out.println("Robot started, id: " + id);

        //Inner classes are almost always initialised within a method of the class that they are in:
        Brain brain = new Brain();
        brain.think();
    }
}
