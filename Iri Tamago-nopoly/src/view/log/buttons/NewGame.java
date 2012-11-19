package view.log.buttons;

import javax.swing.JButton;

//import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGame extends JButton {
	
	private static final long serialVersionUID = 3657893553757555378L;

	public NewGame() {
		this.setText("New Game");
		this.setSize(50, 50);
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println(this.getClass());
			}
		});
	}	
	
}
