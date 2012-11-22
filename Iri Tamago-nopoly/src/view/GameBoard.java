package view;

import javax.swing.JFrame;


public class GameBoard extends JFrame {
	
	private static final long serialVersionUID = -1406077166444402338L;
	
	public GameBoard() {
		this.setTitle("Iri Tamagonopoly - Game Board");
		this.setSize(800, 600);
		this.setLocation(200, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.initComponents();
	}
	
	private void initComponents() {
		
	}
	
}
