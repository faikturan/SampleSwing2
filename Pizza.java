package com.faikturan;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class Pizza extends JFrame {

	public static void main(String[] args) {
		new Pizza();

	}
	private JButton buttonOK;
	private JRadioButton kucuk, orta, buyuk;
	private JCheckBox peynir, salam, mantar;
	
	public Pizza() {
		this.setSize(320, 200);
		this.setTitle("Pizza Sipariþ Ver");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		JPanel sizePanel = new JPanel();
		Border b1 = BorderFactory.createTitledBorder("Boyut");
		sizePanel.setBorder(b1);
		
		ButtonGroup sizeGroup = new ButtonGroup();
		
		kucuk = new JRadioButton("Küçük");
		kucuk.setSelected(true);
		sizePanel.add(kucuk);
		sizeGroup.add(kucuk);
		
		orta = new JRadioButton("Orta");
		orta.setSelected(true);
		sizePanel.add(orta);
		sizeGroup.add(orta);
		
		buyuk = new JRadioButton("Büyük");
		buyuk.setSelected(true);
		sizePanel.add(buyuk);
		sizeGroup.add(buyuk);
		
		JPanel ekstraPanel = new JPanel();
		
		Border b2 = BorderFactory.createTitledBorder("Ekstralar");
		sizePanel.setBorder(b2);
		
		peynir = new JCheckBox("Peynir");
		ekstraPanel.add(peynir);
		
		salam = new JCheckBox("Salam");
		ekstraPanel.add(salam);
		
		mantar = new JCheckBox("Mantar");
		ekstraPanel.add(mantar);
		
		mainPanel.add(ekstraPanel);
	}
	
	public void buttonOKClick(){
		String ekstralar = "";
		if (peynir.isSelected()) 
			ekstralar += "Peynir\n";
		if (salam.isSelected()) 
			ekstralar += "Salam\n";
		if (mantar.isSelected()) 
			ekstralar += "Mantar\n";
		
		String msg = "Sipariþ verdikleriniz:";
		if (kucuk.isSelected()) 
			msg += "küçük pizza ile";
		if (orta.isSelected()) 
			msg += "orta pizza ile";
		if (buyuk.isSelected()) 
			msg += "büyük pizza ile";
		
		if (ekstralar.equals(""))
			msg += "Ekstralardan seçmediniz.";
		else
			msg += "Seçmiþ olduðunuz ekstralar:\n"
		+ekstralar;
		JOptionPane.showMessageDialog(buttonOK, msg, 
				"Sipariþiniz", JOptionPane.INFORMATION_MESSAGE);
			
	}

}
