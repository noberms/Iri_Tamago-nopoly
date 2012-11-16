package model;

import java.util.Random;

public class Dice {
	
	int[] dice;
	private boolean alwaysDoubles;
	private boolean neverDoubles;
	private Random random;
	
	public Dice() {
		this.dice = new int[2];
		this.alwaysDoubles = false;
		this.neverDoubles = false;
		this.random = new Random();
	}

	public int[] getDice() {
		return dice;
	}

	public void setDice(int[] dice) {
		this.dice = dice;
	}

	public boolean isAlwaysDoubles() {
		return alwaysDoubles;
	}

	public void setAlwaysDoubles(boolean alwaysDoubles) {
		this.alwaysDoubles = alwaysDoubles;
	}

	public boolean isNeverDoubles() {
		return neverDoubles;
	}

	public void setNeverDoubles(boolean neverDoubles) {
		this.neverDoubles = neverDoubles;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}
	
}
