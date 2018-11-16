package data.structures;

import java.util.ArrayList;

public class Queue {
	private ArrayList<Object> data = new ArrayList<Object>();
	
	public void enqueue(Object val) {
		this.data.add(val);
	}
	
	public Object dequeue() {
		return this.data.remove(0);
	}
	
	public void printQueue() {
		String str = "Queue => ";
		for (Object val : this.data) {
			str += " | " + val;
		}
		str += " <- First In & Last Out";
		System.out.println(str);
	}
}
