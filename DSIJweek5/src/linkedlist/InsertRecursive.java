package linkedlist;

public class InsertRecursive {
	public static Node<Integer> insert(Node<Integer> head, int pos, int item)
	{
		if(pos==0) {
			Node<Integer> newmew= new Node<>(item);
			newmew.next=head;
			return newmew;
		}
		if(head==null)
		{
			return head;
		}
		head.next= insert(head.next, pos-1, item);
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
		Node<Integer> n1= new Node<>(10);
		Node<Integer> n2= new Node<>(20);
		Node<Integer> n3= new Node<>(30);
		n1.next= n2;
		n2.next= n3;
		Node<Integer> head=n1;
		Node<Integer> newhead=insert(head,1,15);
		print(newhead);
	}

}
