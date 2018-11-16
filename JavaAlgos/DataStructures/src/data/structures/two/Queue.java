package data.structures.two;

import java.util.ArrayList;

// Queue RULES: First In First Out
public class Queue {
	private ArrayList<Object> data = new ArrayList<>();
	
	// enqueue into the Queue
	public void enqueue(Object obj) {
		this.data.add(obj);
	}
	
	// dequeue remove from the queue
	public Object dequeue() {
		return this.data.remove(0);
	}
	
	// print queue
	public void printQueue() {
		String str = "Queue => ";
		for (Object obj : this.data) {
			str += " | " + obj;
		}
		str += " <- First In & Last Out";
		System.out.println(str);
	}
}
