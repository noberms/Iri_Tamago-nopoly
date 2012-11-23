package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import view.helper.ViewHelper;


public class ChooseToken extends JFrame {
	
	private static final long serialVersionUID = -1575414961698739525L;
	
	private JPanel menuPanel;
	private GridBagConstraints constraints3;
	
	ChooseToken() {
		this.setTitle("Iri Tamagonopoly - Choose a Token");
		int width = 671;
		int height = 525;
		this.setSize(width, height);
		this.setLocation(ViewHelper.getInstance().getLocationX(width), ViewHelper.getInstance().getLocationY(height));
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.initComponents();
	}
	
	private void initComponents() {
		ViewHelper vh = ViewHelper.getInstance();
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
		
		this.menuPanel = ViewHelper.getInstance().createPanel(null, 200, 35);
		this.constraints3 = new GridBagConstraints();
		//constraints3.fill = GridBagConstraints.HORIZONTAL;
		//constraints1.insets = new Insets(0, 0, 0, 0);

		vh.addComponent(menuPanel, 0, 2, new Insets(20, 0, 0, 0), mainPanel, constraints1);
		vh.addComponent(this.getBackButton(), 0, 0, this.menuPanel, this.constraints3);
		vh.addComponent(this.getStartButton(), 1, 0, this.menuPanel, this.constraints3);
		//vh.addComponent(new JProgressBar(0, 100), 1, 0, this.menuPanel, this.constraints3);
		
		//constraints1.ipadx = 0;
		//constraints1.ipady = 0;
		
		this.getContentPane().add(mainPanel);
		
	}
	
	private JButton getBackButton() {
		JButton back = new JButton("Back");
		back.setFont(new Font("SansSerif", Font.PLAIN, 11));
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
		start.setFont(new Font("SansSerif", Font.PLAIN, 11));
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
		
		JProgressBar jpbar = new JProgressBar(0, 100);
		this.menuPanel.removeAll();
		this.menuPanel.revalidate();
		this.repaint();
		
		ViewHelper.getInstance().addComponent(jpbar, 0, 0, this.menuPanel, this.constraints3);
		//this.menuPanel.add(jpbar, this.constraints3);
		this.menuPanel.revalidate();
		this.repaint();
		/* CHECK 
		 * http://www.dreamincode.net/forums/topic/27952-progress-bar-tutorial/
		 * http://docs.oracle.com/javase/tutorial/uiswing/components/progress.html#bars
		 */
		GameBoard gameBoard = new GameBoard();
		
		for(int i=0; i<100; i++) {
			jpbar.setValue(i);
			jpbar.repaint();
			try{Thread.sleep(50);}
			catch (InterruptedException err){}
		}
		
		gameBoard.setVisible(true);
		this.dispose();
	}
		
}
