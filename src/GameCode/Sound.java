package GameCode;

import java.io.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	public static void gameOverSound() {
		try {
			File sound = new File("sounds//lough.wav");
			AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();

		} catch (Exception e) {
			// System.out.println(e.toString());
		}

	}

	public static void stickCrossSound() {
		try {
			File sound = new File("sounds//stickCross.wav");
			AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();

		} catch (Exception e) {
			// System.out.println(e.toString());
		}

	}

}
