/**
 * Created by smit on 11/1/22.
 */

//program Stack using Array

public class Stack1 {
    int capacity;
    int a[];
    int top;

    public Stack1(int size) {
        this.capacity = size;
        top = -1;
        a = new int[capacity];
    }

    void addElement(int data) throws Exception
    {

        if (top == capacity - 1)
        {
            throw new ArrayIndexOutOfBoundsException();
        }

        else
        {
            top++;
            a[top] = data;
        }
    }

    void removeElement() throws Exception
    {

        if (top == -1)
        {
            throw new NullPointerException();
        }

        else
        {
            int result = a[top];
            top--;
        }
    }

    void search(int value)
    {
        while (top <= capacity-1)
        {
            if (a[top] == value) {
                System.out.println(a[top] + " Found at position: " + top);
                break;
            }

            top++;
        }
    }

    void display() {
        System.out.println(a[top]);
    }

    public static void main(String[] args) {
        Stack1 s = new Stack1(4);

        try {

            s.addElement(2);
            s.addElement(3);
            s.addElement(4);
            s.addElement(5);

            s.display();

            s.removeElement();
            s.display();

            s.search(5);
        }

        catch (Exception e)
        {
            System.out.println("Stack is full>>>>>>>");
        }

    }
}