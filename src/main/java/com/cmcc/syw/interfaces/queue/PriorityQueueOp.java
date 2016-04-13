package com.cmcc.syw.interfaces.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

import static com.cmcc.syw.Utils.randStr;

/**
 * Created by sunyiwei on 16/4/13.
 */
public class PriorityQueueOp {
    public static void main(String[] args) {
        final int COUNT = 1000;

        PriorityQueue<String> pq = new PriorityQueue<String>(COUNT,
                new Comparator<String>() {
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                });

        for (int i = 0; i < COUNT; i++) {
            pq.add(randStr(5));
        }

        System.out.println(pq);
    }
}
