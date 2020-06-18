import java.util.concurrent.TimeUnit;
import com.almasb.fxgl.app.FXGL;

public class Conversation 
{

    private TimeUnit u = TimeUnit.MILLISECONDS;
    private long time = 60;
    //private Jukebox n = new Jukebox();
    
    public void printTXT(String t)
    {


        for(char ch:t.toCharArray())
        {
            FXGL.getAudioPlayer().setGlobalSoundVolume(0.025);
            FXGL.getAudioPlayer().playSound("text_sound_8.wav");
            System.out.print(ch);
            try
            {
                u.sleep(time);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}