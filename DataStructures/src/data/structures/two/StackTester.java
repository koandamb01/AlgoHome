package data.structures.two;

public class StackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack = new Stack();
		
		myStack.push(23);
		myStack.push(10);
		myStack.push("Med");
		myStack.printStack();
		myStack.pop();
		myStack.printStack();
	}

}
