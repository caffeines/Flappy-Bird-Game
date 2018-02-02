package GameCode;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class MouseInput implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		/*
		 * public Rectangle playButton = new
		 * Rectangle(400,100,100,50);//x,y,width,height public Rectangle
		 * helpButton = new Rectangle(400,200,100,50); public Rectangle
		 * quitButton = new Rectangle(400,300,100,50); public Rectangle
		 * aboutButton = new Rectangle(400,400,100,50);
		 */

		// Play button

		if (e.getX() > 400 && e.getX() < 500) {
			if (e.getY() > 100 && e.getY() < 150) {
				GameBoard.state = GameBoard.STATE.Game;
				// System.out.println("Clicked");
			}
		}

		// Help button

		if (e.getX() > 400 && e.getX() < 500) {
			if (e.getY() > 200 && e.getY() < 250) {

				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"Have to strat game within three seconds\nPress Play for game start \nPress Space for bird jump "
								+ "\nand if you want to to exit then you can press Quit..\n"
								+ "                                 Thanks");
			}

		}

		// Quit button

		if (e.getX() > 400 && e.getX() < 500) {
			if (e.getY() > 300 && e.getY() < 350) {
				System.exit(1);
				// System.out.println("Clicked");
			}
		}

		// about button

		if (e.getX() > 400 && e.getX() < 500) {
			if (e.getY() > 400 && e.getY() < 450) {

				Component frame = null;
				JOptionPane.showMessageDialog(frame,
						"\nCopyright © sadat.sayem@northsouth.edu 2016 All Rights reserved\n"
								+ "\nAbout Developer : \n\nAbu Sadat Md. Sayem and Susmita Roy\nStudent of Computer Science & Engineering"
								+ "\nNorth South University\n\nSpecial thanks to :\n\nTarif Riyad Rahman\nFaculty,"
								+ "Department of ECE\nNorth South University\n"
								+ "\nForhan Noor\nLab Officer,Department of ECE\nNorth South University");
			}

		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
