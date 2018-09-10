/**
 * 
 */
package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author prasan
 *
 */
public class Node {
	int a;
	Node left;
	Node right;
	
	public Node(int var) {
		a = var;
		left = null;
		right = null;
	}
	
	static void inorder(Node temp) {
		if (temp == null) {
			return;
		}
		
		inorder(temp.left);
		System.out.println(temp.a+"\t");
		inorder(temp.right);
	}
	
	static void insert(Node temp, int val) {
		if (temp == null)
			return;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		
		while (!q.isEmpty()) {
			Node n = q.peek();
			q.remove();
			
			if (n.left == null) {
				n.left = new Node(val);
				break;
			} else {
				q.add(n.left);
			}
			
			if (n.right == null) {
				n.right = new Node(val);
				break;
			} else {
				q.add(n.right);
			}
		}
	}
}
