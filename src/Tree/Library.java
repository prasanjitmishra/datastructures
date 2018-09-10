/**
 * 
 */
package Tree;

/**
 * @author prasan
 *
 */
public class Library {
	Node root;
	/**
	 * @param args
	 */
	
	Library () {
		root = null;
	}
	
	Library (int val) {
		root = new Node(val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library tree = new Library();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.right = new Node(4);
		tree.root.right.left = new Node(5);
		
		Node.inorder(tree.root);
		
		Node.insert(tree.root, 6);
		Node.insert(tree.root, 7);
		
		Node.inorder(tree.root);
	}

}
