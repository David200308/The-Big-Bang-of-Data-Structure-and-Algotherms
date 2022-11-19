public class Main {
    public static void main(String[] args) {
        HashTable hashtable = new HashTable();
        hashtable.put(6, "A");
        hashtable.put(8, "B");
        hashtable.put(11, "C");
        hashtable.put(1, "A+");
        hashtable.put(8, "B+");
        var get = hashtable.get(8);
        System.out.println(get);
        hashtable.remove(6);
        var get_1 = hashtable.get(6);
        System.out.println(get_1);
    }
}
