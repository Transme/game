/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.geom.*;
import java.awt.Panel;
import java.awt.*;
import java.awt.image.*;

/**
 *
 * @author Administrator
 */
public class drawBall extends Panel {

	private int x;
	private int y;
	private int dx;
	private int dy;

	private int diameter;
	private Image im;

	public drawBall() {
		x = 50;
		y = 50;
		dx = 10;
		dy = 10;

		diameter = 40;
	}

//    public void paint(Graphics g) {
//        g.setColor(Color.blue);
//		g.fillOval(x,y,diameter,diameter);
 //   }

	public void gameLoop() {
		while(true) {
			gameUpdate();
			gameRender();
			gamePaint();
			for(int i=0; i<100000000; i++)
			{}
		}
	}

	public void gameUpdate() {
		x = x+dx;
		y = y+dy;
		if((x<0)||(x>(getWidth()-diameter))){
			dx=-dx;
		}
		if((y<0)||(y>(getHeight()-diameter))){
			dy=-dy;
		}

	}

	public void gameRender() {
		if(im==null){
			im=createImage(getWidth(),getHeight());
        }
		Graphics dbg=im.getGraphics();
		dbg.setColor(this.getBackground());
        dbg.fillRect(0, 0, getWidth(),getHeight());
		dbg.setColor(Color.blue);
		dbg.fillOval(x,y,diameter,diameter);
	}
	public void gamePaint() {
		Graphics g=this.getGraphics();
		g.drawImage(im,0,0,null);
		g.dispose();
	}
}
