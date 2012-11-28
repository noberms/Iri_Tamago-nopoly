package view;

import javax.swing.JFrame;

import view.helper.ViewHelper;

public class Run {
	
	public static void main(String[] args) {
		JFrame index = new IndexFrame();
		ViewHelper.getInstance().setChildLocation(null, index);
		index.setVisible(true);
	}

}
