/**
 * Created by smit on 14/1/22.
 */

//Program to implement Priority queue

public class Queue2_
{
    static class Node
    {
        int data;
        int priority;
        Node next;
    }

    static Node node = new Node();

    static Node newNode(int d, int p)
    {
        Node temp =new Node();

        temp.data = d;
        temp.priority = p;
        temp.next = null;

        return temp;
    }

    static int peek(Node head)
    {
        return head.data;
    }

    static Node pop(Node head)
    {
        Node temp = head;
        head = temp.next;
        return head;
    }

    static Node push(Node head, int d, int p)
    {
        Node start = head;
        Node temp = newNode(d,p);

        if (head.priority > p)
        {
           temp.next = head;
           head = temp;
        }

        else {

            while (start.next != null && start.next.priority < p)
            {
                start = start.next;
            }

            temp.next = start.next;
            start.next = temp;
        }
        return head;
    }

    static int isEmpty(Node head)
    {
        return head == null ? 1:0;
    }

    public static void main(String[] args) {
        Node q = newNode(5, 2);

        q = push(q, 3, 5);
        q = push(q, 2, 6);
        q = push(q, 8, 4);
        q = push(q, 7, 3);


        while (isEmpty(q) == 0) {
            System.out.printf("%d ", peek(q));
            q = pop(q);
        }
    }
}
