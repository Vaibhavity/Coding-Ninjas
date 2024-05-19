package linkedlist;

public class InsertNodeInLL {
	public static Node<Integer> insert(Node<Integer> head, int pos, int data)
	{
		Node<Integer> newmew= new Node<>(data);
		if(pos==0)
		{
			newmew.next=head;
			return newmew;
		}
		Node<Integer> temp=head;
		int i=0;
		while(i<pos-1)
		{
			temp=temp.next;
			i++;
		}
		newmew.next=temp.next;
		temp.next=newmew;
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
