import mechanics.Camera;
import mechanics.Car;
import readingTextAndErrorHandling.TextReader;
import readingTextAndErrorHandling.TryCatchWithFileReader;
import world.Plant;
import world.Tree;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class App {

    // =========================
    // ==== TYPES OF VALUES ====
    // =========================

    /*
    - private --- only within same class
    - public --- from anywhere
    - protected --- same class, subclasses and same package
    - no modifier --- same package only
     */

    public static void main(String[] args) throws FileNotFoundException {

        Plant plant = new Plant();
        Tree tree = new Tree();

        //works as name string is public
        System.out.println(plant.name);

        //doesn't work as id is protected
        //System.out.println(plant.id);

        //doesn't work as id is private
        //System.out.println(plant.secret);

        //doesn't work as packageOnly is only available to world package
        //System.out.println(plant.packageOnly);

        // =========================
        // ===== POLYMORPHISM ======
        // =========================

        //can declare plant2 as a reference to plant or tree (same parent class) - ** polymorphism **
        //Plant plant2 = plant;
        Plant plant2 = tree;

        tree.grow();
        tree.shedLeaves();

        //doesn't work, as plant2 is declared as Plant class (though it points to tree instance)
        //plant2.shedLeaves();

        //works, as tree has grow method "Tree is growing!"
        doGrow(tree);

        //works, as plant has grow method "Plant is growing!"
        doGrow(plant);

        // =========================
        // === USING ARRAY LISTS ===
        // =========================

        //using simple Strings
        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("I'm a");
        list.add("list of strings");

        showList(list);


        //using a returned string from plant object
        ArrayList<Plant> plantList = new ArrayList<>();

        plantList.add(new Plant());
        plantList.add(new Plant());

        //showPlantList method returns string from Plant Obj
        showPlantList(plantList);

        //using wild card "?" and "extends CLASS_NAME"
        showPlantAndChildrenList(plantList);


        //arrays with child and parent classes
        ArrayList<Plant> plantList2 = new ArrayList<>();

        plantList2.add(new Tree());
        plantList2.add(new Plant());

        //showPlantList method returns string from Plant Obj
        showPlantList(plantList2);

        //works using wild card "?" and "extends CLASS_NAME"
        showPlantAndChildrenList(plantList2);

        // =========================
        // === ANONYMOUS CLASSES ===
        // =========================

        // OFTEN USED FOR GUI EVENTS

        //Can use anonymous classes to override a method in class in this instance
        Plant nonGrowingPlant = new Plant(){
            @Override
            public void grow() {
                System.out.println("This plant doesn't grow");
            }
        };

        nonGrowingPlant.grow();

        // overriding an interface
        Tree deadTree = new Tree() {
            @Override
            public void lives() {
                System.out.println("I am dead...");
            }
        };

        deadTree.lives();

        // =========================
        // ===== READING TEXT ======
        // =========================

        //can be used to find file path
        //Path p = Paths.get("TextFile.txt");
        //Path folder = p.getParent();

        String fileName = "/Users/codenation/Documents/Java/JavaBasics/out/production/JavaBasics/TextFile.txt";


        TextReader readFile = new TextReader();

        readFile.reader(fileName);

        //try/catch
        TryCatchWithFileReader tryCatch = new TryCatchWithFileReader();

        // =========================
        // === ABSTRACT CLASSES ====
        // =========================

        // similar to interfaces but tend to be used for specifics that only child elements will do:
        // eg: all machines start but something like "show data" could be applied easily to non-machines
        // too so this would use an interface usually.

        Camera cam1 = new Camera();
        cam1.setId(5);

        cam1.run();

        Car car1 = new Car();
        car1.setId(4);

        car1.start();

        // =========================
        // ==== CASTING VALUES =====
        // =========================

        //Upcasting
        //works, as plant2 has grow method but from Tree subclass --- "Tree is growing!"
        doGrow(plant2);

        //Downcasting
        //declaring new plant with ref. to tree variable
        Plant plant3 = tree;

        // won't work as it needs type that you are casting to
        //Tree tree2 = plant3;

        // works once type is defined:
        Tree tree2 = (Tree)plant3;
        tree2.shedLeaves();

        //below give runtime error, as cannot change a tree to a plant
        Plant plant4 = new Plant();
        //Tree tree3 = (Tree)plant4;
        //tree3.grow();




        // Casting primitive values
        byte byteVal;
        float floatVal = 123.7f;
        long longVal = 29838;
        int intVal;
        int int2 = 128;

        //doesn't work
        //intVal = longVal;

        // works, as this long value can fit in int
        intVal = (int)longVal;

        // works, but DOESN'T ROUND VALUE --- 123 = returned val
        intVal = (int)floatVal;

        // **** returns -128 --- may byte value is 127 so the value wraps back to minimum byte value (-128)
        byteVal= (byte)int2;

    }

    public static void doGrow(Plant instance) {
        instance.grow();
    }

    public static void showList(ArrayList<String> list) {
        for(String e: list){
            System.out.println(e);
        }
    }

    public static void showPlantList(ArrayList<Plant> list) {
        for(Plant e: list){
            System.out.println(e);
            //can call Plant methods but can't call Tree methods
            e.grow();
        }
    }

    public static void showPlantAndChildrenList(ArrayList<? extends Plant> list) {
        for (Plant e : list) {
            System.out.println(e);
            //can call Plant methods but can't call Tree methods
            e.grow();
        }
    }

}
