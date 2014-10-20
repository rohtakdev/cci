package com.poorak.cci.arraysandstrings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatrixZeroTest {
	
	private MatrixZero matrixZero;

	@Before
	public void setUp() throws Exception {
		matrixZero =new MatrixZero();
	}

	@Test
	public void test() {
		int[][] i= new int[4][4];
		i[0][0]= 1;
		i[0][1]= 1;
		i[0][2]= 1;
		i[0][3]= 1;
		i[1][0]= 1;
		i[1][1]= 0;
		i[1][2]= 1;
		i[1][3]= 1;
		i[2][0]= 1;
		i[2][1]= 0;
		i[2][2]= 0;
		i[2][3]= 1;
		i[3][0]= 1;
		i[3][1]= 1;
		i[3][2]= 1;
		i[3][3]= 1;
		int[][] o= new int[4][4];
		o[0][0]= 1;
		o[0][1]= 0;
		o[0][2]= 0;
		o[0][3]= 1;
		o[1][0]= 0;
		o[1][1]= 0;
		o[1][2]= 0;
		o[1][3]= 0;
		o[2][0]= 0;
		o[2][1]= 0;
		o[2][2]= 0;
		o[2][3]= 0;
		o[3][0]= 1;
		o[3][1]= 0;
		o[3][2]= 0;
		o[3][3]= 1;

		assertArrayEquals(o,matrixZero.matrix(i));
		
		
	}

}
