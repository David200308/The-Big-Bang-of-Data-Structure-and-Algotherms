import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main_with_import {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "David");
        map.put(2, "Tommy");
        map.put(3, "Mary");
        map.put(4, "Mosh");
        System.out.println(map);
        map.put(2, "Tom");
        System.out.println(map);
        map.remove(3);
        System.out.println(map);
        var get = map.get(2);
        System.out.println(get);
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Mosh"));
        map.put(3, "Alica");
        System.out.println(map);

        for (var item : map.keySet()) {
            System.out.println(item);
        }

        System.out.println("---------------------------------");
        System.out.println("Char Finder: ");
        System.out.print("Find First Non Repeating Char --> ");
        String sentence = "a green apple";
        CharFinder finder = new CharFinder();
        var result_1 = finder.findFirstNonRepeatingChar(sentence);
        System.out.println(result_1);

        System.out.print("Find First Repeating Char --> ");
        var result_2 = finder.findFirstRepeatedChar(sentence);
        System.out.println(result_2);
    }

}
