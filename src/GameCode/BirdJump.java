package GameCode;

public class BirdJump extends Thread {

	private GameBoard board;
	private Bird bird;

	public BirdJump(GameBoard board, Bird bird) {
		this.board = board;
		this.bird = bird;
	}

	public void run() {
		while (true) {
			bird.setY(bird.getY() + 1);

			if (bird.getY() >= 490) {
				bird.setIsAlive(false);
			}
			try {
				Thread.sleep(10);

			} catch (Exception e) {
			}

			board.repaint();
		}

	}

}
