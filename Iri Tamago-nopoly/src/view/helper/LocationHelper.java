package view.helper;

import java.awt.Component;
import java.awt.Point;
import java.awt.Toolkit;


public class LocationHelper {
	
	private static LocationHelper locationHelper;
	
	private LocationHelper() {
		
	}
	
	public static LocationHelper getInstance() {
		if(locationHelper == null) {
			locationHelper = new LocationHelper();
		}
		return locationHelper;
	}
	
	public Point getScreenCenter(Component component) {
		int componentWidth = component.getWidth();
		int componentHeight = component.getHeight();
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		return new Point((screenWidth - componentWidth) / 2, (screenHeight - componentHeight) / 2);
	}
	
	public Point getTrueCenter(Component component) {
		int componentWidth = component.getWidth();
		int componentHeight = component.getHeight();
		Point location = component.getLocation();
		return new Point(location.x + (componentWidth / 2), location.y + (componentHeight / 2));
	}
	
	public void automateDeedDialogLocation(Component parent, Component child) {
		this.automateFrameLocation(parent, child, -80, 15);
	}
	
	public void automateFrameLocation(Component parent, Component child) {
		this.automateFrameLocation(parent, child, 0);
	}
	
	public void automateFrameLocation(Component parent, Component child, int offset) {
		this.automateFrameLocation(parent, child, offset, offset);
	}
	
	public void automateFrameLocation(Component parent, Component child, int xOffset, int yOffset) {
		
		if(parent != null) {
			if(parent.getLocation().equals(this.getScreenCenter(parent))) {
				child.setLocation(this.getScreenCenter(child).x + xOffset, this.getScreenCenter(child).y + yOffset);
			}
			else {
				Point trueCenter = this.getTrueCenter(parent);
				int x = (trueCenter.x + xOffset) - (child.getWidth() / 2);
				int y = (trueCenter.y + yOffset) - (child.getHeight() / 2);
				int screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
				int screenHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
				
				if(x < 0) {
					x = 0;
				}
				if(y < 0) {
					y = 0;
				}
				if(x + (child.getWidth() / 2) > screenWidth) {
					//If child frame 
					x = screenWidth - child.getWidth();
				}
				if(y + (child.getWidth() / 2) > screenHeight) {
					y = screenHeight - child.getHeight();
				}
				child.setLocation(x, y);
			}
		}
		else {
			child.setLocation(this.getScreenCenter(child));
		}
	}
	
}
