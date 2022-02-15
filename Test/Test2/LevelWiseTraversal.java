import java.util.Scanner;

public class LevelWiseTraversal {
    
	public static TreeNode<Integer> takeInputLevelWise() throws QueueEmptyException{
		Scanner sc= new Scanner(System.in);
		//Make queue to take input FIFO order
		QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<>();
		//First, take root of a tree
		int rootdata = sc.nextInt();
		//Make a treeNode of rootdata
		TreeNode<Integer> root = new TreeNode<>(rootdata);
		//First, encounter root into queue
		queue.enqueue(root);
		//Jb tk queue empty nhi hota tb tk traverse krte rho
		while( !queue.isEmpty() ) {
			// remove first element from queue
			TreeNode<Integer> frontNode = queue.dequeue();
			// take input of total no of children of root
			int childCount = sc.nextInt();
			// take input of all children of root 
			for( int i = 0; i < childCount; i++ ) {
				// take child of root
				int child = sc.nextInt();
				//Make childNode of child 
				TreeNode<Integer> childNode = new TreeNode<>(child);
				//Insert childNode into queue
				queue.enqueue(childNode);
				//Insert childNode into ArrayList of children
				frontNode.children.add(childNode);
			}
		}
		sc.close();
		return root;
	}
	/*
	                  1
	                 /|\
	                2 3 4
	                 /\
	                5  6
	 * */
	public static void printLevelWise(TreeNode<Integer> root) throws QueueEmptyException {
		QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<>();
		//First insert root into queue
		queue.enqueue(root); // 1
		//then insert null means, level1 is inserted into queue
		queue.enqueue(null); // null    1--->null
		//jb tk queue empty nhi hoti tb tk traverse kro
		while(!queue.isEmpty()) {
		//first, deque first elem from queue and store it into frontNode
			TreeNode<Integer> frontNode = queue.dequeue(); // frontNode = 1,null,2,3,4,null,5,6,null
			if( frontNode == null ) {
				System.out.println();
				if( !queue.isEmpty() ) {
					queue.enqueue(null);
				}
		   } else {
			   System.out.print(frontNode.data+" ");
		    //then, insert all the children of frontNode into queue
		      for( int i = 0; i < frontNode.children.size(); i++ ) {
				    TreeNode<Integer> child = frontNode.children.get(i);
				    queue.enqueue(child);
			  }
		    
			}
		}
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		TreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
	}
}
