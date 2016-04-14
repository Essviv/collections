package com.cmcc.syw.interfaces.sorted.set;

import java.util.SortedSet;
import java.util.TreeSet;

import static com.cmcc.syw.Utils.randStr;

/**
 * demo of range view operation of sortedSet
 *
 * Created by sunyiwei on 16/4/14.
 */
public class RangeView {
    private static final String HEAD_STR = "helloWorld";
    private static final String TAIL_STR = "essviv";

    public static void main(String[] args) {
        final int COUNT = 10;

        SortedSet<String> sortedSet = build(COUNT);
        System.out.println("SortedSet = " + sortedSet);

        SortedSet<String> rangeView = sortedSet.subSet(TAIL_STR, HEAD_STR);
        System.out.println("RangeView = " + rangeView);

        sortedSet.add("fine");
        System.out.println("SortedSet = " + sortedSet);
        System.out.println("RangeView = " + rangeView);

        sortedSet.remove(HEAD_STR);
        System.out.println("SortedSet = " + sortedSet);
        System.out.println("RangeView = " + rangeView);
    }

    private static SortedSet<String> build(int count){
        SortedSet<String> sortedSet = new TreeSet<String>();

        for (int i = 0; i < count; i++) {
           sortedSet.add(randStr(10));
        }

        sortedSet.add(HEAD_STR);
        sortedSet.add(TAIL_STR);

        return sortedSet;
    }
}
