package com.poorak.cci.arraysandstrings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckRotationTest {
	
	private CheckRotation checkRotation;

	@Before
	public void setUp() throws Exception {
		checkRotation = new CheckRotation();
	}

	@Test
	public void test() {
		assertTrue(checkRotation.rotation("waterbottle", "erbottlewat"));
	}
	@Test
	public void testFail() {
		assertFalse(checkRotation.rotation("waterbotle", "erbottlewat"));
	}

}
