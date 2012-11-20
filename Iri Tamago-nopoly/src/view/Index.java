package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.helper.ViewHelper;
import view.index.IndexMenuPanel;

public class Index extends JFrame {
	
	private static final long serialVersionUID = -7576523088264784541L;
	
	public Index() {
		this.initGUI();
		this.setVisible(true);
	}
	
	private void initGUI() {
		ViewHelper.getInstance().setupLookAndFeel();
		
		this.setTitle("Iri Tamagonopoly");
		this.setSize(500, 390);
		this.setLocation(10, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagConstraints gbc = new GridBagConstraints();
		GridBagLayout layout = new GridBagLayout();
		JPanel main = new JPanel(layout);
		
		JPanel red = ViewHelper.getInstance().createSquareJPanel(null, 300);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.VERTICAL;
		main.add(red, gbc);
		
		JPanel menu = new IndexMenuPanel();
		gbc.gridx = 1;
		main.add(menu, gbc);
		
		this.add(main);
		
	}
		
	
	
}
