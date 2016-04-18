package com.cmcc.syw.implement.map;

import java.util.*;

/**
 * demo to compare the processing efficiency of three different map implements
 *
 * Created by sunyiwei on 16/4/16.
 */
public class CompareMap {
    private static final int COUNT = 1000000;
    private static final String CONTENT = "Hello world";
    private static final String KEY_PREFIX = "Key_";

    public static void main(String[] args) {
        hashMap(COUNT);

        treeMap(COUNT);

        linkedHashMap(COUNT);
    }

    private static void hashMap(int count) {
        long current = System.currentTimeMillis();

        //insert COUNT entries
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            map.put(KEY_PREFIX + i, CONTENT);
        }

        //then traverse it
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //do nothing
        }

        System.out.format("Create and traverse %d entries with hashMap takes %#.2f seconds. %n",
                count, (double) (System.currentTimeMillis() - current) / 1000.);
    }

    private static void treeMap(int count) {
        long current = System.currentTimeMillis();

        //insert COUNT entries
        Map<String, String> map = new TreeMap<>();
        for (int i = 0; i < count; i++) {
            map.put(KEY_PREFIX + i, CONTENT);
        }

        //then traverse it
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //do nothing
        }

        System.out.format("Create and traverse %d entries with treeMap takes %#.2f seconds. %n",
                count, (double) (System.currentTimeMillis() - current) / 1000.);
    }

    private static void linkedHashMap(int count) {
        long current = System.currentTimeMillis();

        //insert COUNT entries
        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < count; i++) {
            map.put(KEY_PREFIX + i, CONTENT);
        }

        //then traverse it
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //do nothing
        }

        System.out.format("Create and traverse %d entries with linkedHashMap takes %#.2f seconds. %n",
                count, (double) (System.currentTimeMillis() - current) / 1000.);
    }
}
