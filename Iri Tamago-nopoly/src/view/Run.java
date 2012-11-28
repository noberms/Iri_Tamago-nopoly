package view;

import javax.swing.JFrame;

import view.helper.LocationHelper;


public class Run {
	
	public static void main(String[] args) {
		JFrame index = new IndexFrame();
		LocationHelper.getInstance().automateFrameLocation(null, index);
		index.setVisible(true);
	}

}
