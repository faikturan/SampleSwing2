package com.faikturan;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageIO extends JFrame {

	Image img;
	JButton getPictureButton;
	
	public ImageIO() {
		this.setSize(500, 500);
		this.setTitle("Image Frame Programý");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel picPanel = new PicturePanel();
		this.add(picPanel, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		getPictureButton = new JButton("Resim Seç");
		
	}
	
	public class PicturePanel extends JPanel{
		public void paint(Graphics g){
			g.drawImage(img, 0, 0, this);
		}
	}
	
	public void getPictureButtonClick(){
		String file = getImageFile();
	}
	
	public String getImageFile(){
		return null;
		
		
	}
	public static void main(String[] args) {
		new ImageIO();

	}

}
