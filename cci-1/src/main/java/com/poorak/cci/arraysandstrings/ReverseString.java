package com.poorak.cci.arraysandstrings;
/**
 * Implement a function void reverse(char* str) in C or C++ which reverses a null- terminated string.
 * 
 * @author poorak
 *
 */
public class ReverseString {

	public String reverse(char[] cs){
		int j = cs.length -1;
		for(int i=0;i<j;i++){
			char tmp = cs[i];
			cs[i] = cs[j];
			cs[j] = tmp;
			j--;
		}
		return new String(cs);
	}
}
