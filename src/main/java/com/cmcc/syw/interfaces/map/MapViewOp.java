package com.cmcc.syw.interfaces.map;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.cmcc.syw.Utils.randMap;

/**
 * code to test map view operation
 * <p>
 * Created by sunyiwei on 16/4/13.
 */
public class MapViewOp {
    private static final int SPECIAL_KEY_COUNT = 10;
    private static final int ENTRY_COUNT = 10;

    public static void main(String[] args) {
        removeWithEntrySet();

        removeWithKeySet();

        retailSpecialEntrySet();
    }

    private static void retailSpecialEntrySet(){
        Map<String, String> firstMap = buildMap(ENTRY_COUNT, true);
        Map<String, String> secondMap = buildMap(ENTRY_COUNT, false);

        Set<Map.Entry<String, String>> firstEntrys = firstMap.entrySet();
        Set<Map.Entry<String, String>> secondEntrys = secondMap.entrySet();
        firstEntrys.retainAll(secondEntrys);

        System.out.println("After retain with special entry set, the map size is " + firstMap.size());
        System.out.println(firstMap);
    }

    private static void removeWithEntrySet() {
        Map<String, String> firstMap = buildMap(ENTRY_COUNT, true);
        Map<String, String> secondMap = buildMap(ENTRY_COUNT, false);

        Set<Map.Entry<String, String>> firstEntrys = firstMap.entrySet();
        Set<Map.Entry<String, String>> secondEntrys = secondMap.entrySet();
        firstEntrys.removeAll(secondEntrys);

        System.out.println("After remove with entry set, the map size is " + firstMap.size());
        System.out.println(firstMap);
    }

    private static void removeWithKeySet() {
        Map<String, String> map = buildMap(ENTRY_COUNT, true);

        Set<String> keySet = map.keySet();
        keySet.removeAll(specialKeySet(SPECIAL_KEY_COUNT));

        System.out.println("After remove with key set, the map size is " + map.size());
        System.out.println(map);
    }

    private static Map<String, String> buildMap(int count, boolean flag) {
        Map<String, String> map = randMap(count);
        addSpecialEntry(map);

        if (flag) {
            System.out.println("Original map size = " + map.size());
            System.out.println(map);
        }

        return map;
    }

    private static Set<String> specialKeySet(int count) {
        Set<String> keySet = new HashSet<String>();
        for (int i = 0; i < count; i++) {
            keySet.add("special_" + i);
        }

        return keySet;
    }

    //add special entrys into map to make test more convenient
    private static void addSpecialEntry(Map<String, String> map) {
        Set<String> keySet = specialKeySet(SPECIAL_KEY_COUNT);

        final String SPECIAL_VALUE = "HELLO WORLD";
        for (String s : keySet) {
            map.put(s, SPECIAL_VALUE);
        }
    }


}
