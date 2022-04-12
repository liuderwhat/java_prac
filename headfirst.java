import java.io.*;

public class headfirst {

    public static void main(String[] ar){

        try{
            FileWriter w = new FileWriter("Foo.txt");
            w.write("hello");
            w.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }   
    }

}
