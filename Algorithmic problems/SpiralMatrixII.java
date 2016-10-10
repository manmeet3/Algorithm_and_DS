
/**
 * Leetcode.com -- spiral matrix II
 Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

 For example,
 Given n = 3,

 You should return the following matrix:
 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]

 */

public class Main{

	public static int[][] generateMatrix(int n) {
		int[][] res = new int[n][n];
		int digit = 1;
		int left = 0;
		int right = n-1;
		int top = 0;
		int bottom = n-1;

		// Create an on-going spiral of loops that fills the array until desired value is reached
		while(digit <= n*n){
			// fill top row left to right
			for (int i=left; i<=right; i++){
				res[top][i] = digit++;
			}
			top++;

			// fill right column top to borrom
			for (int i=top; i<=bottom; i++){
				res[i][right] = digit++;
			}
			right--;

			// fill bottom row right to left
			for (int i=right; i>=left; i--){
				res[bottom][i] = digit++;
			}
			bottom--;

			// fill left column bottom up
			for (int i=bottom; i>=top; i--){
				res[i][left] = digit++;
			}
			left++;

		}
		return res;
	}


	public static void main (String[] args){
		int[][] arr = generateMatrix(5);
		for (int[] a : arr){
			for (int b: a){
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

}
