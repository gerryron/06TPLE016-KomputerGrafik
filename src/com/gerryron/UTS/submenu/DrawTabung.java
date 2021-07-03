package com.gerryron.UTS.submenu;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawTabung extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3440587915154839518L;

	public void tabung(Graphics g) {
		g.drawOval(100, 75, 100, 50);
		g.drawOval(100, 175, 100, 50);
		g.drawLine(100, 100, 100, 200);
		g.drawLine(200, 100, 200, 200);
	}
	 
	public void paintComponent(Graphics g) {
		 clear(g);
		 tabung(g);
	}
	 
	protected void clear(Graphics g) {
		super.paintComponent(g);
	}
	 
	public static void main() {
		DrawTabung panelGambar = new DrawTabung();
		JFrame fr = new JFrame();
		fr.setTitle("Tabung");
		fr.setSize(350,350);
		fr.getContentPane().add(panelGambar);
		fr.setVisible(true);
	}
	
}
