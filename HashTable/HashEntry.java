
/**
 * Created by manmeet on 9/7/16.
 */
public class HashEntry {
    private String key;
    private int value;
    HashEntry next;

    HashEntry(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int val){
        this.value = val;
    }

    public HashEntry getNext() {return next;}
    public void setNext(HashEntry next){
        this.next = next;
    }
}
