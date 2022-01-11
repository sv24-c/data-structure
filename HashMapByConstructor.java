import java.util.HashMap;
import java.util.Map;

/**
 * Created by smit on 31/12/21.
 */
class Book {

    int id;
    String name,aname;
    int price;

    Book(int id, String name, String aname, int price)
    {
        this.id=id;
        this.name=name;
        this.aname=aname;
        this.price=price;
    }

    public static void main(String[] args) {

        Map<Integer, Book> map = new HashMap<Integer, Book>();

        Book b1=new Book(1,"The fern", "su", 250);
        Book b2=new Book(2,"The hash", "hasy", 299);
        Book b3=new Book(3,"My book", "methor", 300);

        System.out.println("Initial map is: "+map);

        map.put(101, b1);
        map.put(102, b2);
        map.put(103, b3);

        System.out.println("After add to map: "+map);

        for (Map.Entry e : map.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }


        System.out.println("\n\n");

        for (Map.Entry<Integer, Book> entry: map.entrySet())
        {
            int key= entry.getKey();
            Book b = entry.getValue();
            System.out.println(key);
            System.out.println(b.id+" "+b.name+" " +b.aname+" "+ b.price);
        }
    }
}
