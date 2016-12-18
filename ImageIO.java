package com.faikturan;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageFilter;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;

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
		getPictureButton.addActionListener(e->getPictureButtonClick());
		buttonPanel.add(getPictureButton);
		this.add(buttonPanel, BorderLayout.SOUTH);
		this.setVisible(true);
		
	}
	
	public class PicturePanel extends JPanel{
		public void paint(Graphics g)
		{
			g.drawImage(img, 0, 0, this);
		}
	}
	
	public void getPictureButtonClick(){
		String file = getImageFile();
		if (file != null) {
			Toolkit kit = Toolkit.getDefaultToolkit();
			img = kit.getImage(file);
			img = img.getScaledInstance(500, -1, Image.SCALE_SMOOTH);
			this.repaint();
		}
	}
	
	public String getImageFile(){
		JFileChooser fc = new JFileChooser();
		fc.setFileFilter(new ImageFilter());
		int result = fc.showOpenDialog(null);
		File file = null;
		if (result == JFileChooser.APPROVE_OPTION) {
			file = fc.getSelectedFile();
			return file.getPath();
		}
		else
		return null;
	}
	
	private class ImageFilter extends FileFilter{
		@Override
		public boolean accept(File f) {
			if (f.isDirectory()) 
				return true;
			String name = f.getName();
			if (name.matches(".*((.jpg) | (.gif) | (.png))"))
				return true;
			else
			return false;
		}

		@Override
		public String getDescription() {
			return "Resim Dosyalarý (*.jpg, *.gif, *.png)";
		}
		
	}
	
	
	public static void main(String[] args) {
		new ImageIO();

	}

}
