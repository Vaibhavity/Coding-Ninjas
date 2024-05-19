package Stacks;

public class StackUsingArray {
	private int stack[];
	private int top; //index of top top of stack;
	//Constructor:
	public StackUsingArray(int capacity) {
		stack= new int[capacity];
		top=-1;
	}
	//Check if Stack is empty:
	public boolean isempty() {//constructor different for every object that's why static can't be used.
	return (top==-1);	
	}
	//Check the size or number of elements in Stack:
	public int size() {
		return top+1;
	}
	//fetching top of stack:
	public int top() throws StackEmptyException{
		if(size()==0)
		{
			StackEmptyException e= new StackEmptyException();
			throw e;
		}
		else {
			return stack[top];
		}
	}
	//Pushing onto Stack:
	public void push(int item) {
//		if(size()==stack.length)
//		{
//			StackFullException s= new StackFullException();
//			throw s;
//		}
		if(size()==stack.length) {
			increasecap();
		}
		top++;
		stack[top]=item;
		
	}
	//Function for Dynamic Stack:
	private void increasecap() {
		int[] tempstack= stack;
		stack= new int[tempstack.length*2];
		for(int i=0; i<=top; i++)
		{
			stack[i]=tempstack[i];
		}
	}
	//Popping out of the Stack:
	public int pop() {
		int popped= stack[top];
		top--;
		return popped;
	}

}
