package com.cmcc.syw.implement.set;

import java.util.EnumSet;

/**
 * demo to use enumSet
 * <p>
 * Created by sunyiwei on 16/4/16.
 */
public class UseEnumSet {
    public static void main(String[] args) {
        EnumSet<Colors> enumSet = EnumSet.allOf(Colors.class);
        EnumSet<Colors> warmColors = EnumSet.of(Colors.YELLOW, Colors.RED);
        EnumSet<Colors> complementColors = EnumSet.complementOf(warmColors);
        EnumSet<Colors> range = EnumSet.range(Colors.GREEN, Colors.CYAN);

        System.out.println(enumSet);
        System.out.println(warmColors);
        System.out.println(complementColors);
        System.out.println(range);
    }
}
