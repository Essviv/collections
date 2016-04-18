package com.cmcc.syw.implement.set;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import static com.cmcc.syw.Utils.randStr;

/**
 * demo to use copy on write set
 * <p>
 * Created by sunyiwei on 16/4/16.
 */
public class UseCopyOnWriteSet {
    public static void main(String[] args) throws InterruptedException {
        final int COUNT = 10;

        Set<String> strings = new CopyOnWriteArraySet<String>();
        for (int i = 0; i < COUNT; i++) {
            strings.add(randStr(10));
        }

        //get a snapshot on this moment, so the following write would has any effect on iteration
        Iterator<String> iterator = strings.iterator();

        Thread writeThread = new Thread(strings::clear);

        //wait the write thread to clear the set
        writeThread.start();
        writeThread.join();

        //now let's see whether the set is empty
        System.out.println("Is the set empty: " + strings.isEmpty());

        //ok, now let the iterator to traverse over the set, it should not be empty!
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
