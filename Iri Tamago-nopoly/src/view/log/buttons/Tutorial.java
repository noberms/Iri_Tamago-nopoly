package view.log.buttons;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tutorial extends JButton {
	
	private static final long serialVersionUID = 7006738868324082972L;

	public Tutorial() {
		this.setText("Tutorial");
		this.setSize(100, 50);
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println(this.getClass());
			}
		});
	}
	
}
