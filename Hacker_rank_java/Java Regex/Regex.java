import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Regex {


    public static void main(String[] ar) throws Exception{

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String regex = "[01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5][01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]";

        Pattern pattern = Pattern.compile(regex);

        while(true){
            
            String testIP = buf.readLine();

            if (testIP == null){
                break;
            }
            else{
                if (pattern.matcher(testIP).matches()){
                    System.out.println(true);
                }
                else{
                    System.out.println(false);
                }
            }
        }
    }
    
}
