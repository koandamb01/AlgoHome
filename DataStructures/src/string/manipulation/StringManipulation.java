package string.manipulation;

import java.util.ArrayList;

public class StringManipulation {
	public static void main(String[] args) {
		String res = mostCommonChars("mohamed");
		System.out.println("Chars: " + res);
	}
	
	
	static String mostCommonChars(String input) {
		String str = "";
		String memo = "";
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < input.length(); i++) {
			
			if(memo.indexOf(input.charAt(i)) == -1) {
				str += input.charAt(i);
				memo += input.charAt(i);
				
				for(int j = i + 1; j < input.length(); j++) {
					
					if(str.indexOf(input.charAt(j)) != -1) {
						str += input.charAt(j);
					}
				}
				
				list.add(str);
				str = "";
				
			}
			
		}
		
		int len = 0;
		memo = "";
		for(String item : list) {
			if(item.length() > len) {
				len = item.length();
				str = item;
			}
			else if(item.length() == len) {
				memo = item;
			}
		}
		
		if(memo.length() > 0) {
			str = "'" + memo + "' and '" + str + "' has the same length";
		}
		return str;
	}
}
