/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Administrator
 */
public class GameFrame implements WindowListener {
	private static drawBall mp = new drawBall();

    public GameFrame() {
        Frame f = new Frame("my app");
        
        f.setLocation(300,200);
        f.setSize(500, 500);
        f.addWindowListener(this);
        f.add(mp);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new GameFrame();
		mp.gameLoop();
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }
}
