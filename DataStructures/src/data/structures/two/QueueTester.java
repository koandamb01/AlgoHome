package data.structures.two;

public class QueueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue myQueue = new Queue();
		
		myQueue.enqueue(23);
		myQueue.enqueue("Med");
		myQueue.enqueue(40);
		myQueue.enqueue("Bass");
		
		myQueue.printQueue();
		myQueue.dequeue();
		myQueue.printQueue();
	}

}
