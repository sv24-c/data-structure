/**
 * Created by smit on 14/1/22.
 */

// Program to implement simple queue

public class Queue1_
{
    class Node
    {
        int key;
        Node next;

        public Node(int key)
        {
            this.next = null;
            this.key = key;
        }
    }
    Node rear, front = null;

    public void enQueue(int data)
    {
        Node newNode = new Node(data);

        try {

            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        catch (Exception e)
        {
            e.getMessage();
        }
    }

    public void deQueue()
    {
        try {

            if (front == null) {
                System.out.println("Queue is empty...");
            }

            else
            {
                front = front.next;
            }

        }

        catch (Exception e)
        {
            e.getMessage();
        }

    }

    public void display()
    {
        if (rear == null)
        {
            System.out.println("Queue is empty");
        }

        else
        {
           front = rear.next;

        }
    }

    public static void main(String[] args) {

        Queue1_ q = new Queue1_();

        q.enQueue(2);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(7);

        System.out.println("Front node data is: "+q.front.key);

        System.out.println("Rear node data is: "+q.rear.key);


    }

}
