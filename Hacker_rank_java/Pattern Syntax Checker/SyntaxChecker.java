import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class SyntaxChecker {
/*
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Valid
Invalid
Invalid
*/

    public static void main(String[] ar) throws Exception{

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(buf.readLine());

        for (int i = 0 ; i < n ; i++){

            String synTax = buf.readLine();

            try{
                Pattern p = Pattern.compile(synTax);
                System.out.println("Valid");
            }catch(Exception ex){
                System.out.println("Invalid");
            }
        }

    }
}
