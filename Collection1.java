import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * Created by smit on 11/1/22.
 */
public class Collection1
{
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("smit");
        ll.add("sst");
        ll.add("awe");

        String[] ar = ll.toArray(new String[ll.size()]);
        System.out.println("Print: "+ Arrays.toString(ar));
        System.out.println(ll);

        Iterator i =ll.descendingIterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }

        List<Integer> l = new  ArrayList<Integer>();
        List<Integer> l2= new LinkedList<Integer>();
    }
}
