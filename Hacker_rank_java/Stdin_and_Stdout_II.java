import java.io.*;
import java.util.*;
public class Stdin_and_Stdout_II {

    /*
    42
    3.1415
    Welcome to HackerRank's Java tutorials!

    String: Welcome to HackerRank's Java tutorials!
    Double: 3.1415
    Int: 42
     */
    public static void main(String[] argv){

        Scanner sc = new Scanner(System.in);
        
        // read the int token in that line
        int intVar = sc.nextInt();
        Double doublevar = sc.nextDouble();
        // in fact that the position stops at current line(result of nextDouble),
        // we need to use nextLine() ignore the leftover
        sc.nextLine();
        String strVar = sc.nextLine();

        System.out.println("String: "+strVar);
        System.out.println("Double: "+ doublevar);
        System.out.println("Int: "+ intVar);
        
    }
    
}
