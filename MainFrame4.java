package com.faikturan;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame4 extends JFrame {
	private JLabel sampleText;
	private JComboBox fontComboBox, sizeComboBox;
	private JCheckBox boldCheck, italCheck;

	private String[] fonts;

	public MainFrame4() {
		setSize(600, 600);
		setTitle("Yazý Biçimini Deðiþtir");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		sampleText = new JLabel("Ýsmek Yenibosna Uzmanlýk Merkezi Java Grubu");
		this.add(sampleText, BorderLayout.NORTH);

		GraphicsEnvironment g;
		g = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fonts = g.getAvailableFontFamilyNames();
		JPanel controlPanel = new JPanel();

		fontComboBox = new JComboBox<String>(fonts);
		fontComboBox.addActionListener(e->updateText());
		controlPanel.add(new JLabel("Font Family"));
		controlPanel.add(fontComboBox);
		
		Integer[] sizes = {7,8,9,10,12,14,18,20,22,24,36};
		sizeComboBox = new JComboBox<Integer>(sizes);
		sizeComboBox.addActionListener(e->updateText());
		controlPanel.add(new JLabel("Size"));
		controlPanel.add(sizeComboBox);
		
		boldCheck = new JCheckBox("Bold");
		boldCheck.addActionListener(e->updateText());
		controlPanel.add(boldCheck);
		
		italCheck = new JCheckBox("Italic");
		italCheck.addActionListener(e->updateText());
		controlPanel.add(italCheck);
		
		this.add(controlPanel, BorderLayout.CENTER);
		updateText();
		this.setVisible(true);
		
		

	}

	public void updateText() {
		String name = (String) fontComboBox.getSelectedItem();

		Integer size = (Integer) sizeComboBox.getSelectedItem();

		int style;
		if (boldCheck.isSelected() && italCheck.isSelected())
			style = Font.BOLD | Font.ITALIC;
		else if (boldCheck.isSelected())
			style = Font.BOLD;
		else if (italCheck.isSelected())
			style = Font.ITALIC;
		else
			style = Font.PLAIN;

		Font f = new Font(name, style, size.intValue());
		sampleText.setFont(f);
	}

	public static void main(String[] args) {
		new MainFrame4();

	}

}
