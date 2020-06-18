import com.almasb.fxgl.app.FXGL;
import com.almasb.fxgl.audio.AudioPlayer;
import com.almasb.fxgl.audio.Music;
import java.util.concurrent.TimeUnit;


public class Jukebox {
	private static AudioPlayer player = FXGL.getAudioPlayer();
	private static Music song;
	public static void playBGM(String name, double volume) {
		if(name != "Real Villain.wav") {
			player.setGlobalMusicVolume(volume);
			song = player.loopBGM(name);
			player.playMusic(song);
		}
		else {
			player.setGlobalMusicVolume(volume);
			player.setGlobalSoundVolume(volume);
			player.playSound("Tension.wav");
			TimeUnit u = TimeUnit.MILLISECONDS;
			try {
				u.sleep(48009);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			song = player.loopBGM("Real Villain.wav");
			player.loopBGM("Real Villain.wav");
		}
	}
	public static void stopBGM() {
		player.stopMusic(song);
	}
}