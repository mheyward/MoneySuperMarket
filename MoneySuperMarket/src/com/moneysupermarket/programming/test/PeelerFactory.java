package com.moneysupermarket.programming.test;

/**
 * Factory class to return correct peeler based on apple colour.
 * @author mheyward
 *
 */
public class PeelerFactory {
	
	/**
	 * Peeler factor method.
	 * @param appleColour
	 * @return Appropriate Peeler for apple colour
	 */
	public Peeler getPeeler(String appleColour) {
		return appleColour.equals("blue") ? new ValyrianSteelPeeler() : new PeelerImpl();
	}

}
