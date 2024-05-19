package Trees;
import java.util.ArrayList;

public class TreeNode<x> {
	public x data;
	public ArrayList<TreeNode<x>> children;
	public TreeNode(x data) {
		this.data= data;
		children= new ArrayList<>();
	}

}
