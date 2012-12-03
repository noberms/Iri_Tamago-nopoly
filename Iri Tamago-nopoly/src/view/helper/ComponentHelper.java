package view.helper;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;

import model.Board;

import view.modifiedComponents.BackgroundPanel;
import view.modifiedComponents.TilePanel;

public class ComponentHelper {
	
	private static ComponentHelper viewHelper;
	
	private ComponentHelper() {
		
	}
	
	public static ComponentHelper getInstance() {
		if(viewHelper == null) {
			viewHelper = new ComponentHelper();
		}
		return viewHelper;
	}
	
	public void setupLookAndFeel() {
		try {
			UIManager.setLookAndFeel(LookAndFeelEnum.NIMBUS.path());
		} catch(Exception e) {}
	}
	
	public JPanel createPanel() {
		return new JPanel();
	}
	
	public JPanel createPanel(GridBagLayout gbl) {
		return new JPanel(gbl);
	}
	
	public JPanel createPanel(GridBagLayout gbl, Color color) {
		JPanel tempPanel = new JPanel(gbl);
		if(color != null) {
			tempPanel.setBackground(color);
		}
		return tempPanel;
	}
	
	public JPanel createPanel(Color color) {
        JPanel tempPanel = new JPanel();
        if(color != null) {
        	tempPanel.setBackground(color);
        }
        return tempPanel;
    }
	
	public JPanel createPanel(Color color, int size) {
        return this.createPanel(color, size, size);
    }
	
	public JPanel createPanel(Color color, int width, int height) {
        JPanel tempPanel = new JPanel();
        if(color != null) {
        	tempPanel.setBackground(color);
        }
        tempPanel.setMinimumSize(new Dimension(width, height));
        tempPanel.setMaximumSize(new Dimension(width, height));
        tempPanel.setPreferredSize(new Dimension(width, height));
        return tempPanel;
    }
	
	public TilePanel createTilePanel(int index, int size) {
		return this.createTilePanel(index, size, size);
	}
	
	public TilePanel createTilePanel(int index, int width, int height) {
		TilePanel tempPanel = new TilePanel(index);
		tempPanel.setMinimumSize(new Dimension(width, height));
		tempPanel.setMaximumSize(new Dimension(width, height));
		tempPanel.setPreferredSize(new Dimension(width, height));
		tempPanel.setOpaque(false);
		return tempPanel;
	}
	
	public void addComponent(JComponent component, int gridx, int gridy, JComponent base, GridBagConstraints constraints) {
		constraints.gridx = gridx;
		constraints.gridy = gridy;
		base.add(component, constraints);
	}
	
	public void addComponent(JComponent component, int gridx, int gridy, Insets insets, JComponent base, GridBagConstraints constraints) {
		constraints.insets = insets;
		this.addComponent(component, gridx, gridy, base, constraints);
	}
	
	public void createDeedDialog(Component parent, int index) {
		
		final class TileDialog extends JDialog {
			
			private static final long serialVersionUID = -7368844749912731622L;
			
			public TileDialog(int index) {
				String name = Board.getInstance().getTile(index).getName();
				this.setTitle(name);
				this.setModal(true);
				this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				this.initComponents(index);
			}
			
			private void initComponents(int index) {
				BufferedImage image = null;
				int width=0, height=0;
				try {
					image = ImageIO.read(new File("images/deeds/" + index + ".png"));
					width = image.getWidth();
					height = image.getHeight();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				if(width>0 && height>0) {
					this.setSize(width+6, height+50);
					this.setResizable(false);
				}
				
				BackgroundPanel backgroundPanel = null;
				if(image != null) {
					backgroundPanel = new BackgroundPanel(image, BackgroundPanel.ACTUAL, 0.0f, 0.0f);
					backgroundPanel.setPaint(Color.WHITE);
					this.add(backgroundPanel);
				}
			}
			
		}
		
		TileDialog tileDialog = new TileDialog(index);
		LocationHelper.getInstance().automateDeedDialogLocation(parent, tileDialog);
		tileDialog.setVisible(true);
		
	}
	
}
