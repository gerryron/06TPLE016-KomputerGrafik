package com.gerryron.UTS.submenu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawLingkaran extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3888803011860371494L;

	public void lingkaran(Graphics g) {
		Graphics2D lingkaran = (Graphics2D) g;
		double x = 110, y = 80;
		double diameter = 125;
		lingkaran.setColor(Color.blue);
		lingkaran.fill(new Ellipse2D.Double(x, y, diameter, diameter));
	}
	 
	public void paintComponent(Graphics g) {
		 clear(g);
		 lingkaran(g);
	}
	 
	protected void clear(Graphics g) {
		super.paintComponent(g);
	}
	 
	public static void main() {
		DrawLingkaran panelGambar = new DrawLingkaran();
		JFrame fr = new JFrame();
		fr.setTitle("Lingkaran");
		fr.setSize(350,350);
		fr.getContentPane().add(panelGambar);
		fr.setVisible(true);
	}

}
