package com.cmcc.syw.implement.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * demo of using linkedList
 * <p>
 * Created by sunyiwei on 16/4/17.
 */
public class UseLinkedList {
    private static int COUNT = 10;

    public static void main(String[] args) {
        Queue<String> queue = build(COUNT);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    private static Queue<String> build(int count) {
        Queue<String> queue = new LinkedList<>();

        for (int i = count - 1; i >= 0; i--) {
            queue.add("Hello_World_" + i);
        }

        return queue;
    }
}
