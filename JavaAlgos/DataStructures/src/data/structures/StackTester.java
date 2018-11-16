package data.structures;

public class StackTester {

	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push(23);
		myStack.push(90);
		myStack.push(80);
		myStack.push(40);
		myStack.push(30);
		myStack.push(10);
		myStack.printStack();
		System.out.println(myStack.pop());
		myStack.printStack();
	}

}
