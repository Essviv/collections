package com.cmcc.syw.interfaces.set;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.*;

import static com.cmcc.syw.Utils.randStr;

/**
 * Created by sunyiwei on 16/4/13.
 */
public class SetTraverseOrder {
    public static void main(String[] args) {
        final int COUNT = 10;
        List<String> strings = new LinkedList<String>();
        for (int i = 0; i < COUNT; i++) {
            strings.add(randStr(10));
        }

        System.out.println("Note about the difference between insert order and traverse order:".toUpperCase());

        System.out.println("Insert order: " + strings);

        Set<String> hashSet = new HashSet<String>(strings);
        System.out.println("HashSet Traverse order: " + hashSet);

        Set<String> treeSet = new TreeSet<String>(strings);
        System.out.println("TreeSet Traverse order: " + treeSet);

        Set<String> linkedHashSet = new LinkedHashSet<String>(strings);
        System.out.println("LinkedHashSet Traverse order: " + linkedHashSet);
    }
}
