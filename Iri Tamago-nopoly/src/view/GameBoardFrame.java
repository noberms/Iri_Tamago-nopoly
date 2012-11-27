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
import view.helper.TilePanel;
import view.helper.ViewHelper;


public class GameBoardFrame extends JFrame {
	
	private static final long serialVersionUID = -1406077166444402338L;
	private TilePanel[] tilePanels = new TilePanel[40];
	
	public GameBoardFrame(JProgressBar progressBar) {
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
			gameBoardPanel.setBackground(Color.WHITE);
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
						this.tilePanels[i] = vh.createTilePanel(i, tWidth, tHeight);
					}else if(i<20&&i>10 || i<40&&i>30) {
						this.tilePanels[i] = vh.createTilePanel(i, tHeight, tWidth);
					}
				}else {
					this.tilePanels[i] = vh.createTilePanel(i, tHeight);
				}
				
				this.tilePanels[i].addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						//JOptionPane.showMessageDialog(null, "You pressed " + Board.getInstance().getTile(((TilePanel)e.getSource()).getIndex()).getName(), "Location", JOptionPane.PLAIN_MESSAGE);
						int index = ((TilePanel)e.getSource()).getIndex();
						Image image = null;
						try {
							image = ImageIO.read(new File("images/deeds/" + index + ".png"));
						} catch (IOException ioe) {
							image = null;
						}
						
						if(image != null) {
							image = null;
							DeedDialog deedDialog = new DeedDialog(index);
							deedDialog.setVisible(true);
						}
						else {
							JOptionPane.showMessageDialog(null, "Not yet available", "Tile Info", JOptionPane.PLAIN_MESSAGE);
						}
						
					}
					
				});
				
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
			/* >>>>>>>>>> UPDATE PROGRESS BAR <<<<<<<<<< */
			progressBar.setValue(progressBar.getValue() + 10);
			
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
			progressBar.setValue(progressBar.getValue() + 60);
		}
	}
	
	private JButton getScreenResolutionButton() {
		JButton screenResolution = new JButton("Screen Resolution");
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
		ChooseTokenFrame chooseToken = new ChooseTokenFrame();
		chooseToken.setVisible(true);
		this.dispose();
	}
	
	private void executeIndex() {
		IndexFrame index = new IndexFrame();
		index.setVisible(true);
		this.dispose();
	}
	
	private void executeExit() {
		this.dispose();
	}
	
}
