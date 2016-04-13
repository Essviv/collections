package com.cmcc.syw.interfaces.collection;

import java.util.Collection;

import static com.cmcc.syw.Utils.randomCollection;

/**
 * Created by sunyiwei on 16/4/13.
 */
public class ToArray {
    public static void main(String[] args) {
        Collection collection = randomCollection();

        Object[] strings = collection.toArray();
        for (Object string : strings) {
            System.out.println(string);
        }
    }
}
