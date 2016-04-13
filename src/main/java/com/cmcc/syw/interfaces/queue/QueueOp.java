package com.cmcc.syw.interfaces.queue;

import java.util.LinkedList;
import java.util.Queue;

import static com.cmcc.syw.Utils.randStr;

/**
 * Created by sunyiwei on 16/4/13.
 */
public class QueueOp {
    public static void main(String[] args) {
        final int COUNT = 1000;

        Queue<String> queue = build(COUNT);

        //peek
        peek(queue);

        //element
        element(queue);

        //remove
        remove(queue);

        //poll
        queue = build(COUNT);
        poll(queue);
    }

    private static void poll(Queue queue) {
        int size = queue.size();

        System.out.println("Before poll: " + size);

        for (int i = 0; i < size; i++) {
            queue.poll();
        }

        System.out.println("After poll: " + queue.size());
    }

    private static void remove(Queue queue) {
        int size = queue.size();

        System.out.println("Before remove: " + size);

        for (int i = 0; i < size; i++) {
            queue.remove();
        }

        System.out.println("After remove: " + queue.size());
    }

    private static void peek(Queue queue) {
        int size = queue.size();

        System.out.println("Before peek: " + size);

        for (int i = 0; i < size; i++) {
            queue.peek();
        }

        System.out.println("After peek: " + queue.size());
    }

    private static void element(Queue queue) {
        int size = queue.size();

        System.out.println("Before element: " + size);

        for (int i = 0; i < size; i++) {
            queue.element();
        }

        System.out.println("After element: " + queue.size());
    }

    private static Queue build(int count) {
        Queue<String> queue = new LinkedList<String>();
        for (int i = 0; i < count; i++) {
            queue.offer(randStr(10));
        }

        return queue;
    }
}
