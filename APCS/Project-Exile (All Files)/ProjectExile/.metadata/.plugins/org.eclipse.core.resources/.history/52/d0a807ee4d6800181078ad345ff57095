import java.util.concurrent.TimeUnit;

import com.almasb.fxgl.app.FXGL;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.audio.AudioPlayer;
import com.almasb.fxgl.audio.Music;
import com.almasb.fxgl.settings.GameSettings;

public class Jukebox extends GameApplication {
	private static AudioPlayer player = FXGL.getAudioPlayer();
	private static Music song;
	public static void playBGM(String name, double volume) {
		if(name != "Real Villain.wav") {
			player.setGlobalMusicVolume(volume);
			song = player.loopBGM(name);
			player.playMusic(name);
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
			player.playMusic("Real Villain.wav");
		}
	}
	public static void stopBGM() {
			player.stopMusic(song);
	}
	@Override
	protected void initSettings(GameSettings settings) {	}
}