import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by smit on 12/1/22.
 */
//Program to add user defined class object sort with comparable

class Student implements Comparable<Student>
{
    public String name;

    public Student(String name)
    {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}

public class Collection9
{
    public static void main(String[] args)
    {
        ArrayList<Student> a = new ArrayList<Student>();

        a.add(new Student("smit"));
        a.add(new Student("amit"));
        a.add(new Student("raj"));

        Collections.sort(a);

        for (Student s : a)
        {
            System.out.println(s.name);
        }
    }
}
