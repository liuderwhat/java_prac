  
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
12324.134

US: 12,324.13
India: Rs.12,324.13
China:12,324.13
France: 12 324,13
*/

public class currency_formatter {

    public static String formatter(Locale country, double payment){
        // Get the currency instance
        NumberFormat nF = NumberFormat.getCurrencyInstance(country);
        // Stores the values    
        String values = nF.format(payment);

        return values;
    }
    
    public static void main(String[] args)throws Exception{
        
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        double payment = Double.parseDouble(buf.readLine());

        // Prints the currency
        System.out.printf("US: %s\n", formatter(Locale.US, payment));
        System.out.printf("India: %s\n", formatter(new Locale("en","In"), payment));
        System.out.printf("China: %s\n", formatter(Locale.CHINA, payment));
        System.out.printf("France: %s\n", formatter(Locale.FRANCE, payment));
    }
}