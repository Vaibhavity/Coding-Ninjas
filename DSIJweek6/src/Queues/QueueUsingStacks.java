package Queues;
import java.util.Stack;

public class QueueUsingStacks<x> {
	Stack<x> s1= new Stack<>();
	Stack<x> s2= new Stack<>();
	int size;
	//Constructor:
	public QueueUsingStacks() {
		size=0;
	}
	//Size:
	int size() {
		return size;
	}
	//To check if the queue is empty:
		boolean isempty() {
				return size==0;
	}
	//To return the first element or front of queue:
	x front() throws QueueEmptyException {
			if (isempty()) {
				throw new QueueEmptyException();
			}
			return s1.peek();
	}
	

}
