package com.faikturan;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {

	public MainFrame() {
		super("Hello World ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		@Override
			public void run() {
				new MainFrame();
		}
		});
		
	}

}
