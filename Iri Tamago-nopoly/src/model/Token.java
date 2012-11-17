package model;

public class Token {
	
	private final String image;
	private final String imageMoving;
	private int position;
	
	public Token() {
		this.image = "";
		this.imageMoving = "";
		this.position = 0;
	}
	
	public Token(String image) {
		this.image = image;
		this.imageMoving = "";
		this.position = 0;
	}
	
	public Token(String image, String imageMoving) {
		this.image = image;
		this.imageMoving = imageMoving;
		this.position = 0;
	}
	
	public String getImage() {
		return image;
	}
	
	public String getImageMoving() {
		return imageMoving;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
}
