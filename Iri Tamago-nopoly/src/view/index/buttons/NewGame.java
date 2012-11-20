package view.index.buttons;

import javax.swing.JButton;
import javax.swing.JOptionPane;

//import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGame extends JButton {
	
	private static final long serialVersionUID = 3657893553757555378L;

	public NewGame() {
		this.setText("New Game");
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "This feature is still under construction", "Under Construction", JOptionPane.PLAIN_MESSAGE);
			}
		});
	}	
	
}
