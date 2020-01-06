package world;

import javax.xml.namespace.QName;

public class Plant implements LivingThing{
    //usually public is only used for final values (constants)
    public String name;
    protected int id;
    private int secret;
    int packageOnly;

    // constructor
    public Plant(){
        this.name = "Freddy";
        this.id = 1;
        this.secret = 2;
        this.packageOnly = 3;
    }

    @Override
    public String toString(){
        return "I am a plant";
    }

    //method
    public void grow() {
        System.out.println("plant growing!");
    }

    // =========================
    // ===== ENCAPSULATION =====
    // =========================

    //method --- getter for name
    public String getName() {
        return name;
    }

    //method --- setter for name
    public void setName(String name) {
        this.name = name;
    }

    //method --- private to restrict to class
    private int calcGrowthForecast(){
        //would be a calculation using private values in class
        return 9;
    }

    //method --- getter for data
    public String getData() {
        String data = "some info " + calcGrowthForecast();

        return data;
    }

    @Override
    public void lives() {
        System.out.println("I'm alive!");
    }


}
