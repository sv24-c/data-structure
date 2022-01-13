import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by smit on 13/1/22.
 */
public class ArrayList2
{
    public static void main(String[] args)
    {
        //int a[] = {1,1,1,2,2,3,3,3,3,4};
        int a[] = {1,1,2,3,3,3,4,4};
        int val=0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        /*for (int i=1;i<a.length;i++)
        {

            if (!(list.contains(a[i])))
            {
                list.add(a[i]);
                val=a[i];
            }

            *//*else if(!(list.equals(a[i])))
            {
                System.out.println(a[i]);
            }*//*
            //System.out.println(a[i]);
        }
        System.out.println(val);*/

        int j=0;
        for (int i=1;i<a.length;i++)
        {
            if (list1.contains(a[i]))
            {
                continue;
            }
        }
    }
}
