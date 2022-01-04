/**
 * Created by smit on 4/1/22.
 */
class QueueNode {

    /*
    int key;
    QueueNode next;

    //first we create constructor to create new linked list node

    void QueueNode(int key)
    {
        this.key=key;
        this.next=null; //at starting time next node will be null
    }

}

    //After that we need one class that will represent the our queue

class Que{
    QueueNode front, rear;

    public Que(QueueNode front, QueueNode rear)
    {
        this.front=null;
        this.rear=null ;
    }

    //after that we creating enqueue method which will insert the item

    void  enQueue(int key)
    {
        //we create new node of LinkedList
        QueueNode temp = new QueueNode(key);

    }
    */

    int front, rear;
    QueueNode node;

    void add(int item)
    {
        front=item;

    }

    public static void main(String[] args) {
        QueueNode obj=new QueueNode();
        obj.add(4);

        System.out.println(obj);
    }
}