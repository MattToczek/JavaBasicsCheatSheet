package readingWritingTextAndErrorHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader {
                                    //this is to throw an error if string isn't found
    public void reader(String string) throws FileNotFoundException {

        //defines file as a file
        File textFile = new File(string);

        // creates new Scanner instance
        Scanner in = new Scanner(textFile);

        //reads 3 from top of TextFile.txt
        int value = in.nextInt();
        System.out.println("Read value: " + value);

        //makes it go past new line from nextInt()
        in.nextLine();

        //Loops through data until there is no next line
        while(in.hasNextLine()){
            String line = in.nextLine();

            System.out.println(line);
        }

        in.close();

        //return in.toString();


    }
}
