package string.manipulation;

import java.util.ArrayList;

public class LongestSubstring {

	public static void main(String[] args) {
		String input = "microsoft";
		longSubstring(input);

	}
	static String longSubstring(String input) {
		String str = "";
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < input.length(); i++) {
			
			if(str.indexOf(input.charAt(i)) != -1) {
				list.add(str);
				str = "";
				str += input.charAt(i);
			}
			else {
				str += input.charAt(i);
			}
		}
		list.add(str);
		str = "";
		System.out.println(list.toString());
		
		int len = 0;
		for(String item: list) {
			if(item.length() >= len) {
				len = item.length();
				str = item;
			}
		}
		System.out.println("longest substring is: "+ str);
		return null;
	}

}
