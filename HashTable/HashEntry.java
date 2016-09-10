
/**
 * Created by manmeet on 9/7/16.
 */
public class HashEntry<K,V> {
    private K key;
    private V value;
    HashEntry next;

    HashEntry(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    public void setValue(V val){
        this.value = val;
    }

    public HashEntry getNext() {return next;}
    public void setNext(HashEntry next){
        this.next = next;
    }
}
