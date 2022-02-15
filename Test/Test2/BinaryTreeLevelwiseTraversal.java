import java.util.Scanner;

public class BinaryTreeLevelwiseTraversal {

	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = takeInput();
		print(root);
	}

	private static void print(BinaryTreeNode<Integer> root) throws QueueEmptyException {
		    
		    QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<>();
		    queue.enqueue(root);
		    queue.enqueue(null);
		    
		    while( !queue.isEmpty() ) {
		    	BinaryTreeNode<Integer> frontNode = queue.dequeue();
		    	if( frontNode == null ) {
		    		System.out.println();
		    		if( !queue.isEmpty() ) {
		    			queue.enqueue(null);
		    		}
		    	}else {
		    		System.out.print(frontNode.data+": ");
		    		if( frontNode.left != null ) {
		    			System.out.print("L:"+frontNode.left.data+",");
		    			queue.enqueue(frontNode.left);
		    		}
		    		if( frontNode.right != null ) {
		    			System.out.print("R:"+frontNode.right.data+",");
		    			queue.enqueue(frontNode.right);
		    		}
		    		System.out.println();
		    	}
		    	
		    }
		    
	}

	private static BinaryTreeNode<Integer> takeInput() throws QueueEmptyException {
		Scanner sc = new Scanner(System.in);
		
		QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<>();
		System.out.println("Enter root data: ");
		int rootdata = sc.nextInt();
		if( rootdata == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);
		queue.enqueue(root);
		
		while(!queue.isEmpty()) {
		      BinaryTreeNode<Integer> frontNode = queue.dequeue();
		      System.out.println("Enter left child of "+frontNode.data);
		      int leftchild = sc.nextInt();
		      if( leftchild != -1 ) {
		              BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftchild);
		              queue.enqueue(child);
		              frontNode.left = child;
		      }
		      System.out.println("Enter right child of "+frontNode.data);
		      int rightchild = sc.nextInt();
		      if( rightchild != -1 ) {
		              BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightchild);
		              queue.enqueue(child);
		              frontNode.right = child;
		      }
		 }
		sc.close();
		return root;
	}

}
