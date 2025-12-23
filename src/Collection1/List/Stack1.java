package Collection1.List;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(20);
        stack.push(24);
        stack.push(55);
        stack.push(26);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.search(30));
        System.out.println(stack.search(55)); //return index the index 0 start from top stack
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());//exception Empty stack exception
//        System.out.println(stack.empty());
//        System.out.println(stack.elementAt(0));
//        System.out.println(stack.contains(20));

        System.out.println(stack);
//        System.out.println(stack.lastIndexOf(55,2));
        System.out.println(stack.removeFirst());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.removeLast());
        System.out.println(stack);


    }
}
