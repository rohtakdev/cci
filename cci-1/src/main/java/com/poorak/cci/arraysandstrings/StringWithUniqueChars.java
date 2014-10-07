package com.poorak.cci.arraysandstrings;

/**
 * 1.1 Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * @author poorak
 *
 */
public class StringWithUniqueChars {
	
	public boolean hasUniqueChars(String text) {
		if(text ==null || text.isEmpty()){
			throw new IllegalArgumentException("Null or Empty text");
		}
		if(text.length() > 26){
    		return false;
    	}
		char[] chars = text.toCharArray();
		boolean[] charArray = new boolean[256] ;
		
		
		for(char c:chars){
			if(charArray[c] == true){
				return false;
			}
			
			charArray[c] = true;
		}
		
		return true;
	}
	
}
