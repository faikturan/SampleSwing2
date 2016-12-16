package com.faikturan;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class MainFrame2 extends JFrame {

	private JTextArea textArea;
	private JButton button;
 	
	public MainFrame2() {
		super("Event example ");
		setLayout(new BorderLayout());
		textArea = new JTextArea();
		button = new JButton("Click me ");
		add(textArea, BorderLayout.CENTER);
		add(button,BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		@Override
			public void run() {
				new MainFrame2();
		}
		});
		
	}

}
