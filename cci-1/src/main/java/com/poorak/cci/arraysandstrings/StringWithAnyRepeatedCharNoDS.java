package com.poorak.cci.arraysandstrings;

/**
 * return true, if a string has any repeated char, no extra datastructure.
 * 
 * @author poorak
 *
 */
public class StringWithAnyRepeatedCharNoDS {
      public boolean hasRepeatedChar(String text){
    	 if(text == null || text.isEmpty()){
    		 throw new IllegalArgumentException("text can't be null or empty");
    		 
    	 }
    	 
    	if(text.length() > 256){
    		return false;
    	}
    	
    	int lookup =0;
    	
    	for(int i=0;i < text.length(); i++){
    		int val = text.charAt(i) - 'a';
    		if((lookup & (1 << val)) > 0){
    			return false;
    		}
    		
    		lookup |= (1<<val);
    	}
    	
    	 return true;
      }
}
