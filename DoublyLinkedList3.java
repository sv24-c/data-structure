/**
 * Created by smit on 11/1/22.
 */

//Program to insert a new node at the middle of doubly linked list.

public class DoublyLinkedList3
{
    class Node
    {
        int data;
        Node previous,next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    Node head,tail = null;
    public int size = 0;

    void addNode(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }

        else
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
        size++;
    }

    void addInMiddle(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = tail =newNode;
            head.previous = null;
            tail.next = null;
        }

        else
        {
            Node curr = head, temp = null;

            int mid = (size % 2 ==0) ? (size/2) : ((size+1)/2);

            for (int i = 1;i<mid;i++)
            {
                curr = curr.next;
            }

            temp = curr.next;
            temp.previous = curr;

            curr.next = newNode;
            newNode.previous = curr;
            newNode.next = temp;
            temp.previous = newNode;
        }
        size++;
    }

    public void display()
    {
        Node curr = head;

        if (head == null)
        {
            System.out.println("List is empty");
        }

        while ( curr != null)
        {
            System.out.print(curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        DoublyLinkedList3 d = new DoublyLinkedList3();

        d.addNode(1);
        d.display();

        d.addNode(2);
        d.display();

        d.addInMiddle(3);
        d.display();

        d.addInMiddle(4);
        d.display();

        d.addInMiddle(5);
        d.display();
    }

}
