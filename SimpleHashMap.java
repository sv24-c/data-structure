import java.util.HashMap;
import java.util.Map;

/**
 * Created by smit on 31/12/21.
 */
class Hash{

    public static void main(String[] args) {

        //creating hashmap
        HashMap <Integer, String> map = new HashMap<Integer, String>();

        System.out.println("Initial hashmap: "+map);

        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");

        System.out.println("After creating map: "+map);

        for (Map.Entry e : map.entrySet())
        {
            System.out.println(e.getKey()+" , "+e.getValue());
        }

        System.out.println();


        map.put(4,"d");
        map.put(3,"e");

        System.out.println(map);

        for (Map.Entry e: map.entrySet())
        {
            System.out.println(e.getKey()+" , "+e.getValue());
        }

        map.remove(3);
        System.out.println(map);

        map.put(3,"c");
        System.out.println(map);

        map.replace(4,"e");
        System.out.println("\n"+map);
    }
}
