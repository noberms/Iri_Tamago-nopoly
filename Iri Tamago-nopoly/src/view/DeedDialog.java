package view;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDialog;

import model.Board;

import view.helper.BackgroundPanel;
import view.helper.ViewHelper;

public class DeedDialog extends JDialog {
	
	private static final long serialVersionUID = -7286274094471748567L;
	
	public DeedDialog(int deedIndex) {
		String name = Board.getInstance().getTile(deedIndex).getName();
		this.setTitle(name);
		int width = 270;
		int height = 445;
		this.setSize(width, height);
		this.setResizable(false);
		this.setLocation(ViewHelper.getInstance().getLocationX(width), ViewHelper.getInstance().getLocationY(height));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.initComponents(deedIndex);
	}
	
	private void initComponents(int deedIndex) {
		Image image = null;
		try {
			image = ImageIO.read(new File("images/deeds/" + deedIndex + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BackgroundPanel backgroundPanel = null;
		if(image != null) {
			backgroundPanel = new BackgroundPanel(image, BackgroundPanel.ACTUAL, 0.0f, 0.0f);
			backgroundPanel.setPaint(Color.WHITE);
			this.add(backgroundPanel);
		}
	}
	
}
