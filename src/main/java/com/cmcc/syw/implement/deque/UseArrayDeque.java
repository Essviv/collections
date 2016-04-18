package com.cmcc.syw.implement.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * demo to use array deque
 * <p>
 * Created by sunyiwei on 16/4/17.
 */
public class UseArrayDeque {
    public static void main(String[] args) {
        Deque<String> strings = new ArrayDeque(30);

        final int COUNT = 10;
        for (int i = 0; i < COUNT; i++) {
            strings.addFirst("first_" + i);
        }

        for (int i = 0; i < COUNT; i++) {
            strings.addLast("last_" + i);
        }


        for (int i = 0; i < COUNT; i++) {
            System.out.println(strings.pollFirst());
            System.out.println(strings.pollLast());
        }
    }

}
