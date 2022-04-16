import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loop2 {
    /*
    2
    0 2 10
    5 3 5

    2 6 14 30 62 126 254 510 1022 2046
    8 14 26 50 98
        */

    public static void main(String[] ar){
        try{
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            String text = buf.readLine();
            int n = Integer.parseInt(text);
            for (int i = 0; i < n ; i++){

                String[] strArray =  buf.readLine().trim().split(" ");
                int[] intArray = new int[strArray.length];
                int sum = 0;
                for(int x=0; x<strArray.length; x++) {
                    intArray[x] = Integer.parseInt(strArray[x]);

                    int a = intArray[0];
                    int b = intArray[1];
                    int N = intArray[2];
                    // sn = a + b*2^j0 + b*2^j1...+b*2^jn
                    for (int j = 0; j < N; j++){
                        sum += b*Math.pow(2, j);
                        System.out.print((sum+a)+" ");
                    }
                }
                System.out.println();
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    } 
}
