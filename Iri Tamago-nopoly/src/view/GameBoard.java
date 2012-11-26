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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import view.helper.BackgroundPanel;
import view.helper.ViewHelper;


public class GameBoard extends JFrame {
	
	private static final long serialVersionUID = -1406077166444402338L;
	private JPanel[] tilePanels = new JPanel[40];
	
	public GameBoard(JProgressBar progressBar) {
		this.setTitle("Iri Tamagonopoly - Game Board");
		int height = 588;
		int width = 722;
		this.setSize(width, height);
		this.setLocation(ViewHelper.getInstance().getLocationX(width), ViewHelper.getInstance().getLocationY(height));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* >>>>>>>>>> UPDATE PROGRESS BAR <<<<<<<<<< */
		progressBar.setValue(progressBar.getValue() + 10);
		
		this.initComponents(progressBar);
	}
	
	private void initComponents(JProgressBar progressBar) {
		Image image = null;
		try {
			image = ImageIO.read(new File("images/Board.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		BackgroundPanel boardPanel = null;
		/* >>>>>>>>>> UPDATE PROGRESS BAR <<<<<<<<<< */
		progressBar.setValue(progressBar.getValue() + 10);
		
		if(image != null) {
			ViewHelper vh = ViewHelper.getInstance();
			//Create Background
			JPanel gameBoardPanel = vh.createPanel(new GridBagLayout());
			gameBoardPanel.setBackground(Color.PINK);
			this.getContentPane().add(gameBoardPanel);
			
			GridBagConstraints mainConstraint = new GridBagConstraints();
			boardPanel = new BackgroundPanel(image, BackgroundPanel.ACTUAL, 0.0f, 0.0f);
			boardPanel.setSize(554, 554);
			//backgroundPanel.setPaint(Color.WHITE);
			boardPanel.setLayout(new GridBagLayout());
			
			JPanel controlPanel = vh.createPanel(Color.WHITE, 161, 554);
			controlPanel.setLayout(new GridBagLayout());
			
			mainConstraint.gridx = 0;
			mainConstraint.gridy = 0;
			gameBoardPanel.add(boardPanel, mainConstraint);
			mainConstraint.gridx = 1;
			mainConstraint.gridy = 0;
			gameBoardPanel.add(controlPanel, mainConstraint);
			/* >>>>>>>>>> UPDATE PROGRESS BAR <<<<<<<<<< */
			progressBar.setValue(progressBar.getValue() + 10);
			
			int tWidth = 45, tHeight = 75;
			int gridx = 10, gridy = 10;
			GridBagConstraints gameBoardConstraints = new GridBagConstraints();
			
			for (int i=0; i<this.tilePanels.length; i++) {
				if(i%10!=0) {
					if(i<10 || i<30&&i>20) {
						this.tilePanels[i] = vh.createPanel(tWidth, tHeight);
					}else if(i<20&&i>10 || i<40&&i>30) {
						this.tilePanels[i] = vh.createPanel(tHeight, tWidth);
					}
				}
				else {
					this.tilePanels[i] = vh.createPanel(tHeight);
				}
				
				this.tilePanels[i].addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						System.out.println("You pressed " + e.getSource());
					}
					
				});
				
				//System.out.println("this.tilePanels[" + i + "], " + gridx + ", " + gridy + ", boardPanel, gameBoardConstrians");
				vh.addComponent(this.tilePanels[i], gridx, gridy, boardPanel, gameBoardConstraints);
				
				if(i<10) {
					gridx--;
				}else if(i<20) {
					gridy--;
				}else if(i<30) {
					gridx++;
				}else if(i<40) {
					gridy++;
				}
			}
			
			/*
			//Bottom Row
			this.tilePanels[0] = vh.createPanel(tHeight);
			vh.addComponent(this.tilePanels[0], 10, 10, boardPanel, gameBoardConstraints);
			this.tilePanels[1] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[1], 9, 10, boardPanel, gameBoardConstraints);
			this.tilePanels[2] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[2], 8, 10, boardPanel, gameBoardConstraints);
			this.tilePanels[3] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[3], 7, 10, boardPanel, gameBoardConstraints);
			this.tilePanels[4] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[4], 6, 10, boardPanel, gameBoardConstraints);
			this.tilePanels[5] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[5], 5, 10, boardPanel, gameBoardConstraints);
			this.tilePanels[6] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[6], 4, 10, boardPanel, gameBoardConstraints);
			this.tilePanels[7] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[7], 3, 10, boardPanel, gameBoardConstraints);
			this.tilePanels[8] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[8], 2, 10, boardPanel, gameBoardConstraints);
			this.tilePanels[9] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[9], 1, 10, boardPanel, gameBoardConstraints);
			this.tilePanels[10] = vh.createPanel(tHeight);
			vh.addComponent(this.tilePanels[10], 0, 10, boardPanel, gameBoardConstraints);
			//Left column
			this.tilePanels[11] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[11], 0, 9, boardPanel, gameBoardConstraints);
			this.tilePanels[12] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[12], 0, 8, boardPanel, gameBoardConstraints);
			this.tilePanels[13] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[13], 0, 7, boardPanel, gameBoardConstraints);
			this.tilePanels[14] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[14], 0, 6, boardPanel, gameBoardConstraints);
			this.tilePanels[15] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[15], 0, 5, boardPanel, gameBoardConstraints);
			this.tilePanels[16] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[16], 0, 4, boardPanel, gameBoardConstraints);
			this.tilePanels[17] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[17], 0, 3, boardPanel, gameBoardConstraints);
			this.tilePanels[18] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[18], 0, 2, boardPanel, gameBoardConstraints);
			this.tilePanels[19] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[19], 0, 1, boardPanel, gameBoardConstraints);
			this.tilePanels[20] = vh.createPanel(tHeight);
			vh.addComponent(this.tilePanels[20], 0, 0, boardPanel, gameBoardConstraints);
			//Top row
			this.tilePanels[21] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[21], 1, 0, boardPanel, gameBoardConstraints);
			this.tilePanels[22] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[22], 2, 0, boardPanel, gameBoardConstraints);
			this.tilePanels[23] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[23], 3, 0, boardPanel, gameBoardConstraints);
			this.tilePanels[24] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[24], 4, 0, boardPanel, gameBoardConstraints);
			this.tilePanels[25] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[25], 5, 0, boardPanel, gameBoardConstraints);
			this.tilePanels[26] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[26], 6, 0, boardPanel, gameBoardConstraints);
			this.tilePanels[27] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[27], 7, 0, boardPanel, gameBoardConstraints);
			this.tilePanels[28] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[28], 8, 0, boardPanel, gameBoardConstraints);
			this.tilePanels[29] = vh.createPanel(tWidth, tHeight);
			vh.addComponent(this.tilePanels[29], 9, 0, boardPanel, gameBoardConstraints);
			this.tilePanels[30] = vh.createPanel(tHeight);
			vh.addComponent(this.tilePanels[30], 10, 0, boardPanel, gameBoardConstraints);
			//Right column
			this.tilePanels[31] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[31], 10, 1, boardPanel, gameBoardConstraints);
			this.tilePanels[32] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[32], 10, 2, boardPanel, gameBoardConstraints);
			this.tilePanels[33] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[33], 10, 3, boardPanel, gameBoardConstraints);
			this.tilePanels[34] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[34], 10, 4, boardPanel, gameBoardConstraints);
			this.tilePanels[35] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[35], 10, 5, boardPanel, gameBoardConstraints);
			this.tilePanels[36] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[36], 10, 6, boardPanel, gameBoardConstraints);
			this.tilePanels[37] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[37], 10, 7, boardPanel, gameBoardConstraints);
			this.tilePanels[38] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[38], 10, 8, boardPanel, gameBoardConstraints);
			this.tilePanels[39] = vh.createPanel(tHeight, tWidth);
			vh.addComponent(this.tilePanels[39], 10, 9, boardPanel, gameBoardConstraints);
			*/

			gameBoardConstraints.gridheight = 9;
			gameBoardConstraints.gridwidth = 9;
			JPanel mid = vh.createPanel(new GridBagLayout(), Color.BLUE);
			vh.addComponent(mid, 1, 1, boardPanel, gameBoardConstraints);
			
			
			//Create Menu Panel as container of buttons
			JPanel menuPanel = vh.createPanel(new GridBagLayout());
			menuPanel.setOpaque(false);
			vh.addComponent(menuPanel, 0, 0, new Insets(200, 10, 10, 10), controlPanel, new GridBagConstraints());
			//Create Buttons and add to Menu Panel
			GridBagConstraints gbc2 = new GridBagConstraints();
			gbc2.fill = GridBagConstraints.HORIZONTAL;
			gbc2.insets = new Insets(3, 0, 0, 0);
			vh.addComponent(this.getScreenResolutionButton(), 0, 0, menuPanel, gbc2);
			vh.addComponent(this.getNewGame(), 0, 1, menuPanel, gbc2);
			vh.addComponent(this.getIndex(), 0, 2, menuPanel, gbc2);
			vh.addComponent(this.getExitButton(), 0, 3, menuPanel, gbc2);
			
			/* >>>>>>>>>> UPDATE PROGRESS BAR <<<<<<<<<< */
			progressBar.setValue(progressBar.getValue() + 70);
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
