import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringsIntroduction{
/*
There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

hello
java

9
No
Hello Java
 */
    public static String lexCompare(String strA, String strB, int len){

        // (int)charAt returns unicode of char
        for (int i = 0; i < len; i++){
            if ((int)strA.charAt(i) == (int)strB.charAt(i)){
                continue;
            }
            else if ((int)strA.charAt(i) < (int)strB.charAt(i)){
                return "No";
            }
            else{
                return "Yes";
            }
        }
        return "No";
    }
    // subString(bigin, end), end not include
    public static String capFirst(String oriStr){
        return oriStr.substring(0, 1).toUpperCase() + oriStr.substring(1);
    }
    public static void main(String[] argc) throws Exception{

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String a = buf.readLine();
        String b = buf.readLine();

        // OUTPUT 1
        int totalLength = a.length()+b.length();
        System.out.println(totalLength);
        // OUTPUT 2
        int minLength = Math.min(a.length(), b.length());
        System.out.println(lexCompare(a, b, minLength));
        // OUTPUT 3
        System.out.printf("%s %s", capFirst(a), capFirst(b));
    }
}