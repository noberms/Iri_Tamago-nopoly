package view.log.buttons;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JButton {
	
	private static final long serialVersionUID = -3451147928579128619L;
	
	public About() {
		this.setText("About Iri Tamago");
		this.setSize(100, 50);
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println(this.getClass());
			}
		});
	}
	
}
