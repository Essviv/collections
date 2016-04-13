package com.cmcc.syw.interfaces.set;

import java.util.HashSet;
import java.util.Set;

import static com.cmcc.syw.Utils.randStr;

/**
 * Created by sunyiwei on 16/4/13.
 */
public class SetOp {
    private static final int COMMON_COUNT = 10;
    private static final int DELTA_COUNT = 10;

    public static void main(String[] args) {
        diff();

        intersect();
    }

    private static Set<String> common(int count) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < count; i++) {
            set.add("Common_" + i);
        }

        return set;
    }

    private static Set<String> add(Set<String> set, int count) {
        for (int i = 0; i < count; i++) {
            set.add("Rand_" + randStr(10));
        }

        return set;
    }

    private static void diff() {
        Set<String> first = common(COMMON_COUNT);
        add(first, DELTA_COUNT);

        Set<String> second = common(COMMON_COUNT);
        add(second, DELTA_COUNT);

        first.removeAll(second);
        System.out.println("Diff result: " + first);
    }

    private static void intersect() {
        Set<String> first = common(COMMON_COUNT);
        add(first, DELTA_COUNT);

        Set<String> second = common(COMMON_COUNT);
        add(second, DELTA_COUNT);

        first.retainAll(second);
        System.out.println("Intersect result: " + first);
    }
}
