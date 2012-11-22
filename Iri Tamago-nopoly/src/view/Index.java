package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import view.index.IndexMenuPanel;

public class Index extends JFrame {
	
	private static final long serialVersionUID = -7576523088264784541L;
	
	public Index() {
		this.initGUI();
		this.setVisible(true);
	}
	
	private void initGUI() {
		this.setupLookAndFeel();
		
		this.setTitle("Index");
		this.setSize(500, 390);
		this.setLocation(10, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(20, 0, 0, 0);
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		
		JPanel panel = new IndexMenuPanel();
		this.getContentPane().add(panel, gbc);
				
	}
	
	private void setupLookAndFeel() {
		try {
			UIManager.setLookAndFeel(LookAndFeel.NIMBUS.path());
		} catch(Exception e) {}
	}
	
}
