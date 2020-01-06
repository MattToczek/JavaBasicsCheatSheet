package readingTextAndErrorHandling;

public class RuntimeExceptions {

    int value = 7;
    String text;
    String[] texts = {"one", "two", "three"};


    public RuntimeExceptions() {

        //cannot divide by 0 but this will compile then cause a runtime exception:
        try{
            value = value/0;
        } catch(Exception e){               //catches all exceptions
            System.out.println(e.toString());
        }


        //cannot find length of an undefined String (NullPointerException):
        try{
            System.out.println(text.length());
        } catch(RuntimeException e){               //catches all runtime exceptions
            System.out.println(e.toString());
        }


        //cannot print something outside of array length (ArrayIndexOutOfBoundsException):
        try{
            System.out.println(texts[3]);
        } catch(ArrayIndexOutOfBoundsException e){   //catches specific exception
            System.out.println(e.toString());
        }


    }
}
