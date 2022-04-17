import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Biginteger {
    

    public static void main(String[] ar) throws Exception{

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        BigInteger operand1 = new BigInteger(buf.readLine());

        BigInteger operand2 = new BigInteger(buf.readLine());

        System.out.println(operand1.add(operand2));

        System.out.println(operand1.multiply(operand2));


    }
}
