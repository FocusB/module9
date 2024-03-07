package HashMap;

public class HashMapCustom <K, V>{
    private static final int DEFAULT_SIZE = 8;
    private Entry<K, V> [] entries = new Entry[DEFAULT_SIZE];
    private int size;
    public void put(K key, V value){
        int index = getBucketIndex(key);
        Entry<K, V> entry = new Entry<>(key, value);
        Entry<K, V> existing = entries[index];
        if(entries[index]==null){
            entries[index]=entry;
            size++;
        }else {
            while(existing.next!=null){
                if(existing.key.equals(key)){
                    existing.value=value;
                    return;
                }
                existing = existing.next;
            }
            if(existing.key.equals(key)){
                existing.value = value;
            }else{
                existing.next = entry;
                size++;
            }
        }
    }

    public void remove(K key){
        int index = getBucketIndex(key);
        Entry<K, V> current = entries[index];
        Entry<K, V> previous = null;
        if(current==null){
            throw new ArrayIndexOutOfBoundsException("Bucket is empty");
        }
        if(current.next==null){
            entries[index]=null;
            size--;
        }
        else{
            while(current.next!=null){
                if(current.key.equals(key)){
                    previous.next=current.next;
                    size--;
                    return;
                }
                previous = current;
                current = current.next;
            }
            size--;
        }
    }
    public void clear(){
        for(int i =0; i<entries.length;i++){
            Entry<K, V> current = entries[i];
            entries[i]=null;
            while(current!=null){
                Entry<K, V> next = current.next;
                current.next = null;
                current = next;
            }
        }
        size=0;
    }

    private int getBucketIndex(K key){
        return Math.abs(key.hashCode() % entries.length);
    }
    public int size(){
        return size;
    }
    public V get(K key){

        int index = getBucketIndex(key);
        Entry<K, V> existing = entries[index];
        if(existing==null){
            return null;
        }
        if (existing.key.equals(key)){
            return existing.value;
        } else {
            while(existing.next!=null){
                if(existing.key.equals(key)){
                    return existing.value;
                }
                existing = existing.next;
            }

        }
        return null;
    }
    private static class Entry<K, V>{
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
