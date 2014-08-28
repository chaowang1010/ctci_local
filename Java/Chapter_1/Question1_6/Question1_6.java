// Given an image represented by an NxN matrix, where each pixel in the image is
// 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
// place?
public class Question1_6{
	public static void rotate(int[][] matrix, int n){
		int temp = 0;
		for(int i = 0; i<n/2; i++){
			for(int j = 0; j<n/2; i++){
				temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-i][j];
				matrix[n-1-i][j] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[i][n-1-j];
				matrix[i][n-1-j] = temp; 
			}
		}
	}
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(10, 10, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix, 10);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}
}
	