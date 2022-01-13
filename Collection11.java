import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by smit on 13/1/22.
 */
// program of Comparable

class Movie_ implements Comparable<Movie_>
{
    String name;
    int duration;
    int rating;

    public Movie_(String name, int duration, int rating)
    {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public int compareTo(Movie_ o)
    {
        return this.rating - o.rating;
    }

    public String getName()
    {
        return name;
    }

    public int getDuration()
    {
        return duration;
    }

    public int getRating()
    {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie_{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                '}';
    }
}

public class Collection11
{
    public static void main(String[] args) throws Exception
    {

        try {

            ArrayList<Movie_> m = new ArrayList<Movie_>();

            m.add(new Movie_("avenger", 4, 5));
            m.add(new Movie_("reva   ", 3, 5));
            m.add(new Movie_("man    ", 3, 4));
            m.add(new Movie_("json   ", 2, 3));

            Collections.sort(m);
            // System.out.println(    "Name    D R");

            for (Movie_ e : m) {
                System.out.println(e);
            }

            System.out.println();
            System.out.println("Movies after sorting: ");
            System.out.println("Name    D R");

            for (Movie_ e : m) {
                System.out.println(e.getName() + " " + e.getDuration() + " " + e.getRating());
            }

        }

        catch (Exception e)
        {
            System.out.println("Exception is throws: "+e);
        }

    }
}
