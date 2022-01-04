import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by smit on 31/12/21.
 */
class BfsGraph {
/*
    private int V;
    private LinkedList<Integer> adj[];

    BfsGraph(int v) {
        V = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }

    }
        //fun to add edge into graph

        void addEdge(int v, int w){
                adj[v].add(w);
        }

        //print traversal

        void BFS(int s){

            //mark vertices as not visited
            boolean visited[] = new boolean[V];

            //create a queue
            LinkedList<Integer> queue = new LinkedList<Integer>();

            visited[s]=true;
            queue.add(s);

            while (queue.size() !=0)
            {
                //dequeue vertex and print it
                s=queue.poll();
                System.out.println(s+" ");

                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext())
                {
                    int n= i.next();
                    if (!visited[n])
                    {
                        visited[n]=true;
                        queue.add(n);
                    }
                }
            }

        }

        public static void main(String[] args) {

                BfsGraph b = new BfsGraph(4);

                b.addEdge(0,1);
                b.addEdge(0,2);
                b.addEdge(1,2);
                b.addEdge(2,0);
                b.addEdge(2,3);
                b.addEdge(3,3);

                b.BFS(1);
        }
*/

    private int V;
    private LinkedList<Integer> adj[];

    BfsGraph(int v) {
        V = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }
        void addEdge(int v, int w)
        {
            adj[v].add(w);
        }

        void BFS(int s)
        {
            boolean visited[]= new boolean[V];
            LinkedList<Integer> queue = new LinkedList<Integer>();

            visited[s]=true;
            queue.add(s);

            while (queue.size()!=0)
            {
                s=queue.poll();
                System.out.println(s+" ");

                Iterator<Integer> i = adj[s].listIterator();

                while (i.hasNext())
                {
                    int n = i.next();
                    if (!visited[n])
                    {
                        visited[n]=true;
                        queue.add(n);
                    }
                }
            }
        }

    public static void main(String[] args) {

        BfsGraph g =new BfsGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
    }
}
