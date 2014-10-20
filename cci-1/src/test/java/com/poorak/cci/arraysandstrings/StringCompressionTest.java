package com.poorak.cci.arraysandstrings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCompressionTest {
	
	private StringCompression stringCompression;

	@Before
	public void setUp() throws Exception {
		stringCompression = new StringCompression();
	}

	@Test
	public void test() {
		String input = "aabcccccaaa";
		String result = "a2b1c5a3";
		
		assertEquals(result, stringCompression.compress(input));
	}
	
	@Test
	public void testSameLength() {
		String input = "aabbcc";
		String result = "aabbcc";
		
		assertEquals(result, stringCompression.compress(input));
	}

}
