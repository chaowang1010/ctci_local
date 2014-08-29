// Write an algorithm such that if an element in an MxN matrix is 0, its entire row
// and column are set to 0. 

// Leetcode -- Set Matrix Zeros

// Using the first row and column as indicators

import CtCILibrary.AssortedMethods;

public class Question1_7{

	public static void setZeros(int[][] matrix){
		if (matrix.length  == 0) return;
		if (matrix[0].length  == 0) return;

		boolean hasZeroFirstRow = false;
		boolean hasZeroFirstCol = false;

		for(int i = 0; i<matrix.length ; ++i)
			if(matrix[i][0]==0){
				hasZeroFirstCol = true;
				break;
			}
		for(int i = 0; i<matrix[0].length ; ++i)
			if(matrix[0][i]==0){
				hasZeroFirstRow = true;
				break;
			}

		for(int i = 1; i<matrix.length ; ++i)
			for(int j = 1; j<matrix[0].length ; ++j)
				if(matrix[i][j] == 0){
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
		for(int i = 1; i<matrix.length ; ++i)
			for(int j = 1; j<matrix[0].length  ; ++j)
				if(matrix[i][0] == 0 || matrix[0][j] == 0){
					matrix[i][j] = 0;
				}

		if(hasZeroFirstRow == true){
			for(int i = 0; i<matrix[0].length ; ++i)
				matrix[0][i] = 0;
		}			
		if(hasZeroFirstCol == true){
			for(int i=0; i<matrix.length ; ++i)
				matrix[i][0] = 0;
		}
	}

	public static void main(String[] args) {
		int nrows = 10;
		int ncols = 15;
		int[][] matrix1 = AssortedMethods.randomMatrix(nrows, ncols, 0, 100);

		AssortedMethods.printMatrix(matrix1);
		setZeros(matrix1);
		System.out.println() ;
		AssortedMethods.printMatrix(matrix1);
	}

}