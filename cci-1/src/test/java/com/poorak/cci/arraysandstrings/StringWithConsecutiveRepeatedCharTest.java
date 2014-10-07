package com.poorak.cci.arraysandstrings;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class StringWithConsecutiveRepeatedCharTest {

	private StringWithConsecutiveRepeatedChar stringWithUniquConsecutiveRepeatedChar;

	@Before
	public void setUp() throws Exception {
		stringWithUniquConsecutiveRepeatedChar = new StringWithConsecutiveRepeatedChar();
	}

	@Test
	public void testNonUnique() {
		String nonUnique = "abbbbbbb";
		assertFalse(stringWithUniquConsecutiveRepeatedChar.hasConsecutiveRepeadtedChar(nonUnique));
	}
	
	@Test
	public void testUnique() {
		String nonUnique = "abcdefghijklmnop";
		assertTrue(stringWithUniquConsecutiveRepeatedChar.hasConsecutiveRepeadtedChar(nonUnique));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		String text = null;
		assertTrue(stringWithUniquConsecutiveRepeatedChar.hasConsecutiveRepeadtedChar(text));		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testEmpty() {
		String text = "";
		assertTrue(stringWithUniquConsecutiveRepeatedChar.hasConsecutiveRepeadtedChar(text));		
	}
	
	@Test
	public void testOneChar() {
		String text = "a";
		assertTrue(stringWithUniquConsecutiveRepeatedChar.hasConsecutiveRepeadtedChar(text));		
	}
	
	@Test
	public void testReallyLongString() {
		char[] chars = new char[Integer.MAX_VALUE/73];
		//System.out.println(Integer.MAX_VALUE/73 * 2);
		Arrays.fill(chars, 'a');

		String text = new String(chars);
		
		assertFalse(stringWithUniquConsecutiveRepeatedChar.hasConsecutiveRepeadtedChar(text));		
	}


}
