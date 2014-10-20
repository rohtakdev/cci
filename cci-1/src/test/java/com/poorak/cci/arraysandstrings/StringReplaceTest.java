package com.poorak.cci.arraysandstrings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringReplaceTest {

	private StringReplace stringReplace;
	
	@Before
	public void setUp() throws Exception {
		stringReplace = new StringReplace();
	}

	@Test
	public void test() {
		String test= "Mr John Smith    ";
		String result ="Mr%20John%20Smith";
		assertEquals(result, stringReplace.replace(test));
	}
	@Test
	public void testEmpty() {
		String test= "";
		String result ="";
		assertEquals(result, stringReplace.replace(test));
	}
	@Test
	public void testWithoutSpace() {
		String test= "aaaaaaaa";
		String result ="aaaaaaaa";
		assertEquals(result, stringReplace.replace(test));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testWithoutTrailingSpace() {
		String test= "aaa aaaaa";
		String result ="aaaaaaaa";
		assertEquals(result, stringReplace.replace(test));
	}
	
	

}
