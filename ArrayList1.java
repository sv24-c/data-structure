import java.util.ArrayList;
import java.util.List;

/**
 * Created by smit on 13/1/22.
 */
public class ArrayList1
{
    public static void main(String[] args)
    {
        int a[] = {1,3,2,1,4,10,2,3};

        int k = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++)
        {
            if (!list.contains(a[i]))
            {
                list.add(a[i]);
            }
            else
            {
                a[k++] = a[i];
            }
        }

        for (int i = 0; i < k; i++)
        {
            System.out.println(a[i]);
        }
    }
}
