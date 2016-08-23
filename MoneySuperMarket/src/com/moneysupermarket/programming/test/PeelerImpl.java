package com.moneysupermarket.programming.test;

/**
 * Class for peeling apples that are not blue.
 * @author mheyward
 *
 */
public class PeelerImpl implements Peeler {

	/**
	 * Dummy method for peeling an apple.
	 */
	@Override
	public void peel(Apple apple) {
		apple.setPeeled(true);
	}

}
