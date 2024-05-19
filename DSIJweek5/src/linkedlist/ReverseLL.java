package linkedlist;

public class ReverseLL {
	//Best Method with complexity O(n):
	public static Node<Integer> reverseLL2(Node<Integer> head){
		if(head==null||head.next==null) {
			return head;
		}
		Node<Integer> reversedtail= head.next;
		Node<Integer> smallhead= reverseLL2(head.next);
		reversedtail.next= head;
		head.next=null;
		return smallhead;
	}
	//DoubleNode approach>
	public static DoubleNode reverseLL(Node<Integer> head)
	{
		if(head==null||head.next==null) {
			DoubleNode ans= new DoubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		DoubleNode smallans= reverseLL(head.next);
		smallans.tail.next= head;
		head.next= null;
		
		DoubleNode finalans= new DoubleNode();
		finalans.head= smallans.head;
		finalans.tail= head;
		return finalans;
	}
	//Recursive approach o(n^2).
	public static Node<Integer> reverse(Node<Integer> head)
	{
		if(head==null||head.next==null)
		{
			return head;
		}
		Node<Integer> finalhead= reverse(head.next);
		Node<Integer> temp= finalhead;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return finalhead;
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
		// main:
		Node<Integer> n1= new Node<>(10);
		Node<Integer> n2= new Node<>(20);
		Node<Integer> n3= new Node<>(30);
		n1.next= n2;
		n2.next= n3;
		Node<Integer> head=n1;
//		Node<Integer> ans1=reverse(head);
//		DoubleNode ans2=reverseLL(head);
		Node<Integer> ans3= reverseLL2(head);
//		print(ans1);
//		print(ans2.head);
		print(ans3);
		
	}

}
