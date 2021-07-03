package com.gerryron.UTS.submenu;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Polygon;
import java.awt.Color;

public class DrawPolygon extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7673322045163345482L;

	public void poligon(Graphics g) {
		 Graphics2D g2d = (Graphics2D) g;
		 Polygon pol;
		 int x[] = {125, 150, 200, 225, 200, 150};
		 int y[] = {150, 100, 100, 150, 200, 200};
		 pol = new Polygon(x, y, x.length);
		 g2d.setPaint(Color.blue);
		 g2d.fill(pol);
	}
	 
	public void paintComponent(Graphics g) {
		 clear(g);
		 poligon(g);
	}
	 
	protected void clear(Graphics g) {
		super.paintComponent(g);
	}
	 
	public static void main() {
		DrawPolygon panelGambar = new DrawPolygon();
		JFrame fr = new JFrame();
		fr.setTitle("Polygon");
		fr.setSize(350,350);
		fr.getContentPane().add(panelGambar);
		fr.setVisible(true);
	}
}
