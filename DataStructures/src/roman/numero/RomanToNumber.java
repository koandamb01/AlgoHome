package roman.numero;
import java.util.HashMap;


public class RomanToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = romanToNumber("MCMXCIV");
		System.out.println(num);
	}
	
	// convert roman to number
	static Integer romanToNumber(String roman) {
		HashMap<Object, Integer> romanDict = new HashMap<Object, Integer>();
		romanDict.put("I", 1);
		romanDict.put("V", 5);
		romanDict.put("X", 10);
		romanDict.put("L", 50);
		romanDict.put("C", 100);
		romanDict.put("D", 500);
		romanDict.put("M", 1000);
		
		Integer number = 0;
		int i = 0;
		String str1, str2;
		
		while(i < roman.length()) {
			
			str1 = roman.substring(i, i+1);
			
			if(i + 2 <= roman.length()) {
				str2 = roman.substring(i+1, i+2);
				
				if(romanDict.get(str1) < romanDict.get(str2)) {
					number -= romanDict.get(str1);
				}else {
					number += romanDict.get(str1);
				}
			}
			else {
				number += romanDict.get(str1);
			}
			
			i++;
		}
		return number;
	}

}
