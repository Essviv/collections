package com.cmcc.syw;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by sunyiwei on 16/4/13.
 */
public class Utils {
    public static Collection<String> randomCollection() {
        Collection<String> collection = new LinkedList<String>();
        final int COUNT = 1000;
        for (int i = 0; i < COUNT; i++) {
            collection.add(randStr(10));
        }

        return collection;
    }

    public static String randStr(int length) {
        StringBuilder sb = new StringBuilder();

        Random r = new Random();
        for (int i = 0; i < length; i++) {
            sb.append((char) ('a' + r.nextInt(26)));
        }

        return sb.toString();
    }

    public static void accessList(List list, int count, String name) {
        long current = System.currentTimeMillis();

        Random random = new Random();
        int size = list.size();

        for (int i = 0; i < count; i++) {
            int index = random.nextInt(size);
            list.get(index);
        }

        System.out.format("Accessing %s list %d times takes %#.2f seconds. %n", name, count,
                ((double) System.currentTimeMillis() - current) / 1000.);
    }
}
