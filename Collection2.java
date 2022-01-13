import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by smit on 11/1/22.
 */
public class Collection2
{
    public static void main(String[] args)
    {
        HashSet<String> h = new HashSet<String>();

        h.add("asc");
        h.add("edsa");

        h.removeIf(str->str.contains("asc"));
        System.out.println(h);
    }
}
