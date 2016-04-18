package com.cmcc.syw.implement.map;

import com.cmcc.syw.Person;
import sun.misc.GC;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * demo of using weak hashMap
 * <p>
 * Created by sunyiwei on 16/4/17.
 */
public class UseWeakHashMap {
    public static void main(String[] args) {
        Map<Person, String> map = new WeakHashMap<>();
//        Map<Person, String> map = new HashMap<>();

        //construct a new person
        Person person = new Person("name", "hello_world");

        //make a weak reference to person obj
        map.put(person, "CHINA");
        System.out.println("Map size is " + map.size());

        //now make person to be GC
        person = null;
        System.gc();

        //check the map size again
        while (!map.isEmpty()) {
            System.out.println("Map is still not empty.");
            System.out.println("Person = " + map.get(person));
        }
    }
}
