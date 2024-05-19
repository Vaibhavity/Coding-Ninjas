package linkedlist;
import java.util.Scanner;
public class PrintLL1 {
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
//				Node<Integer> temp=head;
//				while(temp.next!=null)
//				{
//					temp=temp.next;
//				}
//				temp.next=n;
				tail.next=n;
				tail=tail.next;
			}
			data=s.nextInt();
		}
		return head;
	}
	
	//Print Linked List function.
	public static void print(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Node<Integer> n1= new Node<>(10);
//		Node<Integer> n2= new Node<>(20);
//		Node<Integer> n3= new Node<>(30);
//		n1.next= n2;
//		n2.next= n3;
//		Node<Integer> head=n1;
		Node<Integer> head=inputLL();
		print(head);

	}

}
