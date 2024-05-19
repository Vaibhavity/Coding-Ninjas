package Queues;

public class QueueUsingArray {
	private int data[];
	private int front;
	private int rear;
	private int size;
	public QueueUsingArray(int capacity) {
		data= new int[capacity];
		front= -1;
		rear= -1;
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
	//To return front:
	int front() throws QueueEmptyException  {
		if(size==0) {
			QueueEmptyException e= new QueueEmptyException();
			throw e;
		}
		return data[front];
	}
	//To add element:
	void enqueue(int item) throws QueueOverflowException {
		if(size==data.length)
		{
//			throw new QueueOverflowException();
			QueueResize();
		}
		if(size==0)
		{
			front++;
		}
		rear=(rear+1)%data.length; //This value always lies in the range of 0 to data.length -1;
		data[rear]=item;
		size++;
	}
	//Resize Queue:
	private void QueueResize() {
		int temp[]=data;
		data= new int[2*temp.length];
		int index=0;
		for(int i=front; i<temp.length;i++)
		{
			data[index]=temp[i];
			index++;
		}
		for(int i=0; i<=rear; i++) {
			data[index]=temp[i];
			index++;
		}
		//Finally!
		front=0;
		rear=temp.length-1;	
	}
	//To remove element:
	int dequeue() throws QueueEmptyException {
		if(size==0)
		{
			throw new QueueEmptyException();
		}
		int temp= data[front];
		front=(front+1)%data.length;
		size--;
		if(size==0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}

}
