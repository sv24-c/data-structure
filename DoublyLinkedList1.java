/**
 * Created by smit on 10/1/22.
 */

//Program to insert a new node at the beginning, delete, search of the doubly linked list.
public class DoublyLinkedList1
{
    class Node
    {
        int data;
        Node privious, next;

        public Node(int data)
        {
            this.data=data;
        }
    }

    Node head,tail =null;

    public void addNode(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = tail = newNode;
            head.privious = null;
            tail.next = null;
        }

        else
        {
            head.privious = newNode;
            newNode.next = head;
            newNode.privious = null;
            head = newNode;
        }
    }

    public void delete()
    {
        if (head == null)
        {
            System.out.println("List is empty no need to delete");
        }

        else
        {
            if (head != tail)
            {
                head = head.next;
                head.privious = null;
            }

            else
            {
                head = tail = null;
            }
        }
    }

    void search(int value)
    {
        int i=1;
        boolean flag = false;

        Node curr = head;

        if (head == null)
        {
            System.out.println("List is empty");
        }

        while (curr != null)
        {
            if (curr.data == value)
            {
                flag = true;
                break;
            }
            curr = curr.next;
            i++;
        }
        if (flag)
        {
            System.out.println("Your node is present at posotion: "+i);
        }
        else
        {
            System.out.println("Your node is not present in list");
        }
    }

    public void display()
    {
        Node curr = head;

        if (head == null)
        {
            System.out.println("List is empty.");
        }

        while (curr !=null)
        {
            System.out.print(curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
    DoublyLinkedList1 dl = new DoublyLinkedList1();

        dl.addNode(1);
        dl.display();

        dl.addNode(2);
        dl.display();

        dl.addNode(3);
        dl.display();

        dl.search(3);
    }
}
