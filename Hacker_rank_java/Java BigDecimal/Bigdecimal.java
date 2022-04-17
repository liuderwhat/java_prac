import java.util.*;
import java.math.BigDecimal;
import java.io.*;

public class Bigdecimal {


    public static void main(String[] ar) throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        // ArrayList<String> bigAL = new ArrayList<String>();
        int n = Integer.parseInt(buf.readLine());
        String[] s = new String[n+2];
        for (int i = 0 ; i < n ; i++){
            String input = buf.readLine();
            s[i] = input;
        }

        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                BigDecimal abig = new BigDecimal(a);
                BigDecimal bbig = new BigDecimal(b);
                return bbig.compareTo(abig);
            }
        };

        Arrays.sort(s, 0, n, customComparator);

        for (int i = 0; i < n ; i++){
            System.out.println(s[i]);
        }
    }

}
