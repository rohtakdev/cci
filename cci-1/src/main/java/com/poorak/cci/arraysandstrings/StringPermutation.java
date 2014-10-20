package com.poorak.cci.arraysandstrings;

import java.util.Arrays;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 * 
 * @author poorak
 *
 */
public class StringPermutation {

	public boolean checkPermutation(String str1, String str2){
		char[] str1Char = str1.toCharArray();
		char[] str2Char = str2.toCharArray();
		
		Arrays.sort(str1Char);
		Arrays.sort(str2Char);
		
		if(new String(str1Char).equals(new String(str2Char))){
			return true;
		}
		
		return false;
	}
	

}
