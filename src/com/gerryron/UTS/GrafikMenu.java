package com.gerryron.UTS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import com.gerryron.UTS.submenu.DrawLingkaran;
import com.gerryron.UTS.submenu.DrawPolygon;
import com.gerryron.UTS.submenu.DrawSegitiga;
import com.gerryron.UTS.submenu.DrawTabung;

public class GrafikMenu {

	private JFrame frmGerryron;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GrafikMenu window = new GrafikMenu();
					window.frmGerryron.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GrafikMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGerryron = new JFrame();
		frmGerryron.setTitle("Gerryron - 181011401627");
		frmGerryron.setBounds(100, 100, 450, 300);
		frmGerryron.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmGerryron.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aplikasi Grafik");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 414, 51);
		panel.add(lblNewLabel);
		
		JButton polygonButton = new JButton("Polygon");
		polygonButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DrawPolygon.main();
			}
		});
		polygonButton.setForeground(Color.RED);
		polygonButton.setBounds(65, 95, 101, 23);
		panel.add(polygonButton);
		
		JButton segitigaButton = new JButton("Segitiga");
		segitigaButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DrawSegitiga.main();
			}
		});
		segitigaButton.setForeground(Color.RED);
		segitigaButton.setBounds(65, 152, 101, 23);
		panel.add(segitigaButton);
		
		JButton lingkaranButton = new JButton("Lingkaran");
		lingkaranButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DrawLingkaran.main();
			}
		});
		lingkaranButton.setForeground(Color.RED);
		lingkaranButton.setBounds(287, 95, 101, 23);
		panel.add(lingkaranButton);
		
		JButton tabungButton = new JButton("Tabung");
		tabungButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DrawTabung.main();
			}
		});
		tabungButton.setForeground(Color.RED);
		tabungButton.setBounds(287, 152, 101, 23);
		panel.add(tabungButton);
	}
}
