import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Anagrams {
// cal the char freq in string 
// if the all freq is same, print "Anagrams"
/*
anagramm
marganaa

not Anagrams
 */

    public static void main(String[] ar) throws Exception{

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String strOne = buf.readLine();
        String strTwo = buf.readLine();
        // create two hashmap viewed as dictionary
        HashMap<Character, Integer> dictOne = new HashMap<Character, Integer>();
        HashMap<Character, Integer> dictTwo = new HashMap<Character, Integer>();

        //if two string's length not the same , that is not Anagrams
        if (strOne.length() != strTwo.length()){
            System.out.println("Not Anagrams");
        }else{

            // culculate the freq for each string
            for (int i = 0; i < strOne.length(); i++){
                char curChar = Character.toLowerCase(strOne.charAt(i));
                if (!dictOne.containsKey(curChar)){
                    dictOne.put(curChar, 1);
                }
                else{
                    dictOne.put(curChar, dictOne.get(curChar)+1);
                }
            }

            for (int i = 0; i < strTwo.length(); i++){
                char curChar = Character.toLowerCase(strTwo.charAt(i));
                if (!dictTwo.containsKey(curChar)){
                    dictTwo.put(curChar, 1);
                }
                else{
                    dictTwo.put(curChar, dictTwo.get(curChar)+1);
                }
            }

            // if the size is not the same , it is not Anagrams
            if (dictOne.size() != dictTwo.size()){
                System.out.println("Not Anagrams");
            }else{

                // iterate it
                boolean flag = true;
                for (char c : dictOne.keySet()){
                    if (dictOne.get(c) != dictTwo.get(c)){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    System.out.println("Anagrams");
                }
                else{
                    System.out.println("Not Anagrams");
                }
            }
        }
    }
    /* 
    another solution: 
    int sum = 0;
    for (char c = 'a'; c <= 'z'; c++) {
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i) == c) {
                sum++;
            }
            if (b.charAt(i) == c) {
                sum--;
            }
        }
        if (sum != 0) {
            return false;
        }
    }
    */
}
