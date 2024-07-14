package ArrayList;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        //Java Colleaction Framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add Operation
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9);//O(n)

        System.out.println(list);

        //Get Operation
        int element = list.get(2);
        System.out.println(element);

        //Delete Element
        list.remove(2);
        System.out.println(list);

        //Set Elements
        list.set(2,10);
        System.out.println(list);

        //Contais Elements
        System.out.println(list.contains(1));
        System.out.println(list.contains(12));

        System.out.println(list.size());
    }
}
 