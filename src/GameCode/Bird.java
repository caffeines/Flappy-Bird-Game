package GameCode;

import java.awt.*;
import javax.swing.*;

public class Bird {

	private int x, y;
	private String imagePath;
	private Boolean isAlive;

	public Bird(int x, int y, String imagePath, Boolean isAlive) {

		this.x = x;
		this.y = y;
		this.imagePath = imagePath;
		this.isAlive = isAlive;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Boolean getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(Boolean isAlive) {
		this.isAlive = isAlive;
	}

	public void draw(Graphics g) {
		ImageIcon bird = new ImageIcon(imagePath);
		g.drawImage(bird.getImage(), x, y, null);
	}
}
