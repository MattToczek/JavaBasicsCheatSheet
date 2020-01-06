package world;

public class Tree extends Plant implements LivingThing{
    //constructor
    public Tree () {

        // both work for public and protected (subclasses can access protected variables)
        System.out.println(this.name);
        System.out.println(this.id);

        //works as tree is in same package (world) as plant
        System.out.println(this.packageOnly);

        //private values only available in class.
        //System.out.println(this.secret);

    }

    @Override
    public String toString(){
        return "I am a Tree";
    }

    //method that overrides the plant grow method
    @Override
    public void grow() {
        System.out.println("Tree is growing!");
    }

    //method
    public void shedLeaves() {
        System.out.println("Leaves shedding!");
    }
}
