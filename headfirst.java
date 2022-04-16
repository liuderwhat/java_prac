import java.io.*;

public class headfirst {

    public static void main(String[] ar){
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try{
            int num = Integer.parseInt(buf.readLine());
            System.out.println("Good job");
        }catch(Exception ex){
            System.out.println("Wrong answer");
        }

    }
}
