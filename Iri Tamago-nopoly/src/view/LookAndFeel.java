package view;

public enum LookAndFeel {
	METAL("com.sun.java.swing.plaf.metal.MetalLookAndFeel"),
	NIMBUS("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"),
	MOTIF("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
	
	private final String path;
	
	LookAndFeel(String path) {
		this.path = path;
	}
	
	public String path(){return this.path;}
}
