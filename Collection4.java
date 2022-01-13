/**
 * Created by smit on 12/1/22.
 */
import java.util.*;

public class Collection4
{
    public static void main(String[] args)
    {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(0,"jkl");
        m.put(9,"ghj");
        m.put(7,"dgt");

        for (Map.Entry e : m.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

        HashMap<Integer, String> hm = new HashMap<Integer,String>();
    }
}
