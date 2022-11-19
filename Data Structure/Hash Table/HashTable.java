import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key);
        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
        }
        var bucket = entries[index];
        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        bucket.addLast(new Entry(key, value));
    }

    private int hash(int key) {
        return key % entries.length;
    }

    public String get(int key) {
//        var index = hash(key);
//        var bucket = entries[index];
//
//        if (bucket != null) {
//            for (var entry : bucket) {
//                if (entry.key == key) {
//                    return entry.value;
//                }
//            }
//        }
//        return null;

        var entry = getEntry(key);
        if (entry == null) {
            return null;
        }
        return entry.value;
    }

    public void remove(int key) {
//        var index = hash(key);
//        var bucket = entries[index];
//        if (bucket == null) {
//            throw new IllegalStateException();
//        }
//        for (var entry : bucket) {
//            if (entry.key == key) {
//                bucket.remove(entry);
//                return;
//            }
//        }
//        return;

        var entry = getEntry(key);
        if (entry == null) {
            throw new IllegalStateException();
        }
        getBucket(key).remove(entry);

    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private Entry getEntry(int key) {
//        var index = hash(key);
//        var bucket = entries[index];
        var bucket = getBucket(key);
        if (bucket == null) {
            return null;
        }
        for (var entry : bucket) {
            if (entry.key == key) {
                return entry;
            }
        }
        return null;
    }

}
