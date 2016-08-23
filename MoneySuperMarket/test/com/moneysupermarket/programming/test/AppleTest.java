package com.moneysupermarket.programming.test;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class AppleTest {
	
	private Apple testObj;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTasteInRange() throws InvalidWeightException {
		TasteOutOfRangeException ex = null;
		try {
			testObj = new Apple("green", 10.00, 1, false);
		} catch(TasteOutOfRangeException e) {
			ex = e;
		}
		assertNull(ex);
	}
	
	@Test(expected = TasteOutOfRangeException.class)
	public void testTasteOutOfRange() throws TasteOutOfRangeException, InvalidWeightException {
		testObj = new Apple("green", 10.00, 0, false);
	}
	
	@Test
	public void testValidWeight() throws TasteOutOfRangeException {
		InvalidWeightException ex = null;
		try {
			testObj = new Apple("green", 10.00, 1, false);
		} catch(InvalidWeightException e) {
			ex = e;
		}
		assertNull(ex);
	}
	
	@Test(expected = InvalidWeightException.class)
	public void testInvalidWeight() throws TasteOutOfRangeException, InvalidWeightException {
		testObj = new Apple("green", 9.99, 0, false);
	}

}
