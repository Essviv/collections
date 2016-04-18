package com.cmcc.syw.implement.map;

import com.cmcc.syw.implement.set.Colors;
import javafx.scene.input.InputMethodTextRun;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/**
 * demo to use enumMap
 *
 * Created by sunyiwei on 16/4/16.
 */
public class UseEnumMap {
    public static void main(String[] args) {
        Map<Colors, Integer> map = new EnumMap<Colors, Integer>(Colors.class);

        int value = 0;
        Set<Colors> set = EnumSet.allOf(Colors.class);
        for (Colors colors : set) {
            map.put(colors, value++);
        }

        for (Map.Entry<Colors,Integer> colorsIntegerEntry : map.entrySet()) {
            System.out.format("%s: %s. %n", colorsIntegerEntry.getKey(), colorsIntegerEntry.getValue());
        }
    }
}
