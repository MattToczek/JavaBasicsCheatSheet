package readingWritingTextAndErrorHandling;

import java.io.*;

public class FileWrite {

    File file = new File("test1.txt");

    public void write(){

        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){

            br.write("This is line 1");
            br.newLine();
            br.write("This is line 2");
            br.newLine();
            br.write("This is the last line");

        } catch (IOException e) {
            System.out.println("File can't be read: " + file.toString());
        }
    }

}
