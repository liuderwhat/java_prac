import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tokens {
/*
He is a very very good boy, isn't he?

10
He
is
a
very
very
good
boy
isn
t
he
*/
    public static void main(String[] ar) throws Exception{

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String input = buf.readLine();
        // String[] names = input.split("[\\s!,?._'@]");
        // int counter = 0;
        // for (String s: names){
        //     if (s.trim().length() == 0){
        //         counter++;
        //     }
        // }
        // System.out.println(names.length-counter);
        // for (String s : names){
        //     if (s.trim().length() != 0){
        //         System.out.println(s);
        //     }
        // }
        
        // X+ : X, one or more times
        // https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
        String[] names = input.split("[!,?._'@\\s]+");
        System.out.println(names.length);
        for (String ele:names){
            System.out.println(ele);
        }

    }
}
