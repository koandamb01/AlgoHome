package binary.tree;

public class BST {
	private BSTNode root;
	
	public BST() {
		this.root = null;
	}
	
	// insert in the tree
	public void insert(int val) {
		if(this.root != null) {
			this.root.insert(val);
		}
		else{
			this.root = new BSTNode(val);
		}
	}
	
	// print the binary Tree
	public void printTree() {
		if(this.root == null) {
			System.out.println("Root");
		}else {
			this.root.printTree();
		}
	}
	
	// count the number of nodes
	public int treeHeight() {
		if(this.root == null) {
			return 0;
		}else {
			return this.root.treeHeight();			
		}
	}
}
