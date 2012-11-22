package view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;


public class GameBoard extends JFrame {
	
	private static final long serialVersionUID = -1406077166444402338L;
	
	public GameBoard() {
		this.setTitle("Iri Tamagonopoly - Game Board");
		this.setSize(721, 580);
		this.setLocation(200, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.initComponents();
	}
	
	private void initComponents() {
		
		JLabel backgroundLabel = new JLabel();
		//backgroundLabel.setIcon(new ImageIcon(getClass().getResource("../images/BoardFrame.jpg")));
		try {
			backgroundLabel.setIcon(new ImageIcon(ImageIO.read(new File("images/BoardFrame.jpg"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.add(backgroundLabel);
		
		//JPanel backgroundPanel = new JPanel();
		
		
	}
	
}
