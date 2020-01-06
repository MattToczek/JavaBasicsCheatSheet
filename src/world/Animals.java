package world;

// enum works like a class but takes comma separated values
public enum Animals {
    CAT("Catty"), DOG("Doggy"), MOUSE ("Mousey"), BIRD("Frank");

    private String name;

    Animals(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
