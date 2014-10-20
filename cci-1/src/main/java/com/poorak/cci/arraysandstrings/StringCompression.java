package com.poorak.cci.arraysandstrings;


/**
 * Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the orig- inal string, your method should return the original string.
 * 
 * @author poorak
 *
 */
public class StringCompression {

	public String compress(String str1){
		
		if(str1.isEmpty()){
			return str1;
		}
		
		char[] inputStr1 = str1.toCharArray();

		String compressed = "";
		int count =1;
		
		for(int i =1; i<inputStr1.length; i++){
			if(inputStr1[i]== inputStr1[i-1]){
				count++;
			}else{
				compressed += inputStr1[i-1];
				compressed += count;
				count =1;
			}
		}
		
		compressed += inputStr1[inputStr1.length-1];
		compressed += count;
		
		if(str1.length() == compressed.length()){
			return str1;
		}
		
		return compressed;
	}
}
