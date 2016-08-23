package com.moneysupermarket.programming.test;

/**
 * Class for peeling blue apples
 * @author mheyward
 *
 */
public class ValyrianSteelPeeler implements Peeler {

	/**
	 * Dummy method for peeling an apple
	 */
	@Override
	public void peel(Apple apple) {
		apple.setPeeled(true);
	}

}
