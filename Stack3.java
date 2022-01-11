import java.util.Stack;

/**
 * Created by smit on 11/1/22.
 */
public class Stack3
{
    class Node
    {
        int data;
        Node next;

       /* public Node(int data)
        {
            this.data = data;
            this.next = null;
        }*/
    }

    Node top;

    Stack3()
    {
        this.top = null;
    }


    public void addElement(int x)
    {
        Node newNode = new Node();

        if (top == null)
        {
            System.out.println("Overflow");

        }

        newNode.data = x;
        newNode.next = top;
        top = newNode;
    }

    public void delete()
    {
        if (top == null)
        {
            System.out.println("Stack is underflow");
        }

        else
        {
            if (top.next != null)
            {
                top = top.next;
            }

            else
            {
                top.next = null;
            }
        }
    }

    public void display()
    {
        if (top == null)
        {
            System.out.println("Stack underflow");
        }

        else
        {
            Node newNode = top;

            while (newNode != null)
            {
                System.out.print(newNode.data);
                newNode = newNode.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Stack3 s = new Stack3();

        s.addElement(4);
        s.display();

        s.addElement(3);
        s.display();

        s.addElement(2);

        s.display();

        s.delete();
        s.display();
    }
}
