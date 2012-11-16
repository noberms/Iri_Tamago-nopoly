package model;

public class Token {
	
	private String image;
	private String imageMoving;
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
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getImageMoving() {
		return imageMoving;
	}
	
	public void setImageMoving(String imageMoving) {
		this.imageMoving = imageMoving;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
}
