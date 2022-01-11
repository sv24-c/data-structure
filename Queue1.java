import javax.management.Query;

/**
 * Created by smit on 11/1/22.
 */
public class Queue1
{
    int front, rear, size, capacity;
    int a[];

    public Queue1(int capacity)
    {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity-1;
        a = new int[this.capacity];
    }

    boolean isFull(Queue1 queue1)
    {
        return (queue1.size == queue1.capacity);
    }

    boolean isEMpty(Queue1 queue1)
    {
        return (queue1.size == 0);
    }

    void enQueue(int item)
    {
        if (isFull(this))
        {
            return;
        }
        this.rear = (this.rear +1) % this.capacity;
        this.a[this.rear] = item;
        this.size = this.size + 1;

        System.out.println(item);
    }

    int deQueue()
    {
        if (isEMpty(this))
        {
            return Integer.MIN_VALUE;
        }

        int item = this.a[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    public static void main(String[] args)
    {
        Queue1 q = new Queue1(3);

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue()+" is dequeued");
    }
}
