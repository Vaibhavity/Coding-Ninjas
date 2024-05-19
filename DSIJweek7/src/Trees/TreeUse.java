package Trees;
import java.util.Scanner;
public class TreeUse {
	public static TreeNode<Integer> takeInput() {
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Give the next node:");
		n= s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Give the children count for"+n);
		int childcount= s.nextInt();
		for(int i=0;i<childcount;i++) {
			TreeNode<Integer> child=takeInput();
			root.children.add(child);
		}
		return root;
		
	}
	public static void printTree(TreeNode<Integer> root) {
		
	}
	public static void main(String[] args) {
		TreeNode<Integer> root= takeInput();
		printTree(root);
//		TreeNode<Integer> root= new TreeNode<Integer>(4);
//		TreeNode<Integer> n1= new TreeNode<Integer>(2);
//		TreeNode<Integer> n2= new TreeNode<Integer>(3);
//		TreeNode<Integer> n3= new TreeNode<Integer>(5);
//		TreeNode<Integer> n4= new TreeNode<Integer>(6);
//		root.children.add(n1);
//		root.children.add(n2);
//		root.children.add(n3);
//		n2.children.add(n4);
//		System.out.println(root);
	}

}
