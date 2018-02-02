package GameCode;

import java.awt.*;

public class Menu {
	public Rectangle playButton = new Rectangle(400,100,100,50);//x,y,width,height
	public Rectangle helpButton = new Rectangle(400,200,100,50);
	public Rectangle quitButton = new Rectangle(400,300,100,50);
	public Rectangle aboutButton = new Rectangle(400,400,105,50);
	

	//When a component needs to be displayed, its paint or update method is automatically invoked with the appropriate Graphics context.

	
	public void render(Graphics g){
		
		Font fnt=new Font("Castellar",Font.ITALIC,50);
		g.setFont(fnt);
		g.setColor(Color.green);
		g.drawString("Flappy Bird", 300,50 );
		
		Font fnt2=new Font("ARIAL",Font.BOLD,20);
		g.setFont(fnt2);
		g.setColor(Color.BLACK);
		g.drawString("Have to start game within three seconds", 10,465 );
		g.setColor(Color.green);
		
		Graphics2D g2d = (Graphics2D) g;
		
		
		Font fnt1 = new Font("Algerian",Font.BOLD,30);//font name,style,font size
		
		g2d.draw(playButton);
		g.setFont(fnt1);
		g.setColor(Color.red);
		g.drawString("Play", 405, 132);
		g.setColor(Color.green);
		
		
		g2d.draw(helpButton);
		g.setFont(fnt1);
		g.setColor(Color.red);
		g.drawString("Help", 412, 232);
		g.setColor(Color.green);
		
		g2d.draw(quitButton);
		g.setFont(fnt1);
		g.setColor(Color.red);
		g.drawString("Quit", 415, 332);
		g.setColor(Color.green);
		
		g2d.draw(aboutButton);
		g.setFont(fnt1);
		g.setColor(Color.red);
		g.drawString("About", 399, 432);
		
	
	}

}
