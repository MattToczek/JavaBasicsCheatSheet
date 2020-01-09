package readingWritingAndErrorHandling;

import world.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

    public ReadObjects(String fileName){
        try (FileInputStream fi = new FileInputStream(fileName)){

            ObjectInputStream os = new ObjectInputStream(fi);

            // Values returned as Object class - have to be cast to Person class
            Person person1 = (Person)os.readObject();
            Person person2 = (Person)os.readObject();

            os.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            System.out.println(fileName + " not found - cannot read file.");
        }catch (IOException e) {
            System.out.println(fileName + " is not accessible - cannot read file.");
        } catch (ClassNotFoundException e) {
            System.out.println(fileName + " did not return expected class.");
        }

    }

}
