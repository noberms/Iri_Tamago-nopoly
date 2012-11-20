package view.index.buttons;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tutorial extends JButton {
	
	private static final long serialVersionUID = 7006738868324082972L;

	public Tutorial() {
		this.setText("Tutorial");
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "This feature is still under construction", "Under Construction", JOptionPane.PLAIN_MESSAGE);
			}
		});
	}
	
}
