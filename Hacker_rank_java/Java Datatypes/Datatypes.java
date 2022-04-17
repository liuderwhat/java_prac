import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Datatypes {

    public static void main(String[] afr){
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try{
            // num of input
            int n = Integer.parseInt(buf.readLine());
            // int of input
            int num = 0;
            // str of input
            String num_str = null;
            for (int i = 0; i < n ; i++){
                // if input size is larger than int
                try{
                    num_str = buf.readLine();
                    num = Integer.parseInt(num_str);
                    //  byte
                    if (num >=  -(Math.pow(2, 7)) && num <=  Math.pow(2, 7)-1){
                        System.out.printf("%s can be fitted in:\n* byte\n* short\n* int\n* long\n", num_str);
                    }
                    // short
                    else if (num >=  -(Math.pow(2, 15)) && num <=  Math.pow(2, 15)-1){
                        System.out.printf("%s can be fitted in:\n* short\n* int\n* long\n", num_str);
                    }
                    // int
                    else if (num >=  -(Math.pow(2, 31)) && num <= Math.pow(2, 31)-1){
                        // System.out.println(num);
                        System.out.printf("%s can be fitted in:\n* int\n* long\n", num_str);
                    }
                }catch(NumberFormatException ne){
                    // check num is whether larger than long
                    try{
                        long num_l = Long.parseLong(num_str);
                        System.out.printf("%s can be fitted in:\n* long\n", num_str);
                    }catch(NumberFormatException ne2){
                        System.out.printf("%s can't be fitted anywhere.\n", num_str);
                    }

                }
                
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }

}
