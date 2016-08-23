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
	public void testTasteInRange() {
		TasteOutOfRangeException ex = null;
		try {
			testObj = new Apple("green", 10.00, 1, false);
		} catch(TasteOutOfRangeException e) {
			ex = e;
		}
		assertNull(ex);
	}
	
	@Test(expected = TasteOutOfRangeException.class)
	public void testTasteOutOfRange() throws TasteOutOfRangeException {
		testObj = new Apple("green", 10.00, 0, false);
	}

}
