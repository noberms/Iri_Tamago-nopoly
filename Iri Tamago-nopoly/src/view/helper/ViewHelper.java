package view.helper;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class ViewHelper {
	
	private static ViewHelper viewHelper;
	
	private ViewHelper() {
		
	}
	
	public static ViewHelper getInstance() {
		if(viewHelper == null) {
			viewHelper = new ViewHelper();
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
	
	public Point getCenterPoint(int componentWidth, int componentHeight) {
		int screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int screenHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		return new Point((screenWidth - componentWidth) / 2, (screenHeight - componentHeight) / 2);
	}
	
}
