/**
 * Created by smit on 11/1/22.
 */

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
public class Queue2
{
    Node front, rear = null;

    void enQueue(int data)
    {
        Node newNode = new Node(data);

        if (this.rear == null)
        {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    void deQueue()
    {
        if (front == null)
        {
            System.out.println("Empty");
            return;
        }

        Node newNode = front;
        front = front.next;
        

    }

}
