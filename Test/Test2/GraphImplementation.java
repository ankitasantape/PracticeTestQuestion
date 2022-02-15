import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphImplementation {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		int edges[][] = new int[n][n+1];
		for( int i = 0; i < e; i++ ) {
			int firstVertex = sc.nextInt();
			int secondVertex = sc.nextInt();
			edges[firstVertex][secondVertex] = 1;
			edges[secondVertex][firstVertex] = 1;
		}
		print(edges);
		int startVertex = sc.nextInt();
		int endVertex = sc.nextInt();
		boolean visited[] = new boolean[edges[0].length];
		System.out.println(hasPath( edges, startVertex, endVertex, visited));
		sc.close();
	}
	public static boolean hasPath(int[][] edges, int start, int end, boolean[] visited) {
		if( edges[start][end] == 1 || start == end  ) {
			return true;
		}
		visited[start] = true;
		for( int i = 0; i < edges.length; i++ ) {
			if( edges[start][i] == 1 && !visited[i] ) {
				if(hasPath(edges,i,end,visited)) {
					return true;
				}
			}
		}
		return false;
	}
	private static void print(int[][] edges) {
		System.out.print("DFS: ");
		int n = edges.length;
		boolean visited[] = new boolean[n];
		for( int i = 0; i < n; i++ ) {
		      if( !visited[i] ) {
		    	  DFSprintHelper(edges,i,visited);
		    	 
		      }
		}
		System.out.print("BFS: ");
		boolean visited2[] = new boolean[n];
		for( int i = 0; i < n; i++ ) {
		      if( !visited2[i] ) {
		    	  
		    	  BFSprintHelper(edges,i,visited2);
		      }
		}
	}

	private static void DFSprintHelper(int[][] edges, int sv, boolean[] visited) {
		System.out.print(sv + " ");
		visited[sv] = true;
		int n = edges.length;
		for( int i = 0; i < n; i++ ) {
			if( edges[sv][i] == 1 && !visited[i] ) {
				DFSprintHelper( edges, i, visited );
			}
		}
    }
	
	private static void BFSprintHelper(int[][] edges, int sv, boolean[] visited) {
	      Queue<Integer> queue = new LinkedList<>();
	      queue.add(sv);
	      
	      while( queue.size() != 0 ) {
	    	  int front = queue.remove();
	    	  System.out.print(front +" ");
	    	  visited[sv] = true;
	    	  for( int i = 0; i < edges[0].length ; i++) {
	    		  if( edges[front][i] == 1 && !visited[i] ) {
	    			  queue.add(i);
	    			  visited[i] = true;
	    		  }
	    	  }
	      }
	}
}
