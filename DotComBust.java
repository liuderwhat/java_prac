import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DotComBust {
    
    int numOfGuesses;
    // user's input and set dotcom's position
    GameHelper helper = new GameHelper();
    // arraylist that save dotcom we have
    ArrayList<DotCom> dotComList = new ArrayList<DotCom>();

    
    void setUpGame(){
        DotCom one = new DotCom();
        one.setName("A.com");
        dotComList.add(one);
        
        for(DotCom dotComLoc : dotComList){
            ArrayList<String> loc = helper.placeDotCom(3);
            dotComLoc.setLocations(loc);
        }
    }
    void startPlaying(){
        while(!dotComList.isEmpty()){
            String guess = helper.getUserInput("Enter a guess");
            check(guess);
        }
    }

    void check(String guess){
        numOfGuesses++;
        String result = "miss";

        for (int x = 0 ; x < dotComList.size() ; x++){
            result = dotComList.get(x).checkYourself(guess);

            if (result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
                dotComList.remove(x);
                break;
            }
        }

        System.out.println(result);
    }

    void finishGame(){
        System.out.println("88888");
    }
    public static void main(String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
        game.finishGame();
    }
}

// set dotcom's name and location
class DotCom{
    String name;
    ArrayList<String> locationCell;
    void setName(String dotName){
        name = dotName;
    }

    void setLocations(ArrayList<String> loc){
        locationCell = loc;
    }

    String checkYourself(String userInput){
        String result = "miss";
        int index = locationCell.indexOf(userInput);

        if (index >=0){
            locationCell.remove(index);

            if (locationCell.isEmpty()){
                result = "kill";
            }
            else{
                result = "hit";
            }
        }
        return result;
    }
}

class GameHelper{
    String alpha = "abcdefg";
    int gridLength = 7;
    int gridSize = 49;
    int[] grid = new int[gridSize];
    // number of com that is processed
    int comCounts = 0;
    
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
    // place dotcom position with a one-dims array
    public ArrayList<String> placeDotCom(int comSize){
        // 
        ArrayList<String> alphaCell = new ArrayList<String>();

        String temp = null;
        // save dotcom digit info
        int[] coords = new int[comSize];
        // current examined string
        int attempt = 0;
        // the location is avaiable or not
        boolean success = false;
        // start point
        int location = 0;
        
        comCounts++;
        // increace on row
        int incr = 1;
        // if it is the odd dotcom, it were the horizental region
        if ((comCounts % 2) == 1){
            incr = gridLength;
        }
        // find the aviable position for dotcom until successing
        while( !success && attempt++ < 200){
            location = (int)(Math.random() * gridSize);
            
            // the n-th position
            int x = 0;
            success = true;

            // search position
            while (success && x < comSize){
                // this cell is available
                if (grid[location] == 0){
                    // after assigning, x will increace 1
                    coords[x++] = location;
                    location += incr;
                    if (location >= gridSize){
                        success = false;
                    }
                    // the position is exceed the right
                    if(x > 0 && (location % gridLength)==0){
                        success = false;
                    }
                }
                else{
                    success = false;
                }
            }
        }
        // concate alphabet and digit

        // number of dotcom's cell
        int x = 0;
        // digital part
        int row = 0;
        // char part
        int col = 0;

        while(x < comSize){
            grid[coords[x]]=1;

            row = (int)(coords[x]/gridLength);
            // find the respectly char with col
            col = coords[x] % gridLength;
            temp = String.valueOf(alpha.charAt(col));

            alphaCell.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCell;
    }
}
