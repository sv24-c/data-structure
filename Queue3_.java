/**
 * Created by smit on 14/1/22.
 */

//Program to implement Circuler Queue

public class Queue3_
{
    static class Node
    {
        int data;
        Node next;
    }

    static class Queue
    {
        Node front, rear;
    }

    static void enQueue(Queue q, int data)
    {
        Node newNode = new Node();

        newNode.data = data;

        if (q.front == null)
        {
           q.front = newNode;
        }

        else
        {
            q.rear.next = newNode;
        }

        q.rear = newNode;
        q.rear.next = q.front;
    }

    static int deQueue(Queue q)
    {
        if (q.front == null)
        {
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }

        int value;
        if (q.front == q.rear)
        {
            value = q.front.data;

            q.front = null;
            q.rear = null;
        }

        else
        {
            Node newNode = q.front;
            value = newNode.data;

            q.front = q.front.next;
            q.rear.next = q.front;
        }
        return value;

    }

    static void display(Queue q)
    {
        Node newNode  = q.front;

        System.out.println("ELements in Circuler Queue are: ");
        while (newNode.next != q.front)
        {
            System.out.print(newNode.data);
            newNode = newNode.next;
        }
        System.out.println(newNode.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.front = q.rear = null;

        enQueue(q, 2);
        enQueue(q, 5);
        enQueue(q, 8);
        enQueue(q, 1);
        enQueue(q, 9);

        display(q);

        System.out.println("Deleted elements are"+ deQueue(q));

        System.out.println();
        display(q);


    }
}
