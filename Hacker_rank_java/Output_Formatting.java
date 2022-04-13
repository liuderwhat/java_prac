import java.io.*;
import java.util.*;

public class Output_Formatting {
    
/*
java 100
cpp 65
python 50
*/
/*
================================
java           100 
cpp            065 
python         050 
================================
 */
    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        String ele = null;
        boolean flag = true;
        while(flag){
            try{
                ele=sc.nextLine();
                if(ele.length()<=0){
                    flag = false;
                    break;
                }
                String[] input = ele.split(" ");
                if(input[1].length() == 2){
                    System.out.printf( "%-15s0%s%n", input[0], input[1]);
                }
                else if (input[1].length() == 1){
                    System.out.printf( "%-15s00%s%n", input[0], input[1]);
                }
                else{
                    System.out.printf( "%-15s%s%n", input[0], input[1]);
                }
            }catch(NoSuchElementException ex){
                flag = false;
                break;
            }
        }
        System.out.println("================================");
        sc.close();
    }
}
