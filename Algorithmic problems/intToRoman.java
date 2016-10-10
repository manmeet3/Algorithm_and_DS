import java.util.TreeMap;
/**
 Integer to Roman Numeral using TreeMap

 */

public class Main{
	private final static TreeMap<Integer, String> map = new TreeMap<>();

	static {
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
	}


	public static String intToRoman (int n){
		StringBuilder result = new StringBuilder();

		while(n >=1){
			int l= map.floorKey(n); // get the nearest roman integer
			result.append(map.get(l));
			n-=l; // subtract integer value already converted
		}
		return result.toString();
	}


	public static void main (String[] args){
		String res = intToRoman(69);
		System.out.println(res);
	}

}

