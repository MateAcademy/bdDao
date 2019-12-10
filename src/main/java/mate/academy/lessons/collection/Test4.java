package mate.academy.lessons.collection;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Sergey Klunniy
 */
public class Test4 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");

       queue.remove();
queue.poll();
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        queue.forEach(System.out::println);
    }
}
