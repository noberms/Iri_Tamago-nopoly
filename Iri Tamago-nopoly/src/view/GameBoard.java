package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import view.helper.BackgroundPanel;
import view.helper.ViewHelper;


public class GameBoard extends JFrame {
	
	private static final long serialVersionUID = -1406077166444402338L;
	
	public GameBoard() {
		this.setTitle("Iri Tamagonopoly - Game Board");
		int height = 580;
		int width = 721;
		this.setSize(width, height);
		this.setLocation(ViewHelper.getInstance().getLocationX(width), ViewHelper.getInstance().getLocationY(height));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.initComponents();
	}
	
	private void initComponents() {
		Image image = null;
		try {
			image = ImageIO.read(new File("images/Board.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		BackgroundPanel backgroundPanel = null;
		if(image != null) {
			ViewHelper vh = ViewHelper.getInstance();
			//Create Background
			backgroundPanel = new BackgroundPanel(image, BackgroundPanel.ACTUAL, 0.0f, 0.0f);
			backgroundPanel.setPaint(Color.WHITE);
			backgroundPanel.setLayout(new GridBagLayout());
			this.add(backgroundPanel);
			//Create Menu Panel as container of buttons
			JPanel menuPanel = vh.createPanel(new GridBagLayout(), Color.WHITE);
			vh.addComponent(menuPanel, 0, 0, new Insets(150, 565, 10, 10), backgroundPanel, new GridBagConstraints());
			//Create Buttons and add to Menu Panel
			GridBagConstraints gbc2 = new GridBagConstraints();
			gbc2.fill = GridBagConstraints.HORIZONTAL;
			gbc2.insets = new Insets(3, 0, 0, 0);
			vh.addComponent(this.getScreenResolutionButton(), 0, 0, menuPanel, gbc2);
			vh.addComponent(this.getNewGame(), 0, 1, menuPanel, gbc2);
			vh.addComponent(this.getIndex(), 0, 2, menuPanel, gbc2);
			vh.addComponent(this.getExitButton(), 0, 3, menuPanel, gbc2);
		}
	}
	
	private JButton getScreenResolutionButton() {
		JButton screenResolution = new JButton("Screen Resolution");
		//System.out.println(screenResolution.getFont().getSize());
		screenResolution.setFont(new Font("SansSerif", Font.PLAIN, 11));
		screenResolution.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				executeScreenResolution();
			}
		});
		return screenResolution;
	}

	private JButton getNewGame() {
		JButton exit = new JButton("New Game");
		exit.setFont(new Font("SansSerif", Font.PLAIN, 11));
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				executeNewGame();
			}
		});
		return exit;
	}
	
	private JButton getIndex() {
		JButton index = new JButton("Index");
		index.setFont(new Font("SansSerif", Font.PLAIN, 11));
		index.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				executeIndex();
			}
		});
		return index;
	}
	
	private JButton getExitButton() {
		JButton exit = new JButton("Exit");
		exit.setFont(new Font("SansSerif", Font.PLAIN, 11));
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				executeExit();
			}
		});
		return exit;
	}
	
	private void executeScreenResolution() {
		int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		
		JOptionPane.showMessageDialog(null, "Screen resolution is " + width + " x " + height, "Screen Resolution", JOptionPane.PLAIN_MESSAGE);
	}
	
	private void executeNewGame() {
		ChooseToken chooseToken = new ChooseToken();
		chooseToken.setVisible(true);
		this.dispose();
	}
	
	private void executeIndex() {
		Index index = new Index();
		index.setVisible(true);
		this.dispose();
	}
	
	private void executeExit() {
		this.dispose();
	}
	
}
