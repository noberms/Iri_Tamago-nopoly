package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import view.helper.LocationHelper;
import view.helper.ViewHelper;
import view.modifiedComponents.BackgroundPanel;
import view.modifiedComponents.DeedDialog;
import view.modifiedComponents.TilePanel;


public class GameBoardFrame extends JFrame implements MouseListener {
	
	private static final long serialVersionUID = -1406077166444402338L;
	private TilePanel[] tilePanels = new TilePanel[40];
	
	public GameBoardFrame(JProgressBar progressBar) {
		this.setTitle("Iri Tamagonopoly - Game Board");
		int height = 588;
		int width = 722;
		this.setSize(width, height);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* >>>>>>>>>> UPDATE PROGRESS BAR <<<<<<<<<< */
		progressBar.setValue(progressBar.getValue() + 10);
		
		this.initComponents(progressBar);
	}
	
	private void initComponents(JProgressBar progressBar) {
		ViewHelper vh = ViewHelper.getInstance();
		
		//Create Main Gameboard Panel where the board and control panels are added
		JPanel gameBoardPanel = vh.createPanel(new GridBagLayout());
		gameBoardPanel.setBackground(Color.WHITE);
		this.getContentPane().add(gameBoardPanel);
		
		//Create Board Panel where the board tiles are added
		Image image = null;
		try {
			image = ImageIO.read(new File("images/Board.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		BackgroundPanel boardPanel = new BackgroundPanel(image, BackgroundPanel.ACTUAL, 0.0f, 0.0f);
		boardPanel.setSize(554, 554);
		boardPanel.setLayout(new GridBagLayout());
		
		//Create Control Panel where all control buttons are added
		JPanel controlPanel = vh.createPanel(Color.WHITE, 161, 554);
		controlPanel.setLayout(new GridBagLayout());
		
		//Add board and control panels to the gameboard panel
		GridBagConstraints mainConstraint = new GridBagConstraints();
		vh.addComponent(boardPanel, 0, 0, gameBoardPanel, mainConstraint);
		vh.addComponent(controlPanel, 1, 0, gameBoardPanel, mainConstraint);
		/* >>>>>>>>>> UPDATE PROGRESS BAR <<<<<<<<<< */
		progressBar.setValue(progressBar.getValue() + 10);
		
		this.createBoardPanel(boardPanel);
		progressBar.setValue(progressBar.getValue() + 10);
		//System.out.println("Created Tiles for Board Panel");
		
		this.createMenuPanel(controlPanel);
		progressBar.setValue(progressBar.getValue() + 60);
		//System.out.println("Created Menu Panel");
	}
	
	private void createBoardPanel(JPanel boardPanel) {
		int tWidth = 45, tHeight = 75;
		int gridx = 10, gridy = 10;
		ViewHelper vh = ViewHelper.getInstance();
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
			
			this.tilePanels[i].addMouseListener(this);
			
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
	}
		
	private void createMenuPanel(JPanel controlPanel) {
		ViewHelper vh = ViewHelper.getInstance();
		/*
		gameBoardConstraints.gridheight = 9;
		gameBoardConstraints.gridwidth = 9;
		JPanel mid = vh.createPanel(new GridBagLayout(), Color.BLUE);
		vh.addComponent(mid, 1, 1, boardPanel, gameBoardConstraints);
		*/
		//Create Menu Panel as container of buttons
		JPanel menuPanel = vh.createPanel(new GridBagLayout());
		menuPanel.setOpaque(false);
		vh.addComponent(menuPanel, 0, 0, new Insets(200, 10, 10, 10), controlPanel, new GridBagConstraints());
		//Create Buttons and add to Menu Panel
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.fill = GridBagConstraints.HORIZONTAL;
		gbc2.insets = new Insets(3, 0, 0, 0);
		vh.addComponent(this.getScreenResolutionButton(), 0, 0, menuPanel, gbc2);
		vh.addComponent(this.getLocationButton(), 0, 1, menuPanel, gbc2);
		vh.addComponent(this.getNewGame(), 0, 2, menuPanel, gbc2);
		vh.addComponent(this.getIndex(), 0, 3, menuPanel, gbc2);
		vh.addComponent(this.getExitButton(), 0, 4, menuPanel, gbc2);
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
	
	private JButton getLocationButton() {
		JButton location = new JButton("Location");
		location.setFont(new Font("SansSerif", Font.PLAIN, 11));
		location.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				executeLocation();
			}
		});
		return location;
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
	
	private void executeLocation() {
		Point point = this.getLocation();
		JOptionPane.showMessageDialog(null, "Location is (" + point.x + ", " + point.y + ")", "Location", JOptionPane.PLAIN_MESSAGE);
	}
	
	private void executeNewGame() {
		ChooseTokenFrame chooseToken = new ChooseTokenFrame();
		LocationHelper.getInstance().automateFrameLocation(this, chooseToken);
		chooseToken.setVisible(true);
		this.dispose();
	}
	
	private void executeIndex() {
		IndexFrame index = new IndexFrame();
		LocationHelper.getInstance().automateFrameLocation(this, index);
		index.setVisible(true);
		this.dispose();
	}
	
	private void executeExit() {
		this.dispose();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
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
			LocationHelper.getInstance().automateDeedDialogLocation(this, deedDialog);
			deedDialog.setVisible(true);
		}
		else {
			//JOptionPane.showMessageDialog(null, "Not yet available", "Tile Info", JOptionPane.PLAIN_MESSAGE);
			JOptionPane optionPane = new JOptionPane("Its me",
										JOptionPane.PLAIN_MESSAGE,
										JOptionPane.DEFAULT_OPTION,
										null, 
										null, 
										"Pleas ENTER your NAME here");
			optionPane.setWantsInput(true);             
	        JDialog dialog = optionPane.createDialog(null, "TEST");
	        LocationHelper.getInstance().automateDeedDialogLocation(this, dialog);
	        //dialog.setLocation(10, 20);
	        dialog.setVisible(true);
	        System.out.println(optionPane.getInputValue());
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
}
