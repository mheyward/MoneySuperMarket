package com.moneysupermarket.programming.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PeelerFactoryTest {
	
	private PeelerFactory testObj;
	
	@Before
	public void setUp() throws Exception {
		testObj = new PeelerFactory();
	}
	
	@Test
	public void testPeelerFactoryReturnsValyrianSteelPeelerWhenAppleIsBlue() {
		Peeler result = testObj.getPeeler("blue");
		
		assertTrue(result instanceof ValyrianSteelPeeler);
	}
	
	@Test
	public void testPeelerFactoryReturnsPeelerImplWhenAppleIsNotBlue() {
		Peeler result = testObj.getPeeler("green");
		
		assertTrue(result instanceof PeelerImpl);
	}

}
