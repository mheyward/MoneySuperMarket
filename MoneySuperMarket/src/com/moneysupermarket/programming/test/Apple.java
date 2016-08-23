package com.moneysupermarket.programming.test;

import java.util.Arrays;
import java.util.List;

/**
 * Class representing an apple. Has weight and taste validation.
 * @author mheyward
 *
 */
public class Apple {
	
	public static final double MIN_WEIGHT = 10;
	public static final double MAX_WEIGHT = 100;
	
	private String colour;
	private double weight;
	private int taste;
	private boolean worm;
	private boolean peeled;
	private boolean eaten;
	private List<String> validColours = (List<String>) Arrays.asList("green", "red", "blue");
	
	/**
	 * Constructor for an apple.
	 * @param colour
	 * @param weight
	 * @param taste
	 * @param worm
	 * @throws TasteOutOfRangeException if taste in not between 11 and 4
	 * @throws InvalidWeightException if weight is not beween 10.00 and 100.00
	 * @throws InvalidColourException if colour is not green, red or blue
	 */
	public Apple(String colour, double weight, int taste, boolean worm) throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		setColour(colour);
		setWeight(weight);
		setTaste(taste);
		setWorm(worm);
	}
	
	/**
	 * Constructor for an apple with added boolean members eaten and peeled
	 * @param colour
	 * @param weight
	 * @param taste
	 * @param worm
	 * @param eaten
	 * @param peeled
	 * @throws TasteOutOfRangeException
	 * @throws InvalidWeightException
	 * @throws InvalidColourException
	 */
	public Apple(String colour, double weight, int taste, boolean worm, boolean eaten, boolean peeled) throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		this(colour, weight, taste, worm);
		setEaten(eaten);
		setPeeled(peeled);
	}
	
	/**
	 * Accessor for colour
	 * @return Sting colour
	 */
	public String getColour() {
		return colour;
	}
	
	/**
	 * Mutator for colour
	 * @throws InvalidColourException when colour is invalid
	 */
	public void setColour(String colour) throws InvalidColourException {
		for (String validColour : validColours) {
			if(validColour.equals(colour)) {
				this.colour = colour;
				break;
			} else {
				throw new InvalidColourException(colour +  "is not valid. Please choose from " + validColours);
			}
		}
	}
	
	/**
	 * Accessor for weight
	 * @return double weight
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * Mutator for weight
	 * @param weight
	 * @throws InvalidWeightException if weight is not between 10.00 and 100.00
	 */
	public void setWeight(double weight) throws InvalidWeightException {
		if(weight >= MIN_WEIGHT && weight <= MAX_WEIGHT) {
			this.weight = weight;
		} else {
			throw new InvalidWeightException("Invalid weight. Must be between " + MIN_WEIGHT + " and" + MAX_WEIGHT);
		}
	}
	
	/**
	 * Accessor for taste
	 * @return int taste
	 */
	public int getTaste() {
		return taste;
	}
	
	/**
	 * Mutator for taste
	 * @param taste
	 * @throws TasteOutOfRangeException if taste is not between 1 and 4
	 */
	public void setTaste(int taste) throws TasteOutOfRangeException {
		if(taste > 0 && taste < 5) {
			this.taste = taste;
		} else {
			throw new TasteOutOfRangeException("Taste out of range. Permitted values 1 to 4");
		}
	}
	
	/**
	 * Accessor for worm 
	 * @return true if a worm is present and false otherwise
	 */
	public boolean isWorm() {
		return worm;
	}
	
	/**
	 * Mutator for worm
	 * @param worm
	 */
	public void setWorm(boolean worm) {
		this.worm = worm;
	}

	public List<String> getValidColours() {
		return validColours;
	}

	public void setValidColours(List<String> validColours) {
		this.validColours = validColours;
	}

	public boolean isPeeled() {
		return peeled;
	}

	public void setPeeled(boolean peeled) {
		this.peeled = peeled;
	}

	public boolean isEaten() {
		return eaten;
	}

	public void setEaten(boolean eaten) {
		this.eaten = eaten;
	}
}
