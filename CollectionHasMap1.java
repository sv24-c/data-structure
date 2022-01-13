import java.util.*;

/**
 * Created by smit on 13/1/22.
 */
public class CollectionHasMap1
{
    public static void main(String[] args)
    {
        int count=0;
        HashMap<Integer, String> map =new HashMap<>();

        map.put(1,"red");
        map.put(2,"white");
        map.put(3,"black");
        map.put(4,"yellow");
        map.put(5,"orange");

        for (Map.Entry entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
            count++;
        }

        System.out.println("\nNumber of key value pair is "+ count);

        System.out.println("Size of Hashmap is: "+map.size());

        HashMap<Integer, String> map1= new HashMap<>();

        map1.putAll(map);
        System.out.println(map1);

        map1.clear();
        System.out.println();
        System.out.println(map1.isEmpty());
        System.out.println(map1);


        System.out.println(map1 =(HashMap)map.clone());
        map1.remove(1);
        System.out.println(map1.containsValue("black"));

        Set set = map1.entrySet();
        System.out.println(set);

        String val = map1.get(1);
        System.out.println(val);

        Set keyset = map1.keySet();
        System.out.println(keyset);

        Collection view = map1.values();
        System.out.println(view);

        System.out.println(map.values());
    }
}
