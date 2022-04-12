import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest {
    
    public void play(){
        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successful got a sequencer");
        }
        catch(MidiUnavailableException ex){
            System.out.println("Bummer");
        }
    }
    public static void main(String[] ar){
        MusicTest mt = new MusicTest();
        mt.play();
    }
}
