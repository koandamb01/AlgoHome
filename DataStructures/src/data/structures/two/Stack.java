package data.structures.two;

import java.util.ArrayList;

// Stack Rules: First in Last Out
public class Stack {
	private ArrayList<Object> data = new ArrayList<>();
	private int top;
	
	public Stack() {
		this.top = -1;
	}
	

	// pop stack
	public Object pop() {
		this.top--;
		return this.data.remove(this.top + 1);
	}
	
	
	// push into the stack
	public void push(Object obj) {
		this.data.add(obj);
		this.top++;
	}
	
	// print stack
	public void printStack() {
		String str = "Last -> ";
		for (Object obj : this.data) {
			str += " | " + obj;
		}
		str += " <- First In";
		System.out.println(str);
	}
}
