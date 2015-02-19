public class HashMap{
    private static final int SIZE = 128;
    private HashEntry[] table;

    HashMap(){
        table = new HashEntry[SIZE];
    }

    public int get(int key){
        int index = hashCodeNew(key);
        if(table[index] != null){
            for(HashEntry entry : table[index]){
                if(entry.key == key){
                    return entry.value;
                }
            }
        }
        throw new NoSuchElementException("The key: \"" + key + "\" was not found in the map!");
    }

    public void put(int key, int value){
        int index = hashCodeNew(key);
        HashEntry hashEntry = new HashEntry(key, value);

        List<HashEntry> chain = table[index];
        if(chain == null){
            chain = new ArrayList<>();
        }

        Iterator<HashEntry> it = chain.iterator();
        while(it.hasNext()){
            if(it.next().key == key){
                it.remove();
                break;
            }
        }
        chain.add(hashEntry);
        table[index] = chain;
    }

    private int hashCodeNew(int h){
        return (h & Integer.MAX_VALUE) % hash.size();
    }
}



private class HashEntry{
    int key;
    int value;

    public HashEntry(int key, int value){
        this.key = key;
        this.value = value;
    }
}