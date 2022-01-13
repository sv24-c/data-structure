import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by smit on 12/1/22.
 */
public class Collection7
{
    public static void main(String[] args)
    {
        List<String> ll = new LinkedList<String>();

        ll.add("aela");
        ll.add("hela");
        ll.add("tela");
        ll.add("dela");

        ll = Collections.synchronizedList(ll);

        synchronized (ll)
        {
            for (String aLl : ll) {
                System.out.println(aLl);
            }
        }
    }
}
