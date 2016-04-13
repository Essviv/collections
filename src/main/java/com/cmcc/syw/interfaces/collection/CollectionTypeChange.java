package com.cmcc.syw.interfaces.collection;

import java.util.*;

import static com.cmcc.syw.Utils.randStr;

/**
 * demo to change collection type
 * <p/>
 * Created by sunyiwei on 16/4/13.
 */
public class CollectionTypeChange {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<String>();

        final int COUNT = 100;
        for (int i = 0; i < COUNT; i++) {
            strings.add(randStr(10));
        }
        strings.add(strings.get(0));

        Set<String> stringSet = new HashSet<String>(strings);

        System.out.println("Size = " + stringSet.size());

        strings.add(randStr(10));

        System.out.println("Size = " + stringSet.size());
        System.out.println(stringSet);
    }
}
