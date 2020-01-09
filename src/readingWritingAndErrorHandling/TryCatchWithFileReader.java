package readingWritingAndErrorHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchWithFileReader {
    public TryCatchWithFileReader() {
        File file = new File("test.txt");

        try {
            FileReader fr = new FileReader(file);
            //this will not run, if an exception is thrown:
            System.out.println("--- file found! ---");

        } catch (FileNotFoundException e) {
            // This prints stack trace on error finding file:
            //e.printStackTrace();

            //This is a custom error read:
            System.out.println("File not found: " + file.toString());
        }

        /*

         - can do a multi-catch, if the program is likely to throw one of many exceptions:

        try {
            function();/method();
        } catch (exception1 | exception2) {
            error read goes here
        }

        OR

        - for this one, if the
       try {
            function();/method();
        } catch (exception1) {
            error read goes here
        } catch (exception2) {
            error read goes here
        }


         - can catch any kind of exception using parents class of all exceptions => "Exception":

        try {
            function();/method();
        } catch (Exception e) {
            error read goes here
        }

        */
    }
}
