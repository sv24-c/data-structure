import javax.xml.soap.Node;
import java.util.Scanner;

/**
 * Created by smit on 10/1/22.
 */

//Program to create and display a singly linked list

public class SinglyLinkedList1
{

    class Node {

        Node next;
        int data;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public Node head=null;
    public Node tail=null;

    public void addNode(int data)
    {

        Node newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }

        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display()
    {
        Node current = head;

        if (head==null)
        {
            System.out.println("Linked List is empty");
            return;
        }

        while (current != null)
        {
            System.out.println(current.data);
            current=current.next;
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        SinglyLinkedList1 sl = new SinglyLinkedList1();

        Scanner s= new Scanner(System.in);
        System.out.println("Enter element");
        int a=s.nextInt();

        sl.addNode(a);
        sl.addNode(3);
        sl.addNode(5);

        sl.display();
    }
}
