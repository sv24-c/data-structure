import com.sun.glass.ui.Size;

import java.util.*;

/**
 * Created by smit on 3/1/22.
 *
 */
class Queueq {

    public static void main(String[] args) {

        Queue<String> pq  = new PriorityQueue<String>();


        pq.add("a");
        pq.add("b");
        pq.add("c");

        System.out.println(pq);

        System.out.println(pq.peek());

    }
}
