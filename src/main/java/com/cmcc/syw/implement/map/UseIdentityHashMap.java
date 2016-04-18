package com.cmcc.syw.implement.map;

import com.cmcc.syw.Person;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * demo of using identity hashMap
 *
 * Created by sunyiwei on 16/4/17.
 */
public class UseIdentityHashMap {
    public static void main(String[] args) {
        hashMap();

        identityHashMap();
    }

    //ordinary hashmap, duplicate obj is not allow
    private static void hashMap(){
        Map<Person, String> map =new HashMap<>();

        Person firstPerson = new Person("name", "hello_world");

        Person secondPerson = new Person("name", "hello_world");

        map.put(firstPerson, "good");
        map.put(secondPerson, "good");

        //now let's check
        System.out.println("Map size is " + map.size());
        System.out.println(map);
    }

    private static void identityHashMap(){
        Map<Person, String> map =new IdentityHashMap<>();

        Person firstPerson = new Person("name", "hello_world");

        Person secondPerson = new Person("name", "hello_world");

        map.put(firstPerson, "good");
        map.put(secondPerson, "good");

        //now let's check
        System.out.println("Map size is " + map.size());
        System.out.println(map);
    }
}
