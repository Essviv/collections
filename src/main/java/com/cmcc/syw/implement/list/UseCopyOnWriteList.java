package com.cmcc.syw.implement.list;

import sun.font.FontRunIterator;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static com.cmcc.syw.Utils.randStr;

/**
 * demo to use copy on write list
 *
 * Created by sunyiwei on 16/4/16.
 */
public class UseCopyOnWriteList {
    public static void main(String[] args) {
        final int COUNT = 100;

        List<String> list = new CopyOnWriteArrayList<String>();
        for (int i = 0; i < COUNT; i++) {
            list.add(randStr(20));
        }

        //get a snapshot of list elements at this moment, its size should be COUNT
        Iterator iterator = list.iterator();

        //try to modify the list, debug to see the change of the underlying array.
        list.add(randStr(50));
        list.add(randStr(70));

        //now let's see what's going on
        System.out.println("List size: " + list.size());

        int index = 0;
        while(iterator.hasNext()){
            iterator.next();
            index++;
        }
        System.out.println("Index: " + index);
    }
}
