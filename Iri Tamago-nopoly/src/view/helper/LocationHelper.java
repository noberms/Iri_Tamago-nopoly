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
	
	public Point getCenterLocation(int componentWidth, int componentHeight) {
		int screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int screenHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		return new Point((screenWidth - componentWidth) / 2, (screenHeight - componentHeight) / 2);
	}
	
	public void automateLocation(Component parent, Component child) {
		
		if(parent != null) {
			if(parent.getLocation().equals(this.getCenterLocation(parent.getWidth(), parent.getHeight()))) {
				System.out.println("Inherit Center Location");
				child.setLocation(this.getCenterLocation(child.getWidth(), child.getHeight()));
			}
			else {
				System.out.println("Inherit Modified Location");
				int x = parent.getLocation().x;
				int y = parent.getLocation().y;
				int screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
				int screenHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
				
				if(parent.getLocation().x <= 0) {
					x = 0;
				}
				if(parent.getLocation().y <= 0) {
					y = 0;
				}
				if(parent.getLocation().x + child.getWidth() > screenWidth) {
					//If child frame 
					x = screenWidth - child.getWidth();
				}
				if(parent.getLocation().y + child.getWidth() > screenHeight) {
					y = screenHeight - child.getHeight();
				}
				child.setLocation(x, y);
			}
		}
		else {
			System.out.println("Parent is null, set Center Location");
			child.setLocation(this.getCenterLocation(child.getWidth(), child.getHeight()));
		}
	}
	
}
