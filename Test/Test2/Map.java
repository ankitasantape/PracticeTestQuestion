import java.util.ArrayList;

public class Map<K,V> {
    // Take bucketArray
	ArrayList<MapNode<K,V>> bucketArray ;
	//Take Number of bucket 
	int numBuckets, size;
	
	public Map() {
		//initially, create 20 number of buckets in bucketsArray 
		numBuckets = 20;
		//Create new BucketArray
		bucketArray = new ArrayList<>();
		// initialize array with null value
		for( int i = 0; i < numBuckets; i++ ) {
			bucketArray.add(null);
		}
	}
	
	int size() {
		return size;
	}
	// insert data into hashMap
	void insert( K key, V value ) {
	   //get bucketIndex of key
		int bucketIndex = getBucketIndex(key);
		// get the head of LinkedList from the bucketArray at bucketIndex
		MapNode<K,V> head = bucketArray.get(bucketIndex);
		while( head != null ) {
			// if the references of the key is matching then insert the value into LinkedList
			if( head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		// if head is null means key is not  exist in the Linked List
		//Again, take a head data and create new entry 
		head = bucketArray.get(bucketIndex);
		MapNode<K, V> newEntry = new MapNode<>(key, value);
		newEntry.next = head;
		bucketArray.set( bucketIndex , newEntry ); 
		size++;
		double loadfactor = ( 1.0 * size )/numBuckets ;
		if( loadfactor > 0.7 ) {
			rehash();
		}
		
	}
    private void rehash() {
    	ArrayList<MapNode<K,V>> tempArray = bucketArray ;
		bucketArray = new ArrayList<>();
		numBuckets *= 2;
		//store doublesize of null into arrayList
		for( int i = 0; i < numBuckets; i++ ) {
			bucketArray.add(null);
		}
		
		for( int i = 0; i < tempArray.size(); i++ ) {
			//restore head of LinkedList
			MapNode<K,V> head = tempArray.get(i);
			while( head != null ) {
			    insert(head.key, head.value );
			    head = head.next;
			}
		}
	}

	int getBucketIndex(K key) {
		// first get the hashCode of a key
		int hashCode = key.hashCode();
		
		//return the bucketIndex By compressing function
		return hashCode % numBuckets;
	}
	
	V removeKey( K key ) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = bucketArray.get(bucketIndex);
		MapNode<K,V> prev = null;
		while( head != null ) {
			// if the references of the key is matching then insert the value into LinkedList
			if( head.key.equals(key)) {
				if( prev == null ) {
					bucketArray.set(bucketIndex, head.next);
					
				}else {
					prev.next = head.next;
				}
				return head.value;
			}
			prev = head;
			head = head.next;
		}
		return null;
	}
	
	V getKey( K key ) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = bucketArray.get(bucketIndex);
		while ( head != null ) {
			if( head.key.equals(key) ) {
				return head.value;
			}
			head = head.next;
		}
		return null;
		
	}
}
