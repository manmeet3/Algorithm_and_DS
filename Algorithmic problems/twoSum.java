/** Leetcode.com
 * Two Sum II - Input array is sorted  QuestionEditorial Solution  My Submissions

Given an array of integers that is already sorted in ascending order, 
find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, 
where index1 must be less than index2. Please note that your returned answers (both index1 and index2) 
are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

 */

public class Main {
	
	
	// Start at both ends of the array and add elements outside inward [--> <--]
   public static int[] twoSum(int[] numbers, int target) {
	   if (numbers == null || numbers.length == 0)
			return null;
	   
        int firstindex = 0;
        int lastindex = numbers.length-1;
        
		// Work towards the middle until no more numbers are left in the array
        while(firstindex<lastindex){
        	int sum = numbers[firstindex] + numbers[lastindex];
        	if (sum>target){
        		lastindex--; // need a smaller number
        	}else if(sum<target){
        		firstindex++;  // need a larger number
        	}else {
        		int[] result = {firstindex+1, lastindex+1};
        		return result;
        	}
        }
        return null; 
   }
        
        	
	
	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int[] res = twoSum(numbers, 9); 		// Runs O(n) time and O(1) space
		System.out.println(res[0] + "," + res[1]);

	}
	
	
}
