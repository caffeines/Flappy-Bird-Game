package GameCode;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GameBoard extends JPanel implements KeyListener {

	private static final long serialVersionUID = 1L;
	Bird bird;
	Stick[] stick = new Stick[10];
	int counter = 0;
	public static int score = 0;

	// enum-special data type that enables for a variable to be a set of
	// predefined constants.
	// In State pattern a class behavior changes based on its state.

	public static enum STATE {
		Menu, Game
	};

	public static STATE state = STATE.Menu;

	public GameBoard() {
		super();
		super.addKeyListener(this);
		super.setFocusable(true);
		this.addMouseListener(new MouseInput());

		bird = new Bird(70, 30, "images//bird.png", true);
		int x = 1050;
		String stickImagePath = "images//stick250D.png";

		stick[0] = new Stick(x, 0, stickImagePath);
		stick[1] = new Stick(x, 320, stickImagePath);
		stick[2] = new Stick(x += 200, 0, stickImagePath);
		stick[3] = new Stick(x, 320, stickImagePath);
		stick[4] = new Stick(x += 200, 0, stickImagePath);
		stick[5] = new Stick(x, 320, stickImagePath);
		stick[6] = new Stick(x += 200, 0, stickImagePath);
		stick[7] = new Stick(x, 320, stickImagePath);
		stick[8] = new Stick(x += 200, 0, stickImagePath);
		stick[9] = new Stick(x, 320, stickImagePath);

		for (int i = 0; i < stick.length; i++) {
			StickMover sm = new StickMover(this, stick[i], bird);
			sm.start();
		}

		BirdJump bj = new BirdJump(this, bird);
		bj.start();

	}

	public void paint(Graphics g) {

		// Menu
		if (state == STATE.Menu) {

			ImageIcon background = new ImageIcon("images//background.png");
			g.drawImage(background.getImage(), 0, 0, null);
			Menu mu = new Menu();
			mu.render(g);
			bird.setIsAlive(true);

		} else if (state == STATE.Game) {

			ImageIcon background = new ImageIcon("images//background.png");
			g.drawImage(background.getImage(), 0, 0, null);

			bird.draw(g);

			for (int i = 0; i < stick.length; i++) {
				stick[i].draw(g);
				if (bird.getIsAlive() == true) {
					bird.draw(g);
				}

			}

			// Score
			Font fnt = new Font("Bernard MT Condensed", Font.BOLD, 30);
			g.setFont(fnt);
			g.setColor(Color.BLACK);
			g.drawString("Score : " + score, 375, 50);

			// game over
			if (bird.getIsAlive() == false) {

				g.drawImage(background.getImage(), 0, 0, null);
				GameOver go = new GameOver();
				go.render(g);
				Font fnt2 = new Font("Bernard MT Condensed", Font.PLAIN, 30);
				g.setFont(fnt2);
				g.setColor(Color.green);
				g.drawString("Your score : " + score, 350, 50);

			}
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (state == STATE.Game) {
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				bird.setY(bird.getY() - 50);
				if (bird.getY() <= -5) {
					bird.setIsAlive(false);
				}

			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}