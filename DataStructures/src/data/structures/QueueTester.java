package data.structures;

public class QueueTester {
	public static void main(String[] args) {
		Queue myQueue = new Queue();
		myQueue.enqueue(45);
		myQueue.enqueue(15);
		myQueue.enqueue(55);
		myQueue.enqueue(65);
		myQueue.enqueue(85);
		myQueue.enqueue("Lol");
		
		myQueue.printQueue();
		System.out.println(myQueue.dequeue());
		myQueue.printQueue();
	}
}
