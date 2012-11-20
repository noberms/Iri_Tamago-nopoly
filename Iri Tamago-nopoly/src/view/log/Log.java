package view.log;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import view.log.buttons.*;

public class Log extends JFrame {
	
	private static final long serialVersionUID = -7576523088264784541L;
	
	public Log() {
		this.initGUI();
		this.setVisible(true);
	}
	
	private void initGUI() {
		this.setTitle("Index");
		this.setSize(300, 200);
		this.setLocation(10, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridBagLayout layout = new GridBagLayout();
		JPanel panel = new JPanel(layout);
		panel.setSize(50, 200);
		NewGame newGame = new NewGame();
		Tutorial tutorial = new Tutorial();
		About about = new About();
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.gridx = 0;
		
		gbc.gridy = 0;
		panel.add(newGame, gbc);
		
		gbc.gridy = 1;
		panel.add(tutorial, gbc);
		
		gbc.gridy = 2;
		panel.add(about, gbc);
		
		this.add(panel);
	}
	
}
