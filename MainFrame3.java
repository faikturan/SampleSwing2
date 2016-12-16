package com.faikturan;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class MainFrame3 extends JFrame implements ActionListener {

	private JTextArea textArea;
	private JButton button;
 	
	public MainFrame3() {
		super("Event example ");
		setLayout(new BorderLayout());
		textArea = new JTextArea();
		button = new JButton("Click me ");
		button.addActionListener(this);
		add(textArea, BorderLayout.CENTER);
		add(button,BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
 
		textArea.append("Hello\n");
		 
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		@Override
			public void run() {
				new MainFrame3();
		}
		});
		
	}

	

}
