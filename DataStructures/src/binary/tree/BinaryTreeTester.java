package binary.tree;

public class BinaryTreeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST BT = new BST();
		
		BT.insert(15);
		BT.insert(35);
		BT.insert(9);
//		BT.insert(10);
//		BT.insert(20);
		BT.printTree();
		
		System.out.println("Height: " + BT.treeHeight());
	}

}
