/**
	Convert string to integer without library functions
 */

public class Main{

	public static int strToint(String str){
		int result = 0;
		for(int i=0;i<str.length();i++){
			result = result * 10 + (str.charAt(i) - '0');
		}
		return result;
	}


	public static void main (String[] args){
		int result = strToint("32134");
		System.out.println(result);

	}

}

