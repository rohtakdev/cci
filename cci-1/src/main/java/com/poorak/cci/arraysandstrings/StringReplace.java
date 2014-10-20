package com.poorak.cci.arraysandstrings;
/**
 * Write a method to replace all spaces in a string with'%20'.
 *  You may assume that the string has sufficient space at the end of the string to 
 *  hold the additional characters, and that you are given the "true" length of the string.
 *   (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
EXAMPLE
Input: "Mr John Smith Output: "Mr%20John%20Smith"
 * @author poorak
 *
 */
public class StringReplace {

	public String replace(String input){
		if(input.isEmpty() || input.contains(" ") == false ){
			return input;
		}
		
		char[] inputChar = input.toCharArray();
		// figure out the last character.
		int tail = input.trim().toCharArray().length -1;
		
		if( tail == inputChar.length -1){
			throw new IllegalArgumentException("not enough spaces provided in end");
		}
		
		for(int i =0; i<inputChar.length -1; i++){
			if(inputChar[i] == ' '){
				System.arraycopy(inputChar, i+1, inputChar, i+3, tail - i);
				inputChar[i] = '%'; 
				inputChar[i+1] = '2'; 
				inputChar[i+2] = '0'; 
				i+=2;
				tail +=2;
			}
		}
		return new String(inputChar);
	}
}
