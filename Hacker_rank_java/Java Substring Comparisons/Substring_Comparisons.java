import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Substring_Comparisons {
/*
Complete the getSmallestAndLargest function in the editor below.
getSmallestAndLargest has the following parameters:
string s: a string
int k: the length of the substrings to find

welcometojava
3
ava
wel
 */
    public static String[] getSmallestAndLargest(String s, int k){
        // the substr is split by 3 char in one direction
        int numOfele = s.length()- k + 1 ;
        String[] subStringEle = new String[numOfele];

        // split substring 
        for (int i = 0; i < numOfele ; i++){
            subStringEle[i] = s.substring(i, i+k);
        }

        // because we sort substring just by lexicographically
        // so use  Arrays.sort without generic
        Arrays.sort(subStringEle);
        // return fisrt and last element of substring array
        String[] res = {subStringEle[0], subStringEle[numOfele-1]};
        return res;
    }
    public static void main(String[] argv) throws Exception{

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String string = buf.readLine();
        
        int lenOfSub = Integer.parseInt(buf.readLine());

        String[] res = getSmallestAndLargest(string, lenOfSub);

        System.out.printf("%s\n%s",res[0], res[1]);
    }
}
