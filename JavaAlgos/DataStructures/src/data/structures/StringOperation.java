package data.structures;

public class StringOperation {
	public static void main(String[] args) {
		stringOperation("95+5-10*4+3*9-2/4");
	}
	
	
	public static int perform(int op1, char sign, int op2) {
		int res = 0;
		if(sign == '+') {
			res = op1 + op2;
		}
		else if(sign == '-') {
			res = op1 - op2;
		}
		else if(sign == '*') {
			res = op1 * op2;
		}
		else if(sign == '/') {
			res = op1 / op2;
		}
		return res;
	}
	
	
	
	public static void stringOperation(String operation) {
		String str = "";
		String operants = "+-*/";
		int i = 0;
		String mysigns = "+-*/";
		Stack myStack = new Stack();
		
		while(i < operation.length()){
	
			if(mysigns.indexOf(operation.charAt(i)) != -1) {
				
				if(operation.charAt(i) == '*' || operation.charAt(i) == '/') {
					myStack.push(str);
					myStack.push(operation.charAt(i));
					str = "";
					i++;
					
					while(i < operation.length() && !(mysigns.indexOf(operation.charAt(i)) != -1 )) {
						str += operation.charAt(i);
						i++;
					}
					
					int op1 = Integer.parseInt(str);
					char sign = (char) myStack.pop();
					int op2 = Integer.parseInt((String) myStack.pop());
					str = "";
					str += perform(op1, sign, op2);
					continue;
					
				}
				else {
					myStack.push(str);
					myStack.push(operation.charAt(i));
					str = "";
				}
				
				
			}else {
				str += operation.charAt(i);
			}
			
			i++;
		}
		
		myStack.push(str);
		str = "";
		myStack.printStack();
	}
}
