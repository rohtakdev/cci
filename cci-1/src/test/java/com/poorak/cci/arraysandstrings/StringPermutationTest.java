package com.poorak.cci.arraysandstrings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringPermutationTest {
	
	private StringPermutation stringPermutation;

	@Before
	public void setUp() throws Exception {
		stringPermutation = new StringPermutation();
	}

	@Test
	public void test() {
		String str1 = "poorak";
		String str2 = "karoop";
		
		assertTrue(stringPermutation.checkPermutation(str1, str2));
	}
	@Test
	public void testFail() {
		String str1 = "poorak";
		String str2 = "kroop";
		
		assertFalse(stringPermutation.checkPermutation(str1, str2));
	}

}
