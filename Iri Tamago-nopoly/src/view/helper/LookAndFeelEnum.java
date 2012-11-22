package view.helper;

public enum LookAndFeelEnum {
	METAL("com.sun.java.swing.plaf.metal.MetalLookAndFeel"),
	NIMBUS("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"),
	MOTIF("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
	
	private final String path;
	
	LookAndFeelEnum(String path) {
		this.path = path;
	}
	
	public String path(){return this.path;}
}
