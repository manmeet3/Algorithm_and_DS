/**
 Problem: Given an array of numbers nums, in which exactly two elements 
 appear only once and all the other elements appear exactly twice. 
 Find the two elements that appear only once.

 For example:

 Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 **/

public class singleNumber{

	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0) return; // null case
		if (low >= high)  return; // base case

		int pivot = arr[low];
		int i = low, j = high; // make left < pivot and right > pivot

		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
		if (high > i)
			quickSort(arr, i, high);
	}

	public static int[] uniqueNums (int[] arr){
		if (arr.length <= 0) return null; // handle null case
		int len = arr.length;
		int[] uniqueNums = new int[2];
		quickSort(arr, 0, len -1); // sort the list of numbers

		int counter = 0; // counter for unique values

		// check ends of the array for unique values
		if (arr[0] != arr[1]) {
			uniqueNums[counter++] = arr[0];
		}

		if (arr[len-1] != arr[len-2]){
			uniqueNums[counter++] = arr[len-1];
		}
		// loop through the rest of the elements comparing each 
		// value to before and after values
		for (int i=1; i<arr.length-1;i++){
		if (counter == 2) return uniqueNums;
			if (arr[i] != arr[i-1] && arr[i] != arr[i+1]) {
				uniqueNums[counter++] = arr[i];
			}
		}
		return uniqueNums;

	}

	public static void main (String[] args){
		int[] nums = {4, 6, 4, 7, 6, 3};
		int [] res = uniqueNums(nums);
		System.out.println("Unique elts are: "+ res[0] + "," + res[1]);

	}



}
