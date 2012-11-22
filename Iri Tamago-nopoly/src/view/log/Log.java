package view.log;

import javax.swing.JFrame;

public class Log extends JFrame {
	//Forward
	private static final long serialVersionUID = -7576523088264784541L;
	
	public Log(String title) {
		this.setTitle(title);
		this.setSize(300, 200);
		this.setLocation(10, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		this.setVisible(true);
	}
	
}
