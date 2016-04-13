package com.cmcc.syw.interfaces.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

import static com.cmcc.syw.Utils.randStr;
import static com.cmcc.syw.Utils.randomCollection;

/**
 * Created by sunyiwei on 16/4/13.
 */
public class TraverseCollection {
    public static void main(String[] args) {
        Collection<String> collection = randomCollection();

        //stream and aggregation
        traverseWithAggregation(collection);

        //forEach
        traverseWithForEach(collection);

        //iterator
        traverseWithIterator(collection);
    }

    private static void printNewLine() {
        System.out.println();
    }

    private static void traverseWithForEach(Collection<String> collection) {
        printNewLine();

        for (Object o : collection) {
            System.out.println(o);
        }
    }

    private static void traverseWithIterator(Collection<String> collection) {
        printNewLine();

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void traverseWithAggregation(Collection<String> collection) {
        printNewLine();

        collection.stream().forEach(new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
