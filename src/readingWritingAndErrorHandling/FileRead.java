package readingWritingAndErrorHandling;

import java.io.*;

public class FileRead {
    File file = new File("test.txt");

    // *** newer way of reading files - far fewer lines ***
    public void read1(){

        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            String line;

            //checks to see if next line exists and sout's in sequence
            while((line = br.readLine()) != null){
                System.out.println(line);
            };
        }catch (FileNotFoundException e) {
                System.out.println("File can't be found: " + file.toString());

        } catch (IOException e) {
            System.out.println("File can't be read: " + file.toString());
        }
    }


    // *** This is the older way of doing reading files ***
    public void read2() {
        BufferedReader br = null;

        try{
            // Reads file char by char
            FileReader fr = new FileReader(file);

            // adds chars together
            br = new BufferedReader(fr);

            String line;

            //checks to see if next line exists and sout's in sequence
            while((line = br.readLine()) != null){
                System.out.println(line);
            };

        }catch (FileNotFoundException e){
            System.out.println("file not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("unable to read file: "+ file.toString());;
        }


        try {
            br.close();
        } catch (IOException e) {
            System.out.println("Cannot close br where not opened");;
        } catch (NullPointerException e){
            //File was never opened (don't need to throw an error read)
        }
    }




}
