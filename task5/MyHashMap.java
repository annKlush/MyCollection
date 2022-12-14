package homework9.task5;
//import java.util.LinkedHashMap
public class MyHashMap<K, V> {

    private Entry<K, V> last;
    private int i=0;
    private Entry<K, V> first;
    private Entry<K, V> table;
    Entry<K,V> tail;
    private Entry<K, V>[] buckets;
    public int size = 0;
    private Integer capacity = 10;

    public MyHashMap() {
        buckets = new Entry[capacity];
    }

    public MyHashMap(Integer capacity) {
        this.capacity = capacity;
        buckets = new Entry[capacity];
    }

    private Integer hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
            Integer hash = hash(key);

            Entry<K, V> entry = new Entry<K, V>(key, value);
            Entry<K, V> temp = buckets[hash];
            if (temp == null) {
                buckets[hash] = entry;
                size++;
            } else {
                while (temp != null) {
                    if (temp.key.equals(key)) {
                        //System.out.println(temp.key + "-" + temp.value);
                        temp.value = value;
                        break;
                    }
                    if (temp.next != null) {
                        temp = temp.next;

                    } else {
                        temp.next = entry;
                        size++;
                    }
                }
            }



    }

    public V get(K key) {
        Integer hash = hash(key);
        Entry<K, V> temp = buckets[hash];
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public void remove(K key) {
        Integer hash = hash(key);
        Entry<K, V> temp = buckets[hash];
        Entry<K, V> prev = null;
        while (temp != null) {
            if (temp.key.equals(key)) {
                if (prev != null) {
                    prev.next = temp.next;
                    size--;
                } else {
                    prev = temp.next;
                    buckets[hash] = prev;
                    size--;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    int size() {
        return size;
    }

    void clear() {
        for (Integer i = 0; i < capacity; i++) {
            Entry<K, V> temp = buckets[i];
            while (temp != null) {
                temp.key=null;
                temp.value=null;
                buckets[i] = null;
                temp = temp.next;
            }
        }
        size=0;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("My HashMap [");
        for (Integer i = 0; i < capacity; i++) {
            Entry<K, V> temp = buckets[i];
          while (temp != null) {
                sb.append(temp.key);
                sb.append("=");
                sb.append(temp.value);
                if(i <= size){
                sb.append(", ");
                }
                temp = temp.next;
            }
        }
        sb.append("]");
        return sb.toString();

    }


}
