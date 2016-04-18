package com.cmcc.syw.implement.queue;

import org.apache.commons.lang.math.NumberUtils;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * demo to use priorityQueue
 * <p>
 * Created by sunyiwei on 16/4/17.
 */
public class UsePriorityQueue {
    private static final int COUNT = 10;

    public static void main(String[] args) {
        Queue<String> queue = build(COUNT);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    private static Queue<String> build(int count) {
        Queue<String> queue = new PriorityQueue<>((Comparator<String>) (o1, o2) -> {
            int firstValue = NumberUtils.toInt(o1.substring(o1.lastIndexOf("_") + 1));
            int secondValue = NumberUtils.toInt(o2.substring(o2.lastIndexOf("_") + 1));

            return firstValue - secondValue;
        });

        for (int i = count - 1; i >= 0; i--) {
            queue.add("hello_world_" + i);
        }

        return queue;
    }
}
