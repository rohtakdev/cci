package com.poorak.cci.arraysandstrings;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 * 
 * @author poorak
 *
 */
public class MatrixZero {
		public int[][] matrix(int[][] input){
			boolean isZero[] = new boolean[input.length];
			
			for(int i=0; i< input.length; i++){
				for(int j=0; j< input[i].length; j++){
					if(input[i][j] == 0){
						isZero[i] = true;
						break;
					}
				}
			}
			
			for(int i=0; i< input.length; i++){
				for(int j=0; j< input[i].length; j++){
					if(isZero[i]  || isZero[j] ){
						input[i][j] = 0;
					}
				}
			}
			return input;
		}
}
