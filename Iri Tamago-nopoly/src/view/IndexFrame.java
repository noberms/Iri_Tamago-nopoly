package view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import view.helper.ViewHelper;


public class IndexFrame extends JFrame {
	
	private static final long serialVersionUID = -7576523088264784541L;
	//A New Master Branch
	public static void main(String[] args) {
		JFrame index = new IndexFrame();
		index.setVisible(true);
	}
	
	public IndexFrame() {
		ViewHelper.getInstance().setupLookAndFeel();
		this.setTitle("Iri Tamagonopoly - Index");
		this.setSize(500, 390);
		this.setLocation(ViewHelper.getInstance().getCenterPoint(this.getWidth(), this.getHeight()));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.initComponents();
	}
	
	private void initComponents() {

		ViewHelper vh = ViewHelper.getInstance();
		JPanel menu = vh.createPanel(new GridBagLayout());
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.fill = GridBagConstraints.HORIZONTAL;
		gbc2.insets = new Insets(3, 0, 0, 0);
		
		vh.addComponent(this.createNewGameButton(), 0, 0, menu, gbc2);
		vh.addComponent(this.createTutorialButton(), 0, 1, menu, gbc2);
		vh.addComponent(this.createAboutButton(), 0, 2, menu, gbc2);
		vh.addComponent(this.createExitButton(), 0, 3, menu, gbc2);

		GridBagConstraints gbc1 = new GridBagConstraints();
		JPanel main = vh.createPanel(new GridBagLayout());
		gbc1.gridx = 1;
		gbc1.gridy = 1;
		
		gbc1.insets = new Insets(160, 300, 10, 10);
		main.add(menu, gbc1);
		
		this.add(main);
		
	}
	
	private JButton createNewGameButton() {
		JButton newGame = new JButton("New Game");
		newGame.setFont(new Font("SansSerif", Font.PLAIN, 11));
		newGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				executeNewGame();
			}
		});
		return newGame;
	}
	
	private JButton createTutorialButton() {
		JButton tutorial = new JButton("Tutorial");
		tutorial.setFont(new Font("SansSerif", Font.PLAIN, 11));
		tutorial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				executeTutorial();
			}
		});
		return tutorial;
	}
		
	private JButton createAboutButton() {
		JButton about = new JButton("About Iri Tamago");
		about.setFont(new Font("SansSerif", Font.PLAIN, 11));
		about.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				executeAbout();
			}
		});
		return about;
	}
	
	private JButton createExitButton() {
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
	
	private void executeNewGame() {
		ChooseTokenFrame chooseToken = new ChooseTokenFrame();
		if(!this.getLocation().equals(ViewHelper.getInstance().getCenterPoint(this.getWidth(), this.getHeight()))) {
			chooseToken.setLocation(this.getLocation());
		}
		chooseToken.setVisible(true);
		this.dispose();
	}
	
	private void executeTutorial() {
		JOptionPane.showMessageDialog(null, "This feature is still under construction", "Under Construction", JOptionPane.PLAIN_MESSAGE);
	}
	
	private void executeAbout() {
		JOptionPane.showMessageDialog(null, "This feature is still under construction", "Under Construction", JOptionPane.PLAIN_MESSAGE);
	}
	
	private void executeExit() {
		this.dispose();
	}
	
}
