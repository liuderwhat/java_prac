import java.util.*;
import java.io.*;

public class JukeBox {
    
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] argv){
        new JukeBox().go();
    }
    class ArtistCompare implements Comparator<Song>{
        public int compare(Song one, Song two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }
    public void go(){
        getSong();
        System.out.println(songList);
        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);
        System.out.println(songList);

    }

    void getSong(){
        try{
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine()) != null){
                addSong(line);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse){
        String[] token = lineToParse.split("/");
        Song nextSong = new Song(token[0], token[1], token[2], token[3]);
        songList.add(nextSong);
    }
}

class Song{

    String title;
    String artist;
    String rating;
    String bpm;

    // public int compareTo(Song s){
    //     return title.compareTo(s.getTitle());
    // }
    Song(String t, String a, String r, String b){
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    // getter
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getRating(){
        return rating;
    }
    public String getBpm(){
        return bpm;
    }
    // the method of Object class
    // so if we print the object, it will be called
    public String toString(){
        return title;
    }

}
