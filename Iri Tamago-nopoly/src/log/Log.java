package log;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import log.buttons.NewGame;
import log.buttons.Tutorial;

public class Log extends JFrame {
	
	private static final long serialVersionUID = -7576523088264784541L;
	
	public Log(String title) {
		this.setTitle(title);
		this.setSize(300, 200);
		this.setLocation(10, 200);
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(BorderLayout.NORTH, new NewGame());
		this.getContentPane().add(BorderLayout.SOUTH, new Tutorial());
		/*
		this.getContentPane().add(BorderLayout.AFTER_LAST_LINE, new About());
		*/		
		this.setVisible(true);
	}
	
}
