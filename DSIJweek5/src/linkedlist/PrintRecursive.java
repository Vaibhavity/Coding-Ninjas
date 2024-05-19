package linkedlist;

import java.util.Scanner;

public class PrintRecursive {
	//Take Linked List input function.
		public static Node<Integer> inputLL()
		{
			Node<Integer> head=null;
			Node<Integer> tail=null;

			Scanner s= new Scanner(System.in);
			int data=s.nextInt();
			while(data!=-1)
			{
				Node<Integer> n= new Node<Integer>(data);
				if(head==null)
				{
					head=n;
					tail=n;
				}
				else {
					tail.next=n;
					tail=tail.next;
				}
				data=s.nextInt();
			}
			return head;
		}
	public static void printrec(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		System.out.print(head.data+" ");
		printrec(head.next);
	}

	public static void main(String[] args) {
		Node<Integer> head=inputLL();
		printrec(head);

	}

}
