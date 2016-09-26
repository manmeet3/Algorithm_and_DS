/** Leetcode.com
 Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

 Note:
 The number of people is less than 1,100.

 Example

 Input:
 [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

 Output:
 [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 */


public class Main{

	// sort 2d array with two elements in each sub-array
	public static void twoDquckSort(int[][] arr, int low, int high){
		if (arr == null || arr.length == 0) return; // null case
		if (low >= high)  return; // base case


		int pivot = arr[low][0] + arr[low][1];
		int i = low;
		int j = high;

		while(i<=j){
			while((arr[i][0] + arr[i][1]) < pivot) i++;
			while((arr[j][0] + arr[j][1]) > pivot) j--;

			if(i<=j){
				int[] tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;

			}

		}
		if (low < j)
		  twoDquckSort(arr, low, j);
		if (high > i)
			twoDquckSort(arr, i, high);


	}

	public static void main (String[] args){
		int[][] input = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		twoDquckSort(input, 0, input.length-1);

		for(int[] elt : input){
			System.out.print("[" + elt[0] + "," + elt[1] + "] ");
		}

	}

}

