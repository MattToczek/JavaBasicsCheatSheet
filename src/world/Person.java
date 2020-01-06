package world;

import java.util.Objects;

public class Person {

    private int age;
    private String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    //right click class and generate > equals() & hashCode() -- this produces override to compare by attributes of class
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
