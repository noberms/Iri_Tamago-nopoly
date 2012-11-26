package view.helper;

import javax.swing.JPanel;

public class TilePanel extends JPanel {
	
	private static final long serialVersionUID = -4876216810494968020L;
	
	private final int index;
	
	public TilePanel(int index) {
		super();
		this.index = index;
	}
	
	public int getIndex() {
		return this.index;
	}
}
