// Given an image represented by an NxN matrix, where each pixel in the image is
// 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
// place?
public class Question1_6{
	public static void rotate(int[][] matrix, int n){

	}
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(10, 10, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix, 10);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
}
	