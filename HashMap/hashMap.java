package HashMap;
import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //Get
        int population = hm.get("India");
        System.out.println(population);
    }   
}
