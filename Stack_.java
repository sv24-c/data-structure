import java.util.Stack;

/**
 * Created by smit on 3/1/22.
 */
public class Stack_ {


    static void stack_push(Stack<Integer> stack)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(stack.push(i));
        }
    }

    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos= stack.search(element);
        System.out.println("Search stack is:"+pos);
    }

    public static void main(String[] args) {

/*        Stack s1 =new Stack();

        s1.add(1);
        s1.add("a");

        System.out.println(s1);

        Stack<String> s=new Stack<String>();

        s.push("a");
        s.push("b");
        s.push("c");

        System.out.println(s);
        System.out.println(s.peek());
*/
        Stack<Integer> stack =new Stack<>();
        stack_push(stack);
        stack_search(stack, 3);
    }
}
