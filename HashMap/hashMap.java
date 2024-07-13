package HashMap;
import java.util.HashMap;

import Strings.palindrom;

public class hashMap {
    public static void main(String[] args) {
        //create - O(1)
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        //Contains Key - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonasia"));

        //Rempove - O(1)
        System.out.println(hm.remove("Indonasia"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());
    }   
}
