package readingWritingAndErrorHandling;
import world.Person;
import java.io.*;

public class WriteObjects {

    Person matt = new Person(29, "Matt");
    Person hamad = new Person(19, "Hamad");
    private String fileName = "people.bin";

    public WriteObjects() {

        // writes binary file to working directory (creates people.bin) and catches exceptions
        try(FileOutputStream fs = new FileOutputStream(fileName)){

            // takes objects to be converted to binary file
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(matt);
            os.writeObject(hamad);

            //closed manually to avoid nested try catch
            os.close();

        }catch (FileNotFoundException e){
            System.out.println("Cannot find file " + " to write to.");
            e.printStackTrace();
        }catch (IOException e ){
            System.out.println("Cannot access file " + " to write to.");
            e.printStackTrace();
        }
    }
}
