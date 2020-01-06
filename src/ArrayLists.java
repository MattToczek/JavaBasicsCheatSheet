import java.util.ArrayList;
import java.util.HashMap;

public class ArrayLists {
    public ArrayLists() {

        //single argument:
        ArrayList<String> strings = new ArrayList<>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);
        System.out.println(animal);


        //multiple arguments:

        HashMap<Integer, String> map = new HashMap<>();

        // can use any objects (not just Integers or Strings) including objects that you create
    }
}
