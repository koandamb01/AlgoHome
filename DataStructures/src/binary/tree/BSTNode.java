package binary.tree;

public class BSTNode {
	private int val;
	private BSTNode right;
	private BSTNode left;
	
	public BSTNode(int val) {
		this.val = val;
		this.right = null;
		this.left = null;
	}
	
	// insert a new BSTNode
	public void insert(int val) {
		// make a node
		BSTNode newNode = new BSTNode(val);
		
		// check right side
		if(val > this.val) {
			if(this.right == null) {
				this.right = newNode;
			}
			else {
				this.right.insert(val);
			}
		}
		
		// check left side
		else if(val < this.val) {
			if(this.left == null) {
				this.left = newNode;
			}
			else {
				this.left.insert(val);
			}
		}
		
		// edge case when the value is equal
		else {
			System.out.println("No duplicate in a tree, " + val +" already exist");
		}
	}
	
	// print the binary Tree
	public void printTree() {
		if(this.left != null) {
			this.left.printTree();
		}
		
		System.out.println(this.val);
		
		if(this.right != null) {
			this.right.printTree();
		}
	}
	
	
	// height of the BST
	public int treeHeight() {
		int leftCount = 0, rightCount = 0;
		
		if(this.left == null && this.right == null) {
			return 1;
		}
		else if(this.left != null) {
			leftCount = this.left.treeHeight();
		}
		
		else if(this.right != null) {
			rightCount = this.right.treeHeight();
		}
		
		
		if(leftCount > rightCount) {
			return leftCount + 1;
		}else {
			return rightCount + 1;
		}
		
	}
	
	
	
}
