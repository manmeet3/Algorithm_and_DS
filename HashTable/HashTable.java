/**
 * Created by manmeet on 9/7/16.
 */
public class HashTable<K, V> {

    private int TABLE_SIZE;   // initial size
    private int size;
    private HashEntry<K,V>[] table;


    HashTable(int ts) {           // constructor to initialize all values
        TABLE_SIZE = ts;
        size = 0;
        table = new HashEntry[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++)
            table[i] = null;
    }

    public int getSize(){
        return size;
    }

    public void emptyTable(){
        for (int i=0;i<size;i++){
            table[i] = null;
        }
    }

    public V get(K key){
        int hash = hash(key) % TABLE_SIZE;
        if (table[hash] == null) return null;
        else {
            HashEntry entry = table[hash];
            while (entry != null && !entry.getKey().equals(key)){
                entry = entry.next;
            }

            if (entry == null) {
                return null;
            }else {
                return (V)entry.getValue();
            }
        }
    }

    public void put(K key, V value){
        int hash = hash(key) % TABLE_SIZE;
        if (table[hash] == null) {
            table[hash] = new HashEntry(key, value);
        } else {
            HashEntry entry = table[hash];
            while (entry.getNext() != null && !entry.getKey().equals(key)) {
                entry = entry.next;
            }
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
            } else {
                entry.setNext(new HashEntry(key, value));
            }
        }
        size++;
        // check size here and resize if necessary
    }

    public void remove (K key){
        int hash = hash(key) % TABLE_SIZE;

        if (table[hash] != null){
            HashEntry prev = null;
            HashEntry entry = table[hash];

            while (entry.getNext()!=null && !entry.getKey().equals(key)){
                prev = entry;
                entry = entry.getNext();
            }
            if (entry.getKey().equals(key)){
                if (prev == null) table[hash] = entry.getNext();
                else prev.setNext(entry.getNext());

                size--;
            }
        }
    }

    private int hash(K key){
        int hashVal = key.hashCode();
        hashVal %= TABLE_SIZE;
        if (hashVal < 0) hashVal += TABLE_SIZE;
        return hashVal;
    }

    public void printHashTable(){
        for (int i=0;i<TABLE_SIZE;i++){
            System.out.print("\nIndex " + (i+1) + " : ");
            HashEntry entry = table[i];
            while (entry != null){
                System.out.print(entry.getValue()+" ");
                entry = entry.getNext();
            }
        }
    }

}


