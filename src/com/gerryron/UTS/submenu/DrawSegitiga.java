package com.gerryron.UTS.submenu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawSegitiga extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3955494173772159889L;

	public void segitiga(Graphics g) {
		 Graphics2D segitiga = (Graphics2D) g;
		 int x[] = {60, 160, 260};
		 int y[] = {210, 50, 210};
		 segitiga.setColor(Color.blue);
		 segitiga.fill(new Polygon(x, y, x.length));
	}
	 
	public void paintComponent(Graphics g) {
		 clear(g);
		 segitiga(g);
	}
	 
	protected void clear(Graphics g) {
		super.paintComponent(g);
	}
	 
	public static void main() {
		DrawSegitiga panelGambar = new DrawSegitiga();
		JFrame fr = new JFrame();
		fr.setTitle("Segitiga");
		fr.setSize(350,350);
		fr.getContentPane().add(panelGambar);
		fr.setVisible(true);
	}

}
