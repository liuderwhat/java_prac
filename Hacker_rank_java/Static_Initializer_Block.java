import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Static_Initializer_Block {
    static int w = 0;
    static int h = 0;
    static{
        try{
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            w = Integer.parseInt(buf.readLine());
            h = Integer.parseInt(buf.readLine());
            if(w <= 0 || h <= 0 || w*h <= 0){
                throw new Exception("Breadth and height must be positive");
            }
            System.out.println(w*h);
        }catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] ar){
            
    }
}
