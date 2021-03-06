package data.structures;

import java.util.ArrayList;

public class Stack {
	private ArrayList<Object> data = new ArrayList<Object>();
	private int top;
	
	public Stack() {
		this.top = -1;
	}
	
	public Object pop() {
		this.top--;
		return this.data.remove(this.top + 1);
	}
	
	public void push(Object value) {
		this.data.add(value);
		this.top++;
	}
	
	public void printStack() {
		String str = "Last -> ";
		for (Object val : this.data) {
			str += " | " + val;
		}
		str += " <- First In";
		System.out.println(str);
	}
}
