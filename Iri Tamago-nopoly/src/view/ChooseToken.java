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
		int width = 671;
		int height = 525;
		this.setSize(width, height);
		this.setLocation(ViewHelper.getInstance().getLocationX(width), ViewHelper.getInstance().getLocationY(height));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.initComponents();
	}
	
	private void initComponents() {
		
		JPanel mainPanel = ViewHelper.getInstance().createPanel();
		mainPanel.setLayout(new GridBagLayout());
		JPanel tokenPanels[] = new JPanel[2];
		for(int i=0; i<tokenPanels.length; i++) {
			tokenPanels[i] = ViewHelper.getInstance().createPanel(null, 550, 140);
		}
		
		GridBagConstraints constraints1 = new GridBagConstraints();
		
		JPanel tokens[] = new JPanel[8];
		for(int i=0; i < tokens.length; i++) {
			if(i%2 == 0) {
				tokens[i] = ViewHelper.getInstance().createPanel(Color.BLACK, 130);
			}
			else {
				tokens[i] = ViewHelper.getInstance().createPanel(Color.BLUE, 130);
			}
		}
		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.insets = new Insets(0, 0, 0, 0);
		
		/*-- First Row of Tokens --*/
		//constraints2.gridx = 0;
		//constraints2.gridy = 0;
		constraints2.insets = new Insets(20, 0, 0, 0);
		tokenPanels[0].add(tokens[0], constraints2);
		
		//constraints2.gridx = 1;
		//constraints2.gridy = 0;
		tokenPanels[0].add(tokens[1], constraints2);
		
		//constraints2.gridx = 2;
		//constraints2.gridy = 0;
		tokenPanels[0].add(tokens[2], constraints2);
		
		//constraints2.gridx = 3;
		//constraints2.gridy = 0;
		tokenPanels[0].add(tokens[3], constraints2);
		
		/*-- Second Row of Tokens --*/
		//constraints2.gridx = 0;
		//constraints2.gridy = 1;
		tokenPanels[1].add(tokens[4], constraints2);
		
		//constraints2.gridx = 1;
		//constraints2.gridy = 1;
		tokenPanels[1].add(tokens[5], constraints2);
		
		//constraints2.gridx = 2;
		//constraints2.gridy = 1;
		tokenPanels[1].add(tokens[6], constraints2);
		
		//constraints2.gridx = 3;
		//constraints2.gridy = 1;
		tokenPanels[1].add(tokens[7], constraints2);
		
		
		constraints1.gridx = 0;
		constraints1.gridy = 0;
		constraints1.fill = GridBagConstraints.HORIZONTAL;
		mainPanel.add(tokenPanels[0], constraints1);
		constraints1.gridy = 1;
		constraints1.insets = new Insets(130, 0, 0, 0);
		mainPanel.add(tokenPanels[1], constraints1);
		
		JPanel menuPanel = ViewHelper.getInstance().createPanel(null, 200, 35);
		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.fill = GridBagConstraints.HORIZONTAL;
		//constraints1.insets = new Insets(0, 0, 0, 0);
		
		JButton back = this.getBackButton();
		constraints3.gridx = 0;
		constraints3.gridy = 0;
		menuPanel.add(back, constraints3);
		
		JButton start = this.getStartButton();
		constraints3.gridx = 1;
		menuPanel.add(start, constraints3);
		
		//constraints1.ipadx = 0;
		//constraints1.ipady = 0;
		constraints1.gridx = 0;
		constraints1.gridy = 2;
		constraints1.insets = new Insets(20, 0, 0, 0);
		mainPanel.add(menuPanel, constraints1);
		
		this.add(mainPanel);
		
	}
	
	private JButton getBackButton() {
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				executeBack();
			}
		});
		return back;
	}
	
	private JButton getStartButton() {
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
		Index index = new Index();
		index.setVisible(true);
		this.dispose();
	}
	
	private void executeStart() {
		GameBoard gameBoard = new GameBoard();
		gameBoard.setVisible(true);
		this.dispose();
	}
		
}
