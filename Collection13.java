import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by smit on 13/1/22.
 */

//Collections Method

class Employee implements Comparable<Employee>
{
    String name;
    int age;
    double salary;


    public Employee(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }

    static class nameCompare implements Comparator<Employee>
    {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class ageCompare implements Comparator<Employee>
    {

        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getAge() < o2.getAge())
            {
                return -1;
            }

            if (o1.getAge() > o2.getAge())
            {
                return 1;
            }
            else {
                return 0;
            }
        }
    }

    static class salaryCompare implements Comparator<Employee>
    {

        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getSalary() <= o2.getSalary())
            {
                return 1;
            }
            else {
                return -1;
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class Collection13
{
    public static void main(String[] args) {

    List<Employee> list = new ArrayList<>();

        list.add(new Employee("smit", 21, 10000.0));
        list.add(new Employee("raj", 27, 23000.0));
        list.add(new Employee("bhautik", 20, 20000.0));
        list.add(new Employee("anand", 22, 30000.0));

        //Collections.sort(a);
        Collections.sort(list , Collections.reverseOrder());
        for (Employee s: list)
        {
            System.out.println(s);
        }

        System.out.println("after comparing that:  ");
        //List<Employee> age = list.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge)).collect(Collectors.toList());

        for (Employee s1: list)
        {
            System.out.println(s1.getName()+" "+s1.getAge()+" "+s1.getSalary());
        }

        Collections.sort(list);
    }
}
