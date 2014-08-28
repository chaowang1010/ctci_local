// Given an image represented by an NxN matrix, where each pixel in the image is
// 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
// place?
import CtCILibrary.*;

public class Question1_6{
	// rotation with extra space 
	public static void rotateNotInPlace(int[][] matrix) {
        int l = matrix.length;
        int[][] res = new int[l][l];
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                res[j][l-1-i] = matrix[i][j];
            }
        }
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
    // in-place rotation
	public static void rotate(int[][] matrix, int n){
		int temp = 0;
		for(int i = 0; i<n/2; i++){
			for(int j = i; j<n-1-i; j++){
				temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp; 
			}
		}
	}
	public static void main(String[] args) {
		int n_dim = 5;
		int[][] matrix = AssortedMethods.randomMatrix(n_dim, n_dim, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix,n_dim);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}
}
	