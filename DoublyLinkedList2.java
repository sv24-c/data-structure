/**
 * Created by smit on 11/1/22.
 */

//Program to insert a new node at the end of doubly linked list

public class DoublyLinkedList2
{
    class Node
    {
        int data;
        Node previous,next;

        public Node(int data)
        {
            this.data=data;
        }
    }

    Node head,tail = null;

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
    }

    void display()
    {
        Node curr = head;

        if (head == null)
        {
            System.out.println("List is empty");
        }

        while (curr != null)
        {
            System.out.print(curr.data);
            curr=curr.next;
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        DoublyLinkedList2 d = new DoublyLinkedList2();

        d.addNode(2);
        d.display();

        d.addNode(9);
        d.display();

        d.addNode(6);
        d.display();

        d.addNode(7);
        d.display();
    }
}
