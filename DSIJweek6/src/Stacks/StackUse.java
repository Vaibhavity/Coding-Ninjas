package Stacks;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
//		StackUsingArray stack1= new StackUsingArray(10);
//		int size= stack1.size();
//		System.out.println("Hey, currently the size is:"+size);
//		stack1.push(1);
//		stack1.push(2);
//		stack1.push(3);
//		while(!stack1.isempty())
//		{
//			System.out.println(stack1.pop());
//		}
		
		StackUsingLL<Integer> stack2= new StackUsingLL<>();
		int size= stack2.size();
		System.out.println("Hey, currently the size is:"+size);
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		while(!stack2.isempty())
		{
			System.out.println(stack2.pop());
		}
		

	}

}
