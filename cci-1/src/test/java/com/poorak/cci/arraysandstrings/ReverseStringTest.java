package com.poorak.cci.arraysandstrings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {
	
	private ReverseString reverseString;

	@Before
	public void setUp() throws Exception {
		reverseString = new ReverseString();
	}

	@Test
	public void test() {
		String test = "poorak";
		String result = "karoop";
		assertEquals(result, reverseString.reverse(test.toCharArray()));
	}

}
