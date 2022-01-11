/**
 * Created by smit on 11/1/22.
 */
public class CirculerLinkedList1
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

    Node head, tail = null;

    void addNode(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = tail = newNode;
            newNode.next = head;
        }

        else
        {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
            tail.next = head;
        }
    }

    public void delete()
    {
        if (head == null)
        {
            return;
        }

        else
        {
            if (head != tail)
            {
                head = head.next;
                tail.next = head;

            }

            else
            {
                head = tail = null;
            }
        }
    }

    public void display()
    {
        Node curr = head;

        if (head == null)
        {
            System.out.println("List is empty.");
        }

        do {
            System.out.print(curr.data);
            curr=curr.next;
        } while (curr != head);

        System.out.println();
    }

    public static void main(String[] args)
    {
        CirculerLinkedList1 c = new CirculerLinkedList1();

        c.addNode(1);
        c.display();

        c.addNode(2);
        c.display();

        c.addNode(3);
        c.display();

        c.addNode(4);
        c.display();

        c.delete();
        c.display();
    }

}
