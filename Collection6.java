import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by smit on 12/1/22.
 */

//program to syncronize arraylist
public class Collection6
{
    public static void main(String[] args)
    {
        List<String> l = new ArrayList<String>();

        l.add("Hellio");
        l.add("delio");
        l.add("aelio");
        l.add("celio");

        l = Collections.synchronizedList(l);

        synchronized (l)
        {
            Iterator<String> i = l.iterator();

            while (i.hasNext())
            {
                System.out.println(i.next());
            }
        }
    }
}
