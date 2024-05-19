package linkedlist;

public class DeleteNodeinLL {
	public static Node<Integer> Delete(Node<Integer> head, int pos)
	{
		Node<Integer> temp=head;
		int i=0;
		while(i<pos-1)
		{
			temp=temp.next;
			i++;
		}
		temp.next=temp.next.next;
		return head;
		
	}
	
	
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
		Delete(head, 1);
		print(head);

	}

}
