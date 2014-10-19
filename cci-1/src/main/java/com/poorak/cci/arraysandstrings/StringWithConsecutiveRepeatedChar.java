package com.poorak.cci.arraysandstrings;

/**
 * return true if a string has at least one consecutive repeated char.
 * @author poorak
 *
 */
public class StringWithConsecutiveRepeatedChar {
	public boolean hasConsecutiveRepeadtedChar(String text) {
		
		if(text == null || text.isEmpty()){
			throw new IllegalArgumentException("text can't be null or empty");
		}

		
		char[] chars = text.toCharArray();
		char previous = chars[0];
		for(int i=1;i<chars.length;i++){
			if(chars[i] == previous){
				return false;
			}
			
			previous = chars[i];
		}
		
		return true;
	}
}
