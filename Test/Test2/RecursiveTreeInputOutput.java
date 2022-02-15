import java.util.Scanner;
// 1 2 4 -1 -1 5 -1 -1 3 5 -1 -1 7 -1 -1
public class RecursiveTreeInputOutput {

	public static void print(BinaryTreeNode<Integer> root) {
		   //Base case
		if( root == null ) {
			return;
		}
		String tobeprinted = root.data+": "+"";
		if( root.left != null ) {
			tobeprinted += "L: " + root.left.data+",";
		}
		if( root.right != null ) {
			tobeprinted += "R: " + root.right.data+",";
		}
		System.out.println(tobeprinted);
		print(root.left);
		print(root.right);
	}
	
	public static BinaryTreeNode<Integer> takeInput( Scanner sc ){
		int rootdata = sc.nextInt();
		// Base case
		if( rootdata == -1 ) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);
		root.left = takeInput(sc);
		root.right = takeInput(sc);
		
		return root;
	}
	
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> root1 = new BinaryTreeNode<>(2);
//		BinaryTreeNode<Integer> root2 = new BinaryTreeNode<>(3);
//		root.left = root1;
//		root.right = root2;
		
		Scanner sc = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(sc);
		print(root);
		
		
	}

}
