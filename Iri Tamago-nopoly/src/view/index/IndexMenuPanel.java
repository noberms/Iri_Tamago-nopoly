package view.index;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import view.index.buttons.About;
import view.index.buttons.NewGame;
import view.index.buttons.Tutorial;

public class IndexMenuPanel extends JPanel {
	
	private static final long serialVersionUID = -844215927067541316L;

	public IndexMenuPanel() {
		
		GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		this.setSize(50, 200);
		this.setBackground(Color.BLUE);
		NewGame newGame = new NewGame();
		Tutorial tutorial = new Tutorial();
		About about = new About();
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.gridx = 0;
		
		gbc.gridy = 0;
		this.add(newGame, gbc);
		
		gbc.gridy = 1;
		this.add(tutorial, gbc);
		
		gbc.gridy = 2;
		this.add(about, gbc);
		
	}
	
}
