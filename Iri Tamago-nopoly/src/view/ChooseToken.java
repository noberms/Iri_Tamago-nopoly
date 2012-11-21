package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import view.helper.ViewHelper;

public class ChooseToken extends JFrame {
	
	private static final long serialVersionUID = -1575414961698739525L;
	
	ChooseToken() {
		this.setTitle("Iri Tamagonopoly - Choose a Token");
		this.setSize(671, 525);
		this.setLocation(200, 200);
		this.setResizable(false);
		this.initComponents();
		this.setVisible(true);
	}
	
	private void initComponents() {
		
		JPanel main = ViewHelper.getInstance().createPanel();
		main.setLayout(new GridBagLayout());
		
		JPanel tokens = ViewHelper.getInstance().createPanel(null, 671, 400);
		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		gbc1.fill = GridBagConstraints.HORIZONTAL;
		gbc1.insets = new Insets(0, 0, 0, 0);
		main.add(tokens, gbc1);
		
		JPanel menu = ViewHelper.getInstance().createPanel(null, 200, 50);
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
		
		gbc1.gridx = 0;
		gbc1.gridy = 1;
		main.add(menu, gbc1);
		
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
