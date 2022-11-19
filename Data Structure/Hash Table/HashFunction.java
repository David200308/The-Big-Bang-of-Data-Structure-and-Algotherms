import java.util.HashMap;
import java.util.Map;

public class HashFunction {
    public static void main(String[] args) {
//        Map<Integer, String> map_1 = new HashMap<>();
//        map_1.put(123456, "David");
//        System.out.println(hash(123456));

        Map<String, String> map_2 = new HashMap<>();
        map_2.put("123456-A", "David");
        System.out.println(hash("123456-A"));

        String str = "orange";
        System.out.println(str.hashCode());
    }

    public static int hash(String key) {
        int hash = 0;
        for (var ch : key.toCharArray()) {
            hash += ch;
        }
        return hash % 100; // table size <--- 100
    }

//    public static int hash(int number) {
//        return number % 100;
//    }
}
