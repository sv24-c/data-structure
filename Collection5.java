import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by smit on 12/1/22.
 */
public class Collection5
{
    public static void main(String[] args)
    {
        LinkedList<Integer> l = new LinkedList<Integer>();

        l.add(1);
        l.add(2);
        l.add(5);

        LinkedList<Integer> l1 = new LinkedList<Integer>();

        l1.add(4);
        l1.add(5);

        l.addAll(l1);
        l.push(6);
        l.addFirst(7);
        System.out.println(l);




        System.out.println(l.contains(2));
    }
}
