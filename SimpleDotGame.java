import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SimpleDotGame{
        
    private ArrayList<String> locations;
    // take user's guess('1', '3') and check it, and return a result representing a 'hit', 'miss' or kill
    String check(String guess){

        String result = "miss";
        
        int index = locations.indexOf(guess);
        // if guess number is not in location list, is returns -1
        if (index >= 0){
            locations.remove(index);

            if (locations.isEmpty()){
                return "kill";
            }
            else{
                return "hit";
            }
        }
        else{
            return result;
        }
    }
    // setter, take int array which has three locaion as int
    void setLocations(ArrayList<String> loc){
        locations = loc;
    }
}
class GameHelper{
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0){
                return null;
            }
        }catch(IOException e){
            System.out.println("IOException: "+ e);
        }
        return inputLine;
    }
}
class SimpleDotGameDrive{
    
    public static void main(String[] argv){

        SimpleDotGame dot = new SimpleDotGame();
        GameHelper helper = new GameHelper();
        ArrayList<String> loc = new ArrayList<String>();
        int randNum = (int)(Math.random()*5);
        for (int i = 0; i < 3; i++){
            loc.add(String.valueOf(randNum+i));
        }
        dot.setLocations(loc);
        while(true){
            String guess = helper.getUserInput("Enter a number");
            String result = dot.check(guess);
            System.out.println(result);
            if (result =="kill"){
                System.out.println("Game is over");
                break;
            }
        }
    }
}