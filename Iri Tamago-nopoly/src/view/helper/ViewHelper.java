package view.helper;

import java.awt.Color;
import java.awt.Dimension;

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
	
	public JPanel createSquareJPanel(Color color) {
        JPanel tempPanel = new JPanel();
        if(color != null) {
        	tempPanel.setBackground(color);
        }
        return tempPanel;
    }
	
	public JPanel createSquareJPanel(Color color, int size) {
        JPanel tempPanel = new JPanel();
        if(color != null) {
        	tempPanel.setBackground(color);
        }
        tempPanel.setMinimumSize(new Dimension(size, size));
        tempPanel.setMaximumSize(new Dimension(size, size));
        tempPanel.setPreferredSize(new Dimension(size, size));
        return tempPanel;
    }
	
	public JPanel createSquareJPanel(Color color, int width, int height) {
        JPanel tempPanel = new JPanel();
        if(color != null) {
        	tempPanel.setBackground(color);
        }
        tempPanel.setMinimumSize(new Dimension(width, height));
        tempPanel.setMaximumSize(new Dimension(width, height));
        tempPanel.setPreferredSize(new Dimension(width, height));
        return tempPanel;
    }
	
}
