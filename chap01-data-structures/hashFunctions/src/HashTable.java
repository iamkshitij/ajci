import java.util.ArrayList;

public class HashTable {
    private ArrayList<HashEntry> bucket;
    private int slots;
    private int size;

    public HashTable(){
        bucket = new ArrayList<HashEntry>();
        slots = 10;
        size = 0;
        for (int i = 0; i < slots ; i++) {
            bucket.add(null);
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    private int getIndex(String key){

        int hashCode = key.hashCode();
        int index = hashCode % slots;

        if(index < 0)
            index = (index + slots) % slots;

        return index;
    }

    public void insert(String key, int value){
        // find the head of the chain
        int b_Index = getIndex(key);
        HashEntry head = bucket.get(b_Index);

        // check if key already exists
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Inserts key in chain
        size++;
        head = bucket.get(b_Index);
        HashEntry new_slot = new HashEntry(key,value);
        new_slot.next = head;
        bucket.set(b_Index,new_slot);

        // check if array > 60% of the arrays is filled.
        if((1.0*size)/slots >= 0.6){
            ArrayList<HashEntry> tmp = bucket;
            bucket = new ArrayList<>();
            slots = 2 * slots;
            size = 0;
            for (int i = 0; i < slots; i++)
                bucket.add(null);

            for (HashEntry head_node:
                 tmp) {
                while (head_node !=  null){
                    insert(head_node.key,head_node.value);
                    head_node = head_node.next;
                }
            }

        }

    }

    public int getValue(String key){
        // get head of the chain
        int b_index = getIndex(key);
        HashEntry head = bucket.get(b_index);

        // find the key
        while (head != null){
            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }
        return -1;
    }

    public int remove(String key){

        // get the head of the chain
        int b_index = getIndex(key);
        HashEntry head = bucket.get(b_index);

        HashEntry prev = null;

        while (head != null){
            if (head.key.equals(key))
                break;
            prev = head;
            head = head.next;
        }

        if (head == null)
            return 0;

        size--;

        if (prev != null)
            prev.next = head.next;
        else
            bucket.set(b_index, head);

        return head.value;
    }

}

