package Stacks;
import java.util.Stack;
public class StackCollections {

	public static void main(String[] args) {
		//Existing Java implementation of Stacks.
		Stack<Integer> stack= new Stack<>();
		int arr[]= {1,4,2,4};
		for(int i=0;i<arr.length;i++)
		{
			stack.push(arr[i]);
		}
		System.out.println("peeking in i.e. topmost item:"+ stack.peek());
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
