/**
 * Created by smit on 4/1/22.
 */
public class Dijkastra {

   /* static int vertex=9;

    int[] dist=new int[];

    dist[vertex];

    int minDistance(int dist[], Boolean sptSet[])
    {
        int min=Integer.MAX_VALUE;
        int min_index= -1;


        for (int i=0;i<vertex;i++)
        {
            if (sptSet[vertex]==false && dist[vertex]<=min)
            {
                min=dist[vertex];
                min_index=vertex;
            }
        }

        return min_index;
    }

    void print(int dist[])
    {

        for (int i=0;i<vertex;i++)
        {
            System.out.println(i+" \t\t "+dist[i]);
        }
    }

    //here src is source vertex
    void dijkastra(int graph[][], int src)
    {
        int dist[]=new int[vertex];

        Boolean sptSet[] =new Boolean[vertex];

        for (int i=0;i<vertex;i++)
        {
            //initialize all vertices to infinite and vertex to unvisited
            dist[i]=Integer.MAX_VALUE;
            sptSet[i]=false;
        }

        dist[src]=0;

        for (int i=0;i<vertex-1;i++)
        {
            int edge= minDistance(dist,sptSet);

            sptSet[edge]=true;

            if (!sptSet[vertex] && graph[edge][vertex] !=0 && dist[edge]!=Integer.MAX_VALUE && dist[edge]+ graph[edge][vertex]<dist[vertex])
            {
                dist[vertex]=dist[edge]+graph[edge][vertex];
            }

        }
        print(dist);
    }


    public static void main(String[] args) {

        int graph[][]=new int[][]{{ 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };




        Dijkastra d= new Dijkastra();
        d.dijkastra(graph,0);

    }*/

}
