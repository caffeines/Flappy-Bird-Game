package GameCode;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		GameBoard gb = new GameBoard();

		JFrame gw = new JFrame();

		gw.setSize(900, 500);
		gw.setTitle("Flappy Bird");
		gw.setLocation(280, 100);
		gw.setResizable(false);
		gw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gw.add(gb);

		gw.setVisible(true);
		

	}

}
