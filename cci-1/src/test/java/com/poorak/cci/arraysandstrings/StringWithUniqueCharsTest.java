package com.poorak.cci.arraysandstrings;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class StringWithUniqueCharsTest {
	
	private StringWithUniqueChars stringWithUniqueCharsTest;

	@Before
	public void setUp() throws Exception {
		stringWithUniqueCharsTest = new StringWithUniqueChars();
	}

	@Test
	public void testNonUnique() {
		String nonUnique = "abbbbbbb";
		assertFalse(stringWithUniqueCharsTest.hasUniqueChars(nonUnique));
	}
	
	@Test
	public void testUnique() {
		String nonUnique = "abcdefghijklmnop";
		assertTrue(stringWithUniqueCharsTest.hasUniqueChars(nonUnique));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		String text = null;
		assertTrue(stringWithUniqueCharsTest.hasUniqueChars(text));		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testEmpty() {
		String text = "";
		assertTrue(stringWithUniqueCharsTest.hasUniqueChars(text));		
	}
	
	@Test
	public void testOneChar() {
		String text = "a";
		assertTrue(stringWithUniqueCharsTest.hasUniqueChars(text));		
	}
	
	@Test
	public void testReallyLongString() {
		char[] chars = new char[Integer.MAX_VALUE/1000];
		System.out.println(Integer.MAX_VALUE/1000 );
		Arrays.fill(chars, 'a');

		String text = new String(chars);
		
		assertFalse(stringWithUniqueCharsTest.hasUniqueChars(text));		
	}

}
