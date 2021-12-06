package taskthree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Products {

     public static Map<String, String> createMap() {

        Map<String, String> map = new HashMap<>();
        map.put("яблуко", "фрукт");
        map.put("огірок", "овоч");
        map.put("помідор", "овоч");
        map.put("петрушка", "зелень");
        map.put("цибуля", "овоч");
        map.put("фета", "сир");
        map.put("апельсин", "фрукт");
        map.put("баклажан", "овоч");
        map.put("банан", "фрукт");
        map.put("картопля", "овоч");
        return map;
    }

    public static void removeDuplicate(Map<String, String> map) {

        Set<String> setNames = new HashSet<>();
        Set<String> duplicateNames = new HashSet<>();

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String name = pair.getValue();

            if (setNames.contains(name)){
                duplicateNames.add(name);
            }
            else {
                setNames.add(name);
            }
        }
        for (String name : duplicateNames){
            removeItemFromMap (map, name);
        }
        System.out.println(map);
        }

    public static void removeItemFromMap(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}