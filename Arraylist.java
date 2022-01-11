import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by smit on 31/12/21.
 */
public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(8);
        list.add(9);
        list.add(0);

        System.out.println(list);

        Iterator it= list.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println();
        //using for each() loop

        Collections.sort(list);
        for (int i: list)
        {
            System.out.println(i);
        }
    }
}
