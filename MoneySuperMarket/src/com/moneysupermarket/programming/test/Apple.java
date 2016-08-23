package com.moneysupermarket.programming.test;

public class Apple {
	
	private String colour;
	private double weight;
	private int taste;
	private boolean worm;
	
	public Apple(String colour, double weight, int taste, boolean worm) throws TasteOutOfRangeException {
		setColour(colour);
		setWeight(weight);
		setTaste(taste);
		setWorm(worm);
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getTaste() {
		return taste;
	}
	
	public void setTaste(int taste) throws TasteOutOfRangeException {
		if(taste > 0 && taste < 5) {
			this.taste = taste;
		} else {
			throw new TasteOutOfRangeException("Taste out of range. Permitted values 1 to 4");
		}
	}
	
	public boolean isWorm() {
		return worm;
	}
	
	public void setWorm(boolean worm) {
		this.worm = worm;
	}
	
	
	
}
