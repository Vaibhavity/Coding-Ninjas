package Queues;

public class QueueUsingLL<x> {
	private Node<x> front;
	private Node<x> rear;
	int size;
	//Constructor:
	public QueueUsingLL() {
		front=null;
		rear=null;
		size=0;
	}
	//To check the size:
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
		return front.data;
	}
	//Enqueue:
	void enqueue(x item) {
		Node<x> i= new Node<>(item);
		if(rear==null)
		{
			front=i;
			rear=i;
		}else {
			rear.next=i;
			rear=i;
		}
		size++;
	}
	//Dequeue:
	x dequeue() throws QueueEmptyException {
		if(isempty()) {
			throw new QueueEmptyException();
		}else {
			x temp=front.data;
			front=front.next;
			if(size==1)
			{
				rear=null;
			}
			size--;
			return temp;
		}
	}
	
}
