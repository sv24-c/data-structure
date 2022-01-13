import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by smit on 11/1/22.
 */
public class Collection3
{
    public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<String>();

        a.add("abc");
        a.add("dcn");
        a.add("wea");

        HashSet<String> hs = new HashSet<String>(a);
        hs.add("ask");

        Iterator<String> it = hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
