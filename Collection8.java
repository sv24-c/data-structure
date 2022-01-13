import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.util.*;

/**
 * Created by smit on 12/1/22.
 */
public class Collection8
{
    public static void main(String[] args) {

        /*ArrayList<String> a = new ArrayList<String>();

        a.add("bcv");
        a.add("asd");
        a.add("zer");
        a.add("acf");

        //Collections.sort(a);
        Collections.sort(a , Collections.reverseOrder());
        for (String s: a)
        {
            System.out.println(s);
        }*/

        ArrayList aa = new ArrayList();

        aa.add(Integer.valueOf(21));
        aa.add(Integer.valueOf(12));
        aa.add(Integer.valueOf(34));

        Collections.sort(aa);


        Iterator i = aa.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }

        Collections.reverse(aa);
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

        Map<String, String> x = new HashMap<>(10, 0.85f);
        HashSet<String> h = new HashSet<>();
    }
}
