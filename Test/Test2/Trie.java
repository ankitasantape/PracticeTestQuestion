

class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode []children;
    int childCount;
    
    public TrieNode( char data) {
    	this.data = data;
    	// by default single char bold rahega
    	isTerminating = false;
    	//By default entry will be null 
    	children = new TrieNode[26];
    	childCount = 0;
    }
}

public class Trie {
     
	TrieNode root;
    int count;
	
	public Trie() {
		root = new TrieNode('\0');
		count = 0;
	}
	
	void add(String s,  TrieNode root ) {
		//base case - if string is empty then the rootNode become terminating node means root has no child further 
		   if( s.length() == 0) {
			   root.isTerminating = true;
			   return;
		   }
		
			int childIndex = s.charAt(0) - 'a';
			TrieNode child = root.children[childIndex];
			if( child == null  ) {
			   root.children[childIndex] = child;
			   root.childCount++;
			}
			
		add(s.substring(1), child );
	}
	
	void remove(String s, TrieNode root ) {
		   if( s.length() == 0) {
			   root.isTerminating = true;
			   return;
		   }
		
			int childIndex = s.charAt(0) - 'a';
			TrieNode child = root.children[childIndex];
			if( child == null  ) {
			   return;
			}
			// childnode remove krne ke liye child terminating nahi hona chahiye and child ke child nhi hone chahiye
			if( !child.isTerminating && child.childCount == 0 ) {
				root.children[childIndex] = null;
				child = null;
				root.childCount--;
			}
	}
	
	TrieNode search(String s, TrieNode root ) {
		if( s.length() == 0 ) {
			return root;
		}
		int childIndex = s.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if( child == null ) {
			return null;
		}
		return search( s.substring(1), child );
	}
}
