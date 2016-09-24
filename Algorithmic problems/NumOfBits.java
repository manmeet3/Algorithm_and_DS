**
 * 
 * Problem: Print a list of the number of set bits in all digits 
 * up to x (some arbitrary value).
 *
 */

public class NumOfBits {
	
	static String converToBinary(int num){
		StringBuffer result = new StringBuffer();
		while(num > 0){
			int i = num%2; // Must be either 0 or 1
			result.append(Integer.toString(i));
			num/=2; // Division rounds down -- regardless of even or odd
		}
		return result.toString();
	}
	
	static int[] countBits(int num){
		int[] result = new int[num+1]; //bigger by one so that we can include 0
		for (int i=0;i<result.length;i++){
			result[i] = 0;	// initialize all to zero
		}
		
		for (int i=0; i<=num; i++){
			String binaryNum = converToBinary(i);
			
			// check all set bits and increment the index
			for(int j=0;j<binaryNum.length();j++){ 
				if (binaryNum.charAt(j) == '1'){
					result[i]++;
				}
			}
		}
			
		return result;
	}
	
	public static void main(String[] args) {
		int x = 121;
		int[] res = countBits(x);
		
		// print list the # of set bits in all digits up to x.
		for (int i: res){
			System.out.println(i);
		}
	}
	
	
}
