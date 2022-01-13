
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by smit on 12/1/22.
 */
//program to implement comparator

class Movie
{

    private String name;
    private int duration;
    private  int rating;

    Movie(String name, int duration, int rating)
    {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    public String getName()
    {
        return name;
    }

    int getDuration()
    {

        return duration;
    }

    int getRating()
    {
        return rating;
    }


    static class DurationCompare implements Comparator<Movie>
    {
        @Override
        public int compare(Movie o1, Movie o2) {

            if (o1.getRating() < o2.getRating())
            {
                return -1;
            }

            if (o1.getRating() > o2.getRating())
            {
                return 1;
            }

            else
            {
                return 0;
            }
        }
    }

    static class RatingCompare implements Comparator<Movie>
    {
        public int compare(Movie m1, Movie m2)
        {
            if (m1.getRating() < m2.getRating())
            {
                return -1;
            }

            if (m1.getRating() > m2.getRating())
            {
                return 1;
            }

            else
            {
                return 0;
            }
        }
    }


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                '}';
    }
}

public class Collection10
{

    public static void main(String[] args) {

        ArrayList<Movie> a = new ArrayList<Movie>();

        a.add(new Movie("abv", 3, 4));
        a.add(new Movie("adm", 4,5));
        a.add(new Movie("wes", 3, 2));


        Collections.sort(a, new Movie.DurationCompare().thenComparing(Movie::getRating));


        //Comparator<Movie> m = Comparator.comparing(Movie::getDuration).thenComparing(Movie::getRating);
        //Collections.sort(a, m);

        System.out.println("Compared by duration");

        for (Movie obj : a)
        {
            System.out.println(obj.getName()+" "+obj.getDuration()+" "+obj.getRating());
        }


        System.out.println("\nCompared by name");

        Collections.sort(a, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Movie obj1 : a)
        {
            System.out.println(obj1.getName()+" "+obj1.getDuration()+" "+obj1.getRating());
        }


    }
}
