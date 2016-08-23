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
	public static final double MIN_TASTE = 1;
	public static final double MAX_TASTE = 4;
	public static final double MIN_TASTE_FOR_PEELING = 3;
	
	private String colour;
	private double weight;
	private int taste;
	private boolean worm;
	private boolean peeled;
	private boolean eaten;
	private List<String> validColours = (List<String>) Arrays.asList("green", "red", "blue");
	private PeelerFactory peelerFactory;
	
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
		peelerFactory = new PeelerFactory();
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
		if(taste >= MIN_TASTE && taste <= MAX_TASTE) {
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

	/**
	 * Accessor for valid colourd
	 * @return List of colour strings
	 */
	public List<String> getValidColours() {
		return validColours;
	}

	/**
	 * Mutator foe valid colours
	 * @param validColours
	 */
	public void setValidColours(List<String> validColours) {
		this.validColours = validColours;
	}

	/**
	 * Accessor for peeled
	 * @return true if peeled, false otherwise.
	 */
	public boolean isPeeled() {
		return peeled;
	}

	/**
	 * Mutator for peeled
	 * @param peeled
	 */
	public void setPeeled(boolean peeled) {
		this.peeled = peeled;
	}

	/**
	 * Accessor for eaten
	 * @return true if eaten, false otherwise.
	 */
	public boolean isEaten() {
		return eaten;
	}

	/**
	 * Mutator for eaten
	 * @param eaten
	 */
	public void setEaten(boolean eaten) {
		this.eaten = eaten;
	}
	
	/**
	 * Method to determine if apple can be eaten. If peeled and not already eaten it can be eaten.
	 */
	public void eatApple() {
		eaten = peeled && !eaten ? true : false;
	}
	
	public void peelApple() {
		if(!worm && taste > MIN_TASTE_FOR_PEELING) {
			Peeler peeler = peelerFactory.getPeeler(getColour());
			peeler.peel(this);
		}
	}
}
