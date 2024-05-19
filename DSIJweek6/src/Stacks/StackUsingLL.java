package Stacks;

public class StackUsingLL<x> {
	private Node<x> top; //i.e head
	private int size; //
	public StackUsingLL() {
		top=null;
		size=0;
	}
	//Return the size of Stack:
	public int size() {
		return size;
	}
	//Return the top of Stack:
	public x top() throws StackEmptyException {
		if(isempty()) {
			StackEmptyException e= new StackEmptyException();
			throw e;
		}
		else {
			return top.data;
		}
	}
	//Check if the Stack is empty:
	public boolean isempty() {
		return(top==null);
	}
	//Push an item:
	public void push(x item) {
		Node<x> newnode= new Node<>(item);
		newnode.next=top;
		top=newnode;
		size++;
	}
	//Pop an item:
	public x pop() throws StackEmptyException{
		if(isempty()) {
			StackEmptyException e= new StackEmptyException();
			throw e;
		}
		else {
			x pop= top.data;
			top=top.next;
			size--;
			return pop;
		}
	}
	

}
