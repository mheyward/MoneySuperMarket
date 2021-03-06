package com.moneysupermarket.programming.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AppleTest {
	
	private Apple testObj;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTasteInRange() throws InvalidWeightException, InvalidColourException {
		TasteOutOfRangeException ex = null;
		try {
			testObj = new Apple("green", 10.00, 1, false);
		} catch(TasteOutOfRangeException e) {
			ex = e;
		}
		assertNull(ex);
	}
	
	@Test(expected = TasteOutOfRangeException.class)
	public void testTasteOutOfRangeWhenBelowMin() throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		testObj = new Apple("green", 10.00, 0, false);
	}
	
	@Test(expected = TasteOutOfRangeException.class)
	public void testTasteOutOfRangeWhenAboveMax() throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		testObj = new Apple("green", 10.00, 5, false);
	}
	
	@Test
	public void testValidWeight() throws TasteOutOfRangeException, InvalidColourException {
		InvalidWeightException ex = null;
		try {
			testObj = new Apple("green", 10.00, 1, false);
		} catch(InvalidWeightException e) {
			ex = e;
		}
		assertNull(ex);
	}
	
	@Test(expected = InvalidWeightException.class)
	public void testInvalidWeightWhenBelowMin() throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		testObj = new Apple("green", 9.99, 1, false);
	}
	
	@Test(expected = InvalidWeightException.class)
	public void testInvalidWeightWhenAboveMax() throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		testObj = new Apple("green", 100.01, 1, false);
	}
	
	@Test
	public void testValidColour() throws TasteOutOfRangeException, InvalidWeightException {
		InvalidColourException ex = null;
		try {
			testObj = new Apple("green", 10.00, 1, false);
		} catch(InvalidColourException e) {
			ex = e;
		}
		assertNull(ex);
	}
	
	@Test(expected = InvalidColourException.class)
	public void testInvalidColour() throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		testObj = new Apple("pink", 10.00, 1, false);
	}
	
	@Test
	public void testAppleCanBeEaten() throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		testObj = new Apple("green", 10.00, 1, false, false, true);
		testObj.eatApple();
		assertTrue(testObj.isEaten());
	}
	
	@Test
	public void testAppleCannotBeEatenAsNotPeeled() throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		testObj = new Apple("green", 10.00, 1, false, false, false);
		testObj.eatApple();
		assertFalse(testObj.isEaten());
	}
	
	@Test
	public void testAppleCannotBeEatenAsAlreadyEaten() throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		testObj = new Apple("green", 10.00, 1, false, true, true);
		testObj.eatApple();
		assertFalse(testObj.isEaten());
	}
		
	
	@Test
	public void testAppleCanBePeeled() throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		testObj = new Apple("green", 10.00, 4, false, false, false);
		testObj.peelApple();
		assertTrue(testObj.isPeeled());
	}
	
	@Test
	public void testAppleCannotBePeeledAsHasWorm() throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		testObj = new Apple("green", 10.00, 4, true, false, false);
		testObj.peelApple();
		assertFalse(testObj.isPeeled());
	}
	
	@Test
	public void testAppleCannotBePeeledAsTasteIsNotGreaterThan3() throws TasteOutOfRangeException, InvalidWeightException, InvalidColourException {
		testObj = new Apple("green", 10.00, 3, false, false, false);
		testObj.peelApple();
		assertFalse(testObj.isPeeled());
	}
}
