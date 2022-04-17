import java.io.*;
import java.util.*;

public class if_else {
    /*
    If  is odd, print Weird
    If  is even and in the inclusive range of  to , print Not Weird
    If  is even and in the inclusive range of  to , print Weird
    If  is even and greater than , print Not Weird
    */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int myInput = sc.nextInt();
        
        if (myInput % 2 > 0){
            System.out.println("Weird");
        }
        else{
            if (myInput>=2 && myInput<=5){
                System.out.println("Not Weird");
            }
            else if (myInput>=6 && myInput<=20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }
    }
}
