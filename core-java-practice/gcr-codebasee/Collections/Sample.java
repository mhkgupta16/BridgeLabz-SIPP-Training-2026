 import java.util.*;

public class Sample {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(10);
        deque.addLast(20);
            System.out.println(deque);

        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);
    }
} 
