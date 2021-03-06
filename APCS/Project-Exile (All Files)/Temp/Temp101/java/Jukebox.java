import com.almasb.fxgl.app.FXGL;
import com.almasb.fxgl.audio.AudioPlayer;
import com.almasb.fxgl.audio.Music;
import com.almasb.fxgl.audio.Sound;
import com.gluonhq.charm.down.plugins.audio.Audio;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

public class Jukebox {
	private static AudioPlayer player = FXGL.getAudioPlayer();
	private static String songTitle;
	private static Music song;
	public static void playBGM(String name, double volume) {
		if(name != "Real Villain.wav") {
			player.setGlobalMusicVolume(volume);
			song = player.loopBGM(name);
			player.playMusic(song);
		}
		else {
			songTitle = name;
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