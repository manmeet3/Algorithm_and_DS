
/**
 * Created by manmeet on 9/7/16.
 */
public class HashEntry<K,V> {
    private K key;
    private V value;
    HashEntry next;

    // Constructor for arbitrary data types
    HashEntry(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
	
    // Get and set methods
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    public void setValue(V val){
        this.value = val;
    }
    
    // Linked list pointers for chaining at each index
    public HashEntry getNext() {return next;}
    public void setNext(HashEntry next){
        this.next = next;
    }
}
