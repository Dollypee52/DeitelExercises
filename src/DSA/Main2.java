package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {

      //queue = fifo, dequeue=remove, enqueue=add, linear data structure
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Dolapo");
        queue.offer("moses");
        queue.offer("musa");

//        System.out.println(queue.contains("musa"));
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());

        queue.poll();
        queue.poll();
        System.out.println(queue);


    }
}
