package com.poorak.cci.arraysandstrings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class StringWithAnyRepeatedCharNoDSTest {


	private StringWithAnyRepeatedCharNoDS stringWithAnyRepeatedCharNoDS;

	@Before
	public void setUp() throws Exception {
		stringWithAnyRepeatedCharNoDS = new StringWithAnyRepeatedCharNoDS();
	}

	@Test
	
	public void testNonUnique() {
		String nonUnique = "abbbbbbbbbb";
		assertFalse(stringWithAnyRepeatedCharNoDS.hasRepeatedChar(nonUnique));
	}
	
	@Test
	public void testUnique() {
		String nonUnique = "abcdefghijklmnop";
		assertTrue(stringWithAnyRepeatedCharNoDS.hasRepeatedChar(nonUnique));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		String text = null;
		assertTrue(stringWithAnyRepeatedCharNoDS.hasRepeatedChar(text));		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testEmpty() {
		String text = "";
		assertTrue(stringWithAnyRepeatedCharNoDS.hasRepeatedChar(text));		
	}
	
	@Test
	public void testOneChar() {
		String text = "a";
		assertTrue(stringWithAnyRepeatedCharNoDS.hasRepeatedChar(text));		
	}
	
	@Test
	public void testReallyLongString() {
		char[] chars = new char[Integer.MAX_VALUE/73];
		//System.out.println(Integer.MAX_VALUE/73 * 2);
		Arrays.fill(chars, 'a');

		String text = new String(chars);
		
		assertFalse(stringWithAnyRepeatedCharNoDS.hasRepeatedChar(text));		
	}
}
