package com.poorak.cci.arraysandstrings;
/**
 * Assume you have a method isSubstring which checks if one word is a substring of another. 
 * Given two strings, s i and s2, write code to check if s2 is a rotation of si using only one call to isSubstring 
 * (e.g.,"waterbottle"is a rota- tion of "erbottlewat").
 * @author poorak
 *
 */
public class CheckRotation {
	
	private boolean isSubstring(String s1, String s2){
		return s1.contains(s2);
	}
	
	public boolean rotation(String s1, String s2){
		if(isSubstring(s2+s2, s1)){
			return true;
		}
		
		return false;
	}

}
