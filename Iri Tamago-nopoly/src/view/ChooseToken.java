package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChooseToken extends JFrame {
	
	private static final long serialVersionUID = -1575414961698739525L;
	
	ChooseToken() {
		this.setTitle("Iri Tamagonopoly - Choose a Token");
		this.setSize(671, 525);
		this.setLocation(200, 200);
		
		this.initComponents();
		this.setVisible(true);
	}
	
	private void initComponents() {
		
		JPanel main = new JPanel(new GridBagLayout());
		
		JPanel menu = new JPanel(new GridBagLayout());
		GridBagConstraints gbc2 = new GridBagConstraints();		
		gbc2.fill = GridBagConstraints.HORIZONTAL;
		gbc2.insets = new Insets(5, 5, 5, 5);
		
		JButton back = this.createBackButton();
		gbc2.gridx = 0;
		gbc2.gridy = 0;
		menu.add(back, gbc2);
		
		JButton start = this.createStartButton();
		gbc2.gridy = 1;
		menu.add(start, gbc2);
		
		main.add(menu);
		
		this.add(main);
		
	}
	
	private JButton createBackButton() {
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				executeBack();
			}
		});
		return back;
	}
	
	private JButton createStartButton() {
		JButton start = new JButton("Start");
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				executeStart();
			}
		});
		return start;
	}
	
	private void executeBack() {
		
	}
	
	private void executeStart() {
		
	}
		
}
