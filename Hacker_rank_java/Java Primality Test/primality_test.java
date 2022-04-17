import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class primality_test {
    
    public static void main(String[] ar) throws Exception{

        
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger bi= new BigInteger(buf.readLine());
        // int n = Integer.parseInt(buf.readLine());
        boolean result = bi.isProbablePrime(1);
        if (result){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

        buf.close();
    }

}
