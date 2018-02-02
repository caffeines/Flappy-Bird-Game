package GameCode;

import java.awt.*;
import java.util.Random;

public class StickMover extends Thread {

	private GameBoard board;
	private Stick stick;
	private Bird bird;

	public StickMover(GameBoard board, Stick stick, Bird bird) {

		this.board = board;
		this.stick = stick;
		this.bird = bird;

	}

	public void run() {
		Random r = new Random();

		while (bird.getIsAlive() == true) {
			stick.setX(stick.getX() - 5);
			CheckCollision();
			if (stick.getX() < -10) {
				int temp = r.nextInt(50);
				stick.setX(900 + temp);
				GameBoard.score++;
				Sound.stickCrossSound();

			}
			try {
				Thread.sleep(10);
			} catch (Exception e) {

			}
			board.repaint();
		}
	}

	private void CheckCollision() {

		Rectangle birdRect = new Rectangle(bird.getX(), bird.getY(), 15, 40);

		for (int i = 0; i < 10; i++) {
			Rectangle stickRect = new Rectangle(stick.getX(), stick.getY(), 11, 200);

			if (birdRect.intersects(stickRect) == true) {
				Sound.gameOverSound();
				GameBoard.score++;
				bird.setIsAlive(false);
				bird.setX(-500);
				stick.setX(5000);

			}

		}

	}
}