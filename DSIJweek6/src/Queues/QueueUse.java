package Queues;

public class QueueUse {

	public static void main(String[] args) {
		System.out.println("Queue Using Array");
		QueueUsingArray queue= new QueueUsingArray(3);
		for(int i=0;i<5;i++) {
			try {
				queue.enqueue(i+1);
			} catch (QueueOverflowException e) {
				e.printStackTrace();
			}
		}
		while(!queue.isempty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Queue Using Linked List");
		QueueUsingLL<Integer> queue2= new QueueUsingLL<>();
		for(int i=0;i<5;i++) {
				queue2.enqueue(i+1);
		}
		while(!queue2.isempty()) {
			try {
				System.out.println(queue2.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
