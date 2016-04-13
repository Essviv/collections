package com.cmcc.syw.interfaces.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.cmcc.syw.Utils.accessList;

/**
 * code to compare implement performance of two different list implement
 * <p>
 * Created by sunyiwei on 16/4/13.
 */
public class CompareListImpl {
    private static int ACCESS_COUNT = 1000000;
    private static String STRING = "hello world";

    public static void main(String[] args) {
        final int COUNT = 100000;

        //test array list
        arrayList(COUNT);

        //test linkedList
        linkedList(COUNT);
    }

    private static void arrayList(int count) {
        long current = System.currentTimeMillis();
        final String NAME = "arrayList";

        List<String> list = new ArrayList<String>(count);
        for (int i = 0; i < count; i++) {
            list.add(i, STRING);
        }

        System.out.format("Insert %s %d times takes %#.2f seconds.%n", NAME, count,
                ((double) System.currentTimeMillis() - current) / 1000.);

        accessList(list, ACCESS_COUNT, NAME);

        //force gc
        list.clear();
    }

    private static void linkedList(int count) {
        long current = System.currentTimeMillis();
        final String NAME = "linkedList";

        List<String> list = new LinkedList<String>();
        for (int i = 0; i < count; i++) {
            list.add(i, STRING);
        }

        System.out.format("Insert %s %d times takes %#.2f seconds.%n", NAME, count,
                ((double) System.currentTimeMillis() - current) / 1000.);

        accessList(list, ACCESS_COUNT, NAME);
    }


}
