import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Substring{
/*
Helloworld
3 7

lowo
*/

    public static void main(String[] argv) throws Exception{

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String string = buf.readLine();
        String[] strInfo = buf.readLine().split(" ");
        int start = Integer.parseInt(strInfo[0]);
        int stop = Integer.parseInt(strInfo[1]);
        System.out.println(string.substring(start, stop));
    }
}