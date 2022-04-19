import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringReverse {

    public static boolean isPalindrome(String intStr){

        for (int i = 0 ; i < (int)intStr.length()/2 ; i++){
            if (intStr.charAt(i) != intStr.charAt(intStr.length()-1-i)){
               return false;
            }
            
        }
        return true;
    }
// check string is palindrome or not
    public static void main(String[] argv) throws Exception{

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String input = buf.readLine();

        if (isPalindrome(input)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
       
    }
    
}
