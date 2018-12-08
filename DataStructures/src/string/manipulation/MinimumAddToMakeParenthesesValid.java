package string.manipulation;

public class MinimumAddToMakeParenthesesValid {

	public static void main(String[] args) {
		String input = "()))((";
		int res = MinimumParenthesesNeed(input);
		System.out.println("output: " + res);

	}
	
	
	static int MinimumParenthesesNeed(String input) {
		int ans = 0, i = 0;
		
		while(i < input.length()) {
			if(input.charAt(i) == '(') {
				ans += 1;
			}
			else if(input.charAt(i) == ')') {
				ans -= 1;
			}
			
			i++;
		}
		
		if(ans < 0) {
			ans = ans * (-1);
		}
		
		return ans;
	}
}
