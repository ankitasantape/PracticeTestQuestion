
public class MapNode<K,V> {
      public K key;
      public V value;
      
      //Bydefault next is null
      MapNode<K,V> next = null;
      //Initialize constructor with key & value
      public MapNode( K key, V value) {
    	  this.key = key;
    	  this.value = value;
      }
}
