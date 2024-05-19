package linkedlist;

public class NodeUse {

	public static void main(String[] args) {
		Node<Integer> node1= new Node<>(14);
		System.out.println(node1.data);
		System.out.println(node1.next);
		Node<Integer> node2= new Node<>(24);
		node1.next=node2; //forming the link between two nodes;
		System.out.println("verifying the formation of link:-");
		System.out.println("next of node 1:-"+node1.next);
		System.out.println("address of node 2:-"+node2);

		
		

		

		
	}

}
