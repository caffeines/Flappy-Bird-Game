package GameCode;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class GameOver {
	public void render(Graphics p) {

		Font fnt = new Font("kristen itc", Font.ITALIC, 100);
		p.setFont(fnt);
		p.setColor(Color.red);
		p.drawString("Game Over!", 150, 200);
	}
}
